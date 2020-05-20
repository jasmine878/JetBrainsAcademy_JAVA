import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int triples = 0;

        if (size < 3) {
            System.out.println(triples);
            return;
        }

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

//        System.out.println("num1: " + num1 + ", num2: " + num2 + ",triples: " + triples);
        for (int i = 2; i < size; i++) {
            int current = scanner.nextInt();
            
            if (current - num2 == 1 && num2 - num1 == 1) {
                triples++;
            }

//            System.out.println("num1: " + num1 + ", num2: " + num2 + ", num3: " + current + ",triples: " + triples);
            num1 = num2;
            num2 = current;
        }

        System.out.println(triples);
    }
}
