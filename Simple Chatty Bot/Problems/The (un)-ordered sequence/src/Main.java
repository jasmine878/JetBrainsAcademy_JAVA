import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int previousNum = scanner.nextInt();
        int currentNum = scanner.nextInt();
        boolean result = true;
        String order = "ascending";

        if (previousNum - currentNum > 0) {
            order = "descending";
        }
        
        while (true) {
//            System.out.println("previousNum: " + previousNum + " currentNum: " + currentNum);

            if (currentNum == 0) {
                break;
            }
            if ("ascending".equals(order) && previousNum - currentNum > 0) {
                result = false;
                break;
            }
            if ("descending".equals(order) && previousNum - currentNum < 0) {
                result = false;
                break;
            }
            previousNum = currentNum;
            currentNum = scanner.nextInt();
        }
        
        System.out.println(result);
    }
}
