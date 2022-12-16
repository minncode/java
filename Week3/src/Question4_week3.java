import java.util.Scanner;

public class Question4_week3 {
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

    public static int generatesmall(int[] numbers) {
        int minimum = 0;
        for (int i=1; i<numbers.length; i++) {
            if (numbers[i] < numbers[minimum])
                minimum = i;
        }
        return minimum;
    }

    public static int generatesubarray(int[] numbers, int from) {
        int indexmin = from;
        for (int i=from; i<numbers.length; i++) {
            if (numbers[i] < numbers[indexmin]) {
                indexmin = i;
            }
        }
        return indexmin;
    }

    public static int[] exchange(int[] numbers, int from) {
        int index = generatesubarray(numbers, from);
        int temp = numbers[from];
        numbers[from] = numbers[index];
        numbers[index] = temp;
        return numbers;
    }

    public static void main(String[] args) {
        int[] myNumbers;
        myNumbers=generatedarray();
        System.out.println("The generated array is:");
        for (int i: myNumbers) {
            System.out.printf("%d ", i);
        }
        int n = generatesmall(myNumbers);
        System.out.println();
        System.out.println("The smallest number is "+myNumbers[n]+" at the index "+n);

        int fromindex = 4;
        int m = generatesubarray(myNumbers, fromindex);
        System.out.println();
        System.out.println("The smallest number is "+myNumbers[m]+" at the index "+m+" from index "+fromindex);

        fromindex = 4;
        int[] o = exchange(myNumbers,fromindex);
        System.out.println();
        System.out.println("The new array after the exchange is:");
        for (int i:o)
            System.out.printf("%d ",i);
    }
}