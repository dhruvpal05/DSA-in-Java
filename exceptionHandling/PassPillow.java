package exceptionHandling;

public class PassPillow {
    int passThePillow(int n, int time) {
        int cycleLength = n - 1; // The cycle length before it comes back to the start in the opposite direction
        int remainder = time % cycleLength;

        if ((time / cycleLength) % 2 == 0) {
            return remainder + 1;
        } else {
            return n - remainder;
        }
    }
}
