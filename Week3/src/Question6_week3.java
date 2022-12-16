import java.util.Scanner;

public class Question6_week3 {
    public static void order() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a new number ID for order:");
        int ID = scanner.nextInt();
        System.out.println("How many items in order:");
        int items = scanner.nextInt();

        double sum = 0;
        for (int i = 1; i <= items; i++) {
            System.out.println("Please enter the name for item "+i+":");
            String item = scanner.next();
            System.out.println("Please enter the price for item "+i+":");
            double item_price = scanner.nextDouble();
            sum += item_price;
        }
        double average = sum/items;
        System.out.println("You have a new order with ID: "+ID);
        System.out.println("In the order, you have "+items+" items");
        System.out.printf("The average price in the order is: %.2f",average);
    }

    public static void main(String[] args) {
        order();
    }
}
