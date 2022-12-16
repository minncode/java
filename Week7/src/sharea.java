import java.util.Scanner;

public class sharea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the color:");
        String color = scanner.nextLine();

        System.out.println("Enter the length and width of the rectangle:");
        int length = scanner.nextInt();
        int width = scanner.nextInt();

        Rectangle rectangle = new Rectangle(color, length, width);
        System.out.println("The area of the rectangle: " + rectangle.getArea());
        System.out.println("The rectangle info:" + rectangle.toString());

        System.out.println("Enter the base and height of the triangle:");
        int base = scanner.nextInt();
        int height = scanner.nextInt();

        Triangle triangle = new Triangle(color, base, height);
        System.out.println("The area of the triangle: " + triangle.getArea());
        System.out.println("The triangle info:" + triangle);
    }
}
