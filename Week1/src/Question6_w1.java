import java.util.Scanner;

public class Question6_w1 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a positive integer: ");
            num = scanner.nextInt();
            if (num < 0)
                break;
            if (num % 5 == 0 && num % 6 == 0) {
                System.out.println(num + " is divisible by 5 and 6");
            }
            else if (num % 5 == 0 || num % 6 == 0) {
                System.out.println(num + " is divisible by 5 or 6, but not both");
            }
            else {
                System.out.println(num + " is neither divisible by 5 nor 6");
            }
        }
        System.out.println("Goodbye!");
    }
}