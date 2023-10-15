package Week2;

import java.util.Scanner;
import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Random rand = new Random();
        int number = rand.nextInt(0, 100);

        int guesses = 0;

        while (true) {
            System.out.print("Guess a number: ");
            int x = Integer.parseInt(reader.nextLine());
            guesses++;

            if (x == number) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }

            else if (x > number) {
                System.out.println("The number is lesser, quesses made: " + guesses);
            }

            else {
                System.out.println("The number is greater, guess made: " + guesses);
            }

        }
    }
}
