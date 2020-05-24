import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        String[][] spiralArr = new String[n][n];
        int maxNum = n * n;
        int count = 1;
        int edgeLength = n;
        int row = 0;
        int col = n - 1;
        int reverseRow = n - 1;
        int reverseCol = 0;
        
        while (count <= maxNum) {
            //fill row
            for (int i = row; i <= col; i++) {
                if (spiralArr[row][i] == null) {
                    spiralArr[row][i] = count + "";
                    count++;
                } else {
                    count++;
                }
            }
            row++;

            //fill column
            for (int i = row; i < edgeLength; i++) {
                if (spiralArr[i][col] == null) {
                    spiralArr[i][col] = count + "";
                    count++;
                }
            }
            col--;

            //fill reverse-row
            for (int i = edgeLength - 1; i >= 0; i--) {
                if (spiralArr[reverseRow][i] == null) {
                    spiralArr[reverseRow][i] = count + "";
                    count++;
                }
            }
            reverseRow--;

            //fill reverse-col
            for (int i = col; i >= row; i--) {
                if (spiralArr[i][reverseCol] == null) {
                    spiralArr[i][reverseCol] = count + "";
                    count++;
                }
            }
            reverseCol++;
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(String.join(" ", spiralArr[i]));
        }
    }
}
