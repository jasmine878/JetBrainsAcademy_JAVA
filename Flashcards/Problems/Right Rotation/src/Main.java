import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        String[] arr = scanner.nextLine().split(" ");
        int size = arr.length;
        int rotation = scanner.nextInt() % size;
        String[] rotatedArr = new String[size];
        int shifts = 0;
        int shifts2 = 0;
        
        for (int i = 0; i < rotation; i++) {
            rotatedArr[i] = arr[size - rotation + shifts];
            shifts++;
        }
        
        for (int i = shifts; i < size; i++) {
            rotatedArr[i] = arr[0 + shifts2];
            shifts2++;
        }
        
        System.out.println(String.join(" ", rotatedArr));
    }
}
