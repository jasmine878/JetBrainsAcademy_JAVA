import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int maxProduct = 0;
        
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                int currentProduct = arr[i] * arr[j];

                if (currentProduct > maxProduct) {
                    maxProduct = currentProduct;
                }
            }
        }
        
        System.out.println(maxProduct);
    }
}
