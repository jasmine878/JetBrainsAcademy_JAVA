import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        String roomShape = scanner.nextLine();
        double side1;
        double side2;
        double side3;
        double radius;
        double area = 0;
        
        switch (roomShape) {
            case "triangle":
                side1 = scanner.nextInt();
                side2 = scanner.nextInt();
                side3 = scanner.nextInt();
                
                double halfPerimeter = (side1 + side2 + side3) / 2;

                area = Math.sqrt(halfPerimeter *
                        (halfPerimeter - side1) *
                        (halfPerimeter - side2) *
                        (halfPerimeter - side3));
                break;
            case "rectangle":
                side1 = scanner.nextInt();
                side2 = scanner.nextInt();
                
                area = side1 * side2;
                break;
            case "circle":
                radius = scanner.nextInt();
                
                area = radius * radius * 3.14;
                break;
            default:
                System.out.println("Unknown shape");
        }
        
        System.out.println(area);
    }
}
