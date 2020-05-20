import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        String str = scanner.nextLine();
        String[] words = str.split(" ");
        boolean inOrder = true;
        
        for (int i = 0; i < words.length - 1; i++) {
            int compareValue = words[i].compareTo(words[i + 1]);
//            System.out.println("compareValue: " + compareValue);

            if (compareValue > 0) {
                inOrder = false;
                break;
            }
        }
        
        System.out.println(inOrder);
    }
}
