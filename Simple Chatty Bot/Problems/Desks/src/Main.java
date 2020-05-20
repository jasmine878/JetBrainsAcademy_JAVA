import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double room1 = scanner.nextInt();
        double room2 = scanner.nextInt();
        double room3 = scanner.nextInt();
        
        int num1 = (int) (Math.ceil(room1 / 2));
//        System.out.println("num1: " + num1);

        int num2 = (int) Math.ceil(room2 / 2);
//        System.out.println("num2: " + num2);

        int num3 = (int) Math.ceil(room3 / 2);
//        System.out.println("num3: " + num3);
        
        System.out.println(num1 + num2 + num3);
    }
}
