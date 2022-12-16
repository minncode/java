import java.util.Scanner;

public class TriangleVerification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 numbers for the sides of a triangle:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        Triangle triangle = new Triangle(x, y, z);
        System.out.println(triangle.Verify());
    }
}
