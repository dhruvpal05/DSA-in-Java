package Arrays;

public class SeparateSq {
    public static void main(String[] args) {
        int[][] squares = { { 0, 0, 1 }, { 2, 2, 1 } };
        System.out.println(separateSquares(squares));
    }

    public static double separateSquares(int[][] squares) {
        double totalArea = 0;
        double minY = 0;
        double maxY = 0;

        for (int[] square : squares) {
            double side = square[2];
            totalArea += side * side;
            maxY = Math.max(maxY, square[1] + side);
        }

        double targetArea = totalArea / 2.0;
        double precision = 1e-5;

        while (maxY - minY > precision) {
            double midY = (minY + maxY) / 2;
            double lowerArea = 0;

            for (int[] square : squares) {
                double y1 = square[1];
                double side = square[2];
                double y2 = y1 + side;

                if (y2 <= midY) {
                    lowerArea += side * side;
                } else if (y1 < midY) {
                    lowerArea += (midY - y1) * side;
                }
            }

            if (lowerArea < targetArea) {
                minY = midY;
            } else {
                maxY = midY;
            }
        }

        return minY;
    }

}
