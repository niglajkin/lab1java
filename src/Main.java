public class Main {
    public static void main(String[] args) {
        try {
            final int rows = 3;
            final int columns = 4;

            final float constant = 2.5f;

            final int c5 = 0;
            final int c7 = 6;
            final int c11 = 10;

            System.out.println("C5 = " + c5);
            System.out.println("C7 = " + c7);
            System.out.println("C11 = " + c11);
            System.out.println();

            float[][] matrixA = {
                    {1.0f, 2.0f, 3.0f, 4.0f},
                    {5.0f, 6.0f, 7.0f, 8.0f},
                    {9.0f, 10.0f, 11.0f, 12.0f}
            };

            System.out.println("Matrix A:");
            printMatrix(matrixA);
            System.out.println();

            float[][] matrixC = new float[rows][columns];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrixC[i][j] = matrixA[i][j] + constant;
                }
            }

            System.out.println("Matrix C (A + constant):");
            printMatrix(matrixC);
            System.out.println();

            float sum = 0.0f;
            int elementsCount = rows * columns;

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    sum += matrixC[i][j];
                }
            }

            float average = sum / elementsCount;

            System.out.println("Average value of all elements in matrix C:");
            System.out.println(average);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }

    private static void printMatrix(float[][] matrix) {
        for (float[] row : matrix) {
            for (float value : row) {
                System.out.printf("%8.2f", value);
            }
            System.out.println();
        }
    }
}
