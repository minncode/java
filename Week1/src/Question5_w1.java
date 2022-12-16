public class Question5_w1 {
    public static void main(String[] args) {
        System.out.println("Miles \t Kilometers");
        for (int i = 1; i <= 9; i++) {
            double Kilometers = i * 1.61;

            System.out.printf(" %d \t\t %.2f\n", i, Kilometers);
        }

        System.out.println();

        System.out.println("Kilometers \t Miles");
        for(int j = 20; j <= 65; j = j + 5) {
            double Miles = j * 0.621371;

            System.out.printf(" %d \t\t %.2f\n", j,Miles);
        }
    }
}
