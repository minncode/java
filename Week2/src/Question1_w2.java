import java.util.Scanner;

public class Question1_w2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int sc = scanner.nextInt();
        for (int i = 0; i < sc; i++) {
            for (int j = 0; j < sc; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
