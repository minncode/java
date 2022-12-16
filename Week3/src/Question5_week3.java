import java.util.Arrays;
import java.util.Scanner;

public class Question5_week3 {
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
        numbers[index] = temp; // 4번 질문 numbers[index]는 int temp가 지금 배열의 4번째 숫자이기 때문에 하나의 문자 아닌가? ex) int temp = 4
        return numbers; // 5번 질문 어떻게 배열이 sorting이 된건지 / return 값이 없는데 어떻게 불러왔는지
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

        System.out.println();
        System.out.println("The new array after sorting is:");
        Arrays.sort(o);
        for (int i: o)
            System.out.printf("%d ",i);
    }
}