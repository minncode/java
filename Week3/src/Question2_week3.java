import java.util.Scanner;

public class Question2_week3 {
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

    public static int generatesmall(int[] numbers) { // 배열안에서 가장작은 숫자의 자리구하기
        int minimum = 0;
        for (int i=1; i<numbers.length; i++) {
            if (numbers[i] < numbers[minimum])
                minimum = i;
        }
        return minimum;
    }
    public static int generatesmall1(int[] numbers) { // 배열안에서 가장작은 숫자구하기
        int minimum = 0;
        for (int i=1; i<numbers.length; i++) {
            if (numbers[i] < numbers[minimum])
                minimum = numbers[i];
        }
        return minimum;
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
    }
}