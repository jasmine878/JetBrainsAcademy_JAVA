import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int[] box1 = new int[3];
        int[] box2 = new int[3];

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int z1 = scanner.nextInt();

        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int z2 = scanner.nextInt();

        //add ints to box1 in ascending order
        if (y1 <= x1 && y1 <= z1) {
            box1[0] = y1;
            if (x1 < z1) {
                box1[1] = x1;
                box1[2] = z1;
            } else {
                box1[1] = z1;
                box1[2] = x1;
            }
        } else if (z1 <= x1 && z1 <= y1) {
            box1[0] = z1;
            if (x1 < y1) {
                box1[1] = x1;
                box1[2] = y1;
            } else {
                box1[1] = y1;
                box1[2] = x1;
            }
        } else {
            box1[0] = x1;
            if (y1 < z1) {
                box1[1] = y1;
                box1[2] = z1;
            } else {
                box1[1] = z1;
                box1[2] = y1;
            }
        }

        //add ints to box2 in ascending order
        if (y2 <= x2 && y2 <= z2) {
            box2[0] = y2;
            if (x2 < z2) {
                box2[1] = x2;
                box2[2] = z2;
            } else {
                box2[1] = z2;
                box2[2] = x2;
            }
        } else if (z2 <= x2 && z2 <= y2) {
            box2[0] = z2;
            if (x2 < y2) {
                box2[1] = x2;
                box2[2] = y2;
            } else {
                box2[1] = y2;
                box2[2] = x2;
            }
        } else {
            box2[0] = x2;
            if (y2 < z2) {
                box2[1] = y2;
                box2[2] = z2;
            } else {
                box2[1] = z2;
                box2[2] = y2;
            }
        }

        //make comparisons with sorted box1 and sorted box2
        if (box1[0] == box2[0] && box1[1] == box2[1] && box1[2] == box2[2]) {
            System.out.println("Box 1 = Box 2");
        } else if (box1[0] <= box2[0] && box1[1] <= box2[1] && box1[2] <= box2[2]) {
            System.out.println("Box 1 < Box 2");
        } else if (box1[0] >= box2[0] && box1[1] >= box2[1] && box1[2] >= box2[2]) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incomparable");
        }
    }
}
