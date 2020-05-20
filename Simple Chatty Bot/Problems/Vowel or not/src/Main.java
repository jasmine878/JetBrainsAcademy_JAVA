import java.util.Scanner;

public class Main {

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
    
        public static boolean isVowel(char ch) {
        // write your code here
        char lowerChar = Character.toLowerCase(ch);

        if (lowerChar == 'a' || lowerChar == 'e' ||
                lowerChar == 'i' || lowerChar == 'o' ||
                lowerChar == 'u') {
            return true;
        } else {
            return false;
        }
    }
}
