import java.util.Scanner;

public class Question3_w2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        if (a == b & b == c) {
            System.out.print("Equilateral Triangle");
        }
        else if (a == b | b == c | a == c) {
            System.out.println("Isosceles Triangle");
        }
        else if (a >= b+c | b >= a+c | c >= a+b) {
            System.out.println("Not Triangle");
        }
        else {
            System.out.println("Scalene triangle");
        }
    }
}
