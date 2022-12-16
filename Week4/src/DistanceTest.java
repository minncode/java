import java.util.Scanner;

public class DistanceTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first point x and y:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("Enter the first point x and y:");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        Point point = new Point(x1, y1, x1, y1);
        System.out.printf("The distance between X and Y is: %.2f", point.Distance(x1, y1, x2, y2));
    }
}
