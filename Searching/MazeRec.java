package Searching;
public class MazeRec {
    public static void main(String[] args) {
        System.out.println(maze(3, 3));
        
    }

    static int maze(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int right = maze(r, c-1);
        int down = maze(r-1, c);

        return right + down;
    }
}
