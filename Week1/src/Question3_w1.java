import java.util.Scanner;

public class Question3_w1 {
    public static void main(String[] args) {

        final int SECONDS_PER_MINUTE = 60;
        final int MINUTE_PER_HOUR = 60;
        final int SECONDS_PER_HOUR = SECONDS_PER_MINUTE * MINUTE_PER_HOUR;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the seconds:");
        int s = sc.nextInt();

        int hour, minute, second, second_temp;
        hour = s / SECONDS_PER_HOUR;
        second_temp = s % SECONDS_PER_HOUR;
        minute = second_temp / MINUTE_PER_HOUR;
        second = second_temp % MINUTE_PER_HOUR;

        System.out.println(hour + ":" + minute + ":" + second);


    }
}
