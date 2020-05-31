import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int largestSequence = 0;
        int count = 0;
        int previous = 0;

        for (int i = 0; i < size; i++) {
            int currentNum = scanner.nextInt();

            if (currentNum >= previous) {
                count++;

                if (count > largestSequence) {
                    largestSequence = count;
                }
            } else {
                count = 1;
            }

            previous = currentNum;
        }

        System.out.println(largestSequence);
    }
}