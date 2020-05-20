import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int sum = 0;
        int count = 0;
        
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
        }

//        System.out.println("sum: " + sum + ", count: " + count);
        double average = (double) sum / count;
        
        System.out.println(average);
    }
}
