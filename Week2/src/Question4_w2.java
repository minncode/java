import java.util.Scanner;

public class Question4_w2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter circle 1's center x-, y- coordinates, and radius:");

        double x1, y1, r1;
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        r1 = sc.nextDouble();

        System.out.println("Enter circle 2's center x-, y- coordinates, and radius:");

        double x2, y2, r2;
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        r2 = sc.nextDouble();

        double distance = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        if (Math.abs(r1-r2) >= distance) {
            System.out.println("One circle is inside another circle!");
        } else if (r1+r2 > distance) {
            System.out.println("One circle overlaps the other circle!");
        } else {
            System.out.println("Two circle do not overlap each other!");
        }
    }
}
