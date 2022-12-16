import java.util.Scanner;

public class Question6_w2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int house = 1000;
        int player = 100;
        int sum = 0;
        System.out.println("The house has $" + house);
        System.out.println("The house has $" + player);
        System.out.println("Try your luck to win all money of the house!");

        int round = 1;
        System.out.println("Round " + round + ":");
        while (true) {

            System.out.println("How much do you want to bet?");
            int bet = scanner.nextInt();
            if (bet > player) {
                System.out.println("you bet more than what in your wallet! Try again!");
                continue;
            }
            System.out.println("You have bet $" + bet + "!");
            System.out.println("Do you want to bet big or small?(big/small)");
            String size = scanner.next();
            System.out.print("The dices are: ");
            for (int i = 0; i < 3; i++) {
                int a = ((int) (Math.random() * 5) + 1);
                sum += a;
                System.out.print(a + " ");
            }
            System.out.println();
            System.out.println("The sum of 3 dices is " + sum + "!");
            if (size.equals("small")) {
                if (sum >= 4 && sum <= 10) {
                    System.out.println("You Won $" + bet);
                    house -= bet;
                    player += bet;
                    System.out.println("The house has $" + house);
                    System.out.println("The player has $" + player);
                } else {
                    System.out.println("You Lost $" + bet);
                    house += bet;
                    player -= bet;
                    System.out.println("The house has $" + house);
                    System.out.println("The player has $" + player);
                }
            } else if (size.equals("big")) {
                if (sum >= 11 && sum <= 17) {
                    System.out.println("You Won $" + bet);
                    house -= bet;
                    player += bet;
                    System.out.println("The house has $" + house);
                    System.out.println("The player has $" + player);
                } else {
                    System.out.println("You Lost $" + bet);
                    house += bet;
                    player -= bet;
                    System.out.println("The house has $" + house);
                    System.out.println("The player has $" + player);
                }
            }
                sum = 0;

                if (player == 0) {
                    System.out.println("you are out of money! Bye!");
                    break;
                } else {
                    System.out.println("Do you still want to continue to play?(true/false)");
                    String play = scanner.next();

                    if (play.equals("true")) {
                        round++;
                        System.out.println("Round " + round + ":");
                        continue;
                    } else {
                        break;
                    }
                }
            }
        }
    }