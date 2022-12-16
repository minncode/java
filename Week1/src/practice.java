import java.util.Scanner;
public class practice {
    public static void exercise4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coordinates of A: ");
        double x1, y1;
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        System.out.println("Enter coordinates of B: ");
        double x2, y2;
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        // Euclidean distance: length of a line segment between two points
        double lengthAB = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        double circumference = lengthAB * 4;
        double area = lengthAB * lengthAB;
        System.out.printf("Circumference: %.2f\n", circumference);
        System.out.printf("Area: %.2f\n", area);
    }
}