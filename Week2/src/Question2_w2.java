import java.util.Scanner;

public class Question2_w2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int sc = scanner.nextInt();
        for (int i = 0; i < sc; i++) {
            for (int j = 0; j < sc; j++) {
                if (i == 0 || j == 0 || i == sc - 1 || j == sc - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
