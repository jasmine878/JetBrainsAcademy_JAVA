import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        long largestValue = scanner.nextLong();
        int factorial = 0;
        double productSum = 1;
        
        do {
            factorial++;
            productSum *= factorial;
//            System.out.println("count: " + factorial + ", factorial: " + productSum);
        } while (productSum <= largestValue);
        
        System.out.println(factorial);
    }
}
