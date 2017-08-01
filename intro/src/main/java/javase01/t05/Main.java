package javase01.t05;

public class Main {

    private static final int SIZE = 25;

    public static void main(String[] args) {
        int [][] matrix = new int[SIZE][SIZE];
        int indexMax = SIZE - 1;
        for (int i = 0; i < SIZE; i++) {
            matrix[i][i] = 1;
            matrix[indexMax - i][i] = 1;
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}