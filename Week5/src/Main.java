import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the name of the ingredient:");
        String name = scanner.nextLine();
        System.out.println("Please input the measurement of the ingredient:");
        String meas = scanner.nextLine();
        System.out.printf("The ingredient is: %s and the measurement unit is %s", name, meas);
    }
}