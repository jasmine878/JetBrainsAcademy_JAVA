import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            // start coding here
            int charAsNumber = reader.read();
            int count = 0;
            int previousChar = 32;

            while(charAsNumber != -1) {
//                System.out.println("charAsNumber: " + charAsNumber + ", previousChar: " + previousChar + " count: " + count);

                if (charAsNumber != 32 && previousChar == 32) {
//                    System.out.println("WE FOUND A WORD!!");
                    previousChar = charAsNumber;
                    count++;
                } else if (charAsNumber == 32) {
//                    System.out.println("we have a space");
                    previousChar = 32;
                } else {
//                    System.out.println("we have a character");
                    previousChar = charAsNumber;
                }
                charAsNumber = reader.read();
            }

            System.out.println(count);
        }
    }

}
