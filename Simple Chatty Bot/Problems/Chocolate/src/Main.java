import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int area = scanner.nextInt();
        
        if (area % length == 0 && area <= width * length || area % width == 0 && area <= width * length) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
