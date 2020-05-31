import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String str = Integer.toString(number);

        if (str.length() < 4) {
            str = "00" + str;
        }

        if (str.charAt(0) != str.charAt(3) || str.charAt(1) != str.charAt(2)) {
            System.out.println(Integer.parseInt(str) + 1);
        } else {
            System.out.println(1);
        }

    }
}