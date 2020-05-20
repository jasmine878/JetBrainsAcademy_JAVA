import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int bestCompany = 1;
        int highestTaxes = 0;
        int[] companies = new int[num];


        for (int i = 0; i < num; i++) {
            companies[i] = scanner.nextInt();
        }

        for (int i = 0; i < num; i++) {
            int currentTaxes = scanner.nextInt() * companies[i];
            
            if (currentTaxes > highestTaxes) {
                bestCompany = i + 1;
                highestTaxes = currentTaxes;
            }
//            System.out.println("bestCompany: " + bestCompany + ", highestTaxes: " + highestTaxes);
        }

        System.out.println(bestCompany);
    }
}
