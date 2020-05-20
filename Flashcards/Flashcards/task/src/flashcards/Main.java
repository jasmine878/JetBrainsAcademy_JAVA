package flashcards;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input the number of cards:");
        int number = scanner.nextInt();
        scanner.nextLine();
        
        String[] terms = new String[number];
        String[] definitions = new String[number];
        
        //create cards
        for (int i = 0; i < number; i++) {
            System.out.println("The card #" + (i + 1) + ":");
            terms[i] = scanner.nextLine();
            
            System.out.println("The definition of the card #" + (i + 1) + ":");
            definitions[i] = scanner.nextLine();
        }
        
        //iterate through the cards and check to see if the answers are a match or not
        for (int i = 0; i < number; i++) {
            System.out.println("Print the definition of \"" + terms[i] + "\":");
            String guess = scanner.nextLine();
            
            if (definitions[i].equals(guess)) {
                System.out.println("Correct answer.");
            } else {
                System.out.println("Wrong answer. The correct one is \"" + definitions[i] + "\".");
            }
        }
    
    }
}
