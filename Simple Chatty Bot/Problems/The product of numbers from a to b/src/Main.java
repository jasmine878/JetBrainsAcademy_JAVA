import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        int startInc = scanner.nextInt();
        int endExc = scanner.nextInt();
        long product = 1;
        
        for (int i = startInc; i < endExc; i++) {
            product *= i;
//            System.out.println("i is: " + i + ", product is: " + product);
        }
        
        System.out.println(product);
    }
}
