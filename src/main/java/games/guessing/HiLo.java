package games.guessing;

import java.util.Scanner;

/**
 * HiLo Guessing Game
 *
 */
public class HiLo {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int guess = 0;
            String playAgain = "";

            do {
                int num = (int) (Math.random() * 100 + 1);
                // System.out.println( "Random number: " + num );

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

                System.out.println("Would you like to play again (y/n)?");
                playAgain = scan.next();
            } while (playAgain.equalsIgnoreCase("y"));

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
}
