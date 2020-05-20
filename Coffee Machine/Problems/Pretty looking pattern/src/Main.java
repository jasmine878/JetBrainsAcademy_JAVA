import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String[][] twoDimArray = new String[4][4];
        String isPretty = "YES";
        
        //fill the 2-dimensional array
        for (int i = 0; i < 4; i++) {
            twoDimArray[i] = scanner.nextLine().split("");
        }
        
        //find 2x2 matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (twoDimArray[i][j].equals(twoDimArray[i][j + 1]) && 
                    twoDimArray[i][j].equals(twoDimArray[i + 1][j]) &&
                    twoDimArray[i][j].equals(twoDimArray[i + 1][j + 1])) {
                        isPretty = "NO";
                        break;
                }
            }
        }
        
        System.out.println(isPretty);
    }
}
