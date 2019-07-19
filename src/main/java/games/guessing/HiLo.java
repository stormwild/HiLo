package games.guessing;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class HiLo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = (int) (Math.random() * 100 + 1);
        // System.out.println( "Random number: " + num );

        int guess = 0;
        while (guess != num) {
            System.out.println("Guess a number between 1 and 100:");

            guess = scan.nextInt();
            System.out.println("You entered " + guess + ".");

            if (guess < num) {
                System.out.println("You're guess is too low. Try again.");
            } else if (guess > num) {
                System.out.println("You're guess is too high. Try again.");
            } else {
                System.out.println("You're guess is correct. You win!");
            }
        }

    }
}
