import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);
        System.out.println("The area of the circle: " + circle.getArea());
        System.out.println("The circle info:" + circle.toString());

        System.out.println("Enter the height of the cylinder:");
        double height = scanner.nextDouble();

        Cylinder cylinder = new Cylinder(radius, height);
        System.out.println("The area of the cylinder: " + cylinder.getArea());
        System.out.println("The cylinder info:"+cylinder.toString());
    }
}
