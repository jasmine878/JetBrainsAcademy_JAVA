import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] twoDimArray = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                twoDimArray[i][j] = scanner.nextInt();
            }
        }

        int col1 = scanner.nextInt();
        int col2 = scanner.nextInt();
        int col1Val;
        int col2Val;

        for (int i = 0; i < rows; i++) {
            col1Val = twoDimArray[i][col1];
            col2Val = twoDimArray[i][col2];

            twoDimArray[i][col1] = col2Val;
            twoDimArray[i][col2] = col1Val;
        }

        printArray(twoDimArray, rows, cols);
    }

    public static void printArray(int[][] arr, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j < cols - 1) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}
