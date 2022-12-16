import java.util.Scanner;

public class Question1_week3 {
    public static int[] generatedarray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many random numbers to generate for the array:");
        int random = scanner.nextInt();

        int[] arr = new int[random];
        for (int i=0; i < random; i++) {
            arr[i] = (int) (Math.random() * random);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] myNumbers;
        myNumbers=generatedarray();
        System.out.println("The generated array is:");
        for (int i: myNumbers) {
            System.out.printf("%d ", i);
        }
    }
}