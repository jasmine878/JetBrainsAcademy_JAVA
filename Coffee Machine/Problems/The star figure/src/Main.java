import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        int oddNum = scanner.nextInt();
        int midNum = oddNum / 2;
        
        //create the array
        String[][] twoDimArray = new String[oddNum][oddNum];
        
        //fill the array with "."
        //BUT fill the middle row with "*";
        for (int i = 0; i < oddNum; i++) {
            if (i == midNum) {
                Arrays.fill(twoDimArray[i], "*");
            } else {
                Arrays.fill(twoDimArray[i], ".");
            }
        }
        
        //go back and fill the middle column and diagonals with "*"
        for (int i = 0; i < oddNum; i++) {
            for (int j = 0; j < oddNum; j++) {
                if (j == midNum || i == j) {
                    twoDimArray[i][j] = "*";
                }
            }
        }

        //fill the 2nd diagonal with "*"
        int backwards = oddNum - 1;
        for (int i = 0; i < oddNum; i++) {
            twoDimArray[i][backwards] = "*";
            backwards--;
        }
        
        //print the array
        for (int i = 0; i < oddNum; i++) {
            System.out.println(String.join(" ", twoDimArray[i]));
        }
    }
}
