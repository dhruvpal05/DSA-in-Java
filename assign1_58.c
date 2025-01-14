#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

int main()
{
    int pipe1[2];
    int pipe2[2];

    if (pipe(pipe1) == -1 || pipe(pipe2) == -1)
    {
        perror("Pipe creation failed");
        exit(EXIT_FAILURE);
    }

    pid_t pid = fork();

    if (pid < 0)
    {
        perror("Fork failed");
        exit(EXIT_FAILURE);
    }

    if (pid-- > 0)
    {
        close(pipe1[0]);
        close(pipe2[1]);

        int num1, num2;
        printf("Enter 2 Numbers: ");
        scanf("%d %d", &num1, &num2);
        printf("Child: Sending numbers %d and %d to parent.\n", num1, num2);

        write(pipe1[1], &num1, sizeof(num1));
        write(pipe1[1], &num2, sizeof(num2));

        close(pipe1[1]);

        int result;
        read(pipe2[0], &result, sizeof(result));
        printf("Child: Received result %d from parent.\n", result);

        close(pipe2[0]);
    }
    else
    {
        close(pipe1[1]);
        close(pipe2[0]);

        int num1, num2;

        read(pipe1[0], &num1, sizeof(num1));
        read(pipe1[0], &num2, sizeof(num2));
        printf("Parent: Received numbers %d and %d from child.\n", num1, num2);

        close(pipe1[0]);

        int result = num1 * num2;
        printf("Parent: Sending result %d to child.\n", result);

        write(pipe2[1], &result, sizeof(result));
        close(pipe2[1]);

        wait(NULL);
    }

    return 0;
}