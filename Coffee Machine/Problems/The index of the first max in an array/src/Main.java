import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int maxNum = 0;
        int maxIdx = 0;
        
        for (int i = 0; i < size; i++) {
            int currentNum = scanner.nextInt();

            if (currentNum > maxNum) {
                maxNum = currentNum;
                maxIdx = i;
            }
//            System.out.println("maxNum: " + maxNum + ", maxIdx: " + maxIdx);
        }
        
        System.out.println(maxIdx);
    }
}
