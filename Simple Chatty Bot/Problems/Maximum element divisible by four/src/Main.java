import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        int divisibleFour = 0;
        
        for (int i = 0; i < number; i++) {
            int currentNum = scanner.nextInt();
            
            if (currentNum % 4 == 0 && currentNum > divisibleFour) {
                divisibleFour = currentNum;
            }
        }
        
        System.out.println(divisibleFour);
    }
}
