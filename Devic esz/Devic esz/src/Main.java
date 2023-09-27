import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose a shape (Rectangle, Circle, Triangle, Square) or type 'exit' to quit:");
            String shapeType = scanner.nextLine();

            if (shapeType.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            Shape shape = null;

            if (shapeType.equalsIgnoreCase("Rectangle")) {
                System.out.print("Enter width: ");
                double width = scanner.nextDouble();
                System.out.print("Enter height: ");
                double height = scanner.nextDouble();
                scanner.nextLine();  // Consume newline
                shape = new Rectangle("Rectangle", width, height);
            } else if (shapeType.equalsIgnoreCase("Circle")) {
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                scanner.nextLine();  // Consume newline
                shape = new Circle("Circle", radius);
            } else if (shapeType.equalsIgnoreCase("Triangle")) {
                System.out.print("Enter side1: ");
                double side1 = scanner.nextDouble();
                System.out.print("Enter side2: ");
                double side2 = scanner.nextDouble();
                System.out.print("Enter side3: ");
                double side3 = scanner.nextDouble();
                scanner.nextLine();  // Consume newline
                shape = new Triangle("Triangle", side1, side2, side3);
            } else if (shapeType.equalsIgnoreCase("Square")) {
                System.out.print("Enter side length: ");
                double sideLength = scanner.nextDouble();
                scanner.nextLine();  // Consume newline
                shape = new Square("Square", sideLength);
            } else {
                System.out.println("Invalid shape type. Please try again.");
                continue;
            }

            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
        }

        scanner.close();
    }
}