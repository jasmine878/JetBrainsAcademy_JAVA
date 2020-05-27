import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int currentNum = scanner.nextInt();
        
        while (currentNum != 0) {
            sum += currentNum;
            currentNum = scanner.nextInt();
        }
        
        System.out.println(sum);
    }
}
