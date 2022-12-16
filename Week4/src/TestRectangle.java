import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width: ");
        int width = scanner.nextInt();
        System.out.println("Enter the height: ");
        int height = scanner.nextInt();
        Rectangle myrectangle = new Rectangle(width, height);
        myrectangle.Visualize();

    }
}