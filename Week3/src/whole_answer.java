import java.util.Scanner;
import java.lang.Math;

public class whole_answer {
    public static void printArray(int numbers[]){
        for (int i: numbers)
            System.out.printf("%d ", i);
        System.out.println();
    }
    // Exercise 1
    public static int[] generateRandomNumberArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many random numbers to generate for the array:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)

                    array[i] = (int) Math.round(Math.random()* n);
        return array;
    }
    // Exercise 2
    public static int indexOfSmallest(int[] numbers){

        if (numbers.length == 0)
            return -1;
        int indexMin = 0;
        for (int i = 1; i < numbers.length; i++){

            if (numbers[i] < numbers[indexMin]){
                indexMin = i;
            }
        }
        return indexMin;
    }
    // Exercise 3
    public static int getIndexMinFrom(int[] numbers, int from){

        if (numbers.length == 0 || from < 0 || from >= numbers.length)
            return -1;
        int indexMin = from;
        for (int i = from; i < numbers.length; i++){

            if (numbers[i] < numbers[indexMin]){
                indexMin = i;
            }
        }
        return indexMin;
    }
    // Exercise 4
    public static int[] exchangeMinFrom(int[] numbers, int from) {

        int index = getIndexMinFrom(numbers, from);

        if (index == -1) {
            return numbers;
        }

        int temp = numbers[from];
        numbers[from] = numbers[index];
        numbers[index] = temp;
        return numbers;
    }
    // Exercise 5
    public static void sortBySelection(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            exchangeMinFrom(numbers, i);
        }
    }
    // Exercise 6
    public static void shoppingOrders() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a new number ID for order:");
        int orderID = scanner.nextInt();
        System.out.println("How many items in order:");
        int numberOfOrders = scanner.nextInt();
        String itemName;
        double itemPrice;
        double sum = 0;
        for (int i = 1; i <= numberOfOrders; i++) {
            System.out.printf("Please enter the name for item %d: \n", i);
            itemName = scanner.next();
            System.out.printf("Please enter the price for item %d: \n", i);
            itemPrice = scanner.nextDouble();
            sum+=itemPrice;
        }
        double average = sum/numberOfOrders;
        System.out.printf("You have a new order with ID: %d\n",orderID);
        System.out.printf("In the order, you have %d items.\n",numberOfOrders);
        System.out.printf("The average price in the order is: %.2f",average);
        }

        public static void main(String[] args) {
            System.out.println("Exercise 1 -> 5 Output:");
            // Exercise 1
            int[] myNumbers;
            myNumbers=generateRandomNumberArray();
            System.out.println("The generated array is:");
            printArray(myNumbers);
            // Exercise 2
            int smallestIndex = indexOfSmallest(myNumbers);
            System.out.printf("The smallest number is %d at the index %d.\n",
                    myNumbers[smallestIndex], smallestIndex);
            // Exercise 3
            int fromIndex = 4;
            int smallestIndexFrom = getIndexMinFrom(myNumbers, fromIndex);
            System.out.printf("The smallest number is %d at the index %d from the index %d.\n",
                    myNumbers[smallestIndexFrom], smallestIndexFrom, fromIndex);
            // Exercise 4
            fromIndex = 4;
            exchangeMinFrom(myNumbers, fromIndex);
            System.out.println("The new array after the exchange is:");
            printArray(myNumbers);
            // Exercise 5
            sortBySelection(myNumbers);
            System.out.println("The new array after sorting is:");
            printArray(myNumbers);
            // Exercise 6
            System.out.println("\nExercise 6 Output:");
            shoppingOrders();
        }
    }
