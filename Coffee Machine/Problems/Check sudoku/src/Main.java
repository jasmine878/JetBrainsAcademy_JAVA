import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int squared = size * size;
        String solved = "YES";
        
        //create a 2-dimensional array
        int[][] twoDimArray = new int[squared][squared];
        
        //fill the 2-dimensional array
        for (int i = 0; i < squared; i++) {
            for (int j = 0; j < squared; j++) {
                twoDimArray[i][j] = scanner.nextInt();
            }
        }
        
        //a solved sudoko meets 3 conditions
        
        //1. verify that each row has unique numbers from 1 to n^2
        for (int i = 0; i < squared; i++) {

            //create a row template to compare
            ArrayList<Integer> allNumbers = new ArrayList<>();
            for (int num = 1; num <= squared; num++) {
                allNumbers.add(num);
            }

            for (int j = 0; j < squared; j++) {
//                System.out.println("currentRow: " + Arrays.toString(allNumbers.toArray()));
//                System.out.println("row: " + i + " col: " + j + " num: " + twoDimArray[i][j] + " solved: " + solved);
                if (allNumbers.contains(twoDimArray[i][j])) {
                    allNumbers.remove(Integer.valueOf(twoDimArray[i][j]));
                } else {
                    solved = "NO";
                    System.out.println(solved);
                    return;
                }
            }
        }


//        2. verify each column has unique numbers from 1 to n^2
        for (int i = 0; i < squared; i++) {

            //create a row template to compare
            ArrayList<Integer> allNumbers = new ArrayList<>();
            for (int num = 1; num <= squared; num++) {
                allNumbers.add(num);
            }

            for (int j = 0; j < squared; j++) {
//                System.out.println("currentRow: " + Arrays.toString(allNumbers.toArray()));
//                System.out.println("row: " + i + " col: " + j + " num: " + twoDimArray[i][j] + " solved: " + solved);
                if (allNumbers.contains(twoDimArray[j][i])) {
                    allNumbers.remove(Integer.valueOf(twoDimArray[j][i]));
                } else {
                    solved = "NO";
                    System.out.println(solved);
                    return;
                }
            }
        }


        //3. each square has unique numbers
        int iteration = 0;

        while (iteration < size) {
            //create a row template to compare
            ArrayList<Integer> allNumbers = new ArrayList<>();
            for (int num = 1; num <= squared; num++) {
                allNumbers.add(num);
            }

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    int newI = i + size * iteration;
                    int newJ = j + size * iteration;
//                    System.out.println("currentRow: " + Arrays.toString(allNumbers.toArray()));
//                    System.out.println("row: " + newI +
//                                        " col: " + newJ +
//                                        " num: " + twoDimArray[newI][newJ] +
//                                        " solved: " + solved);

                    if (allNumbers.contains(twoDimArray[newI][newJ])) {
                        allNumbers.remove(Integer.valueOf(twoDimArray[newI][newJ]));
                    } else {
                        solved = "NO";
                        System.out.println(solved);
                        return;
                    }
                }
            }

            iteration++;
        }

        System.out.println(solved);
    }
}
