package Week2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String password = "carrot";
        while (true) {
            System.out.print("Type the password: ");
            String guess = reader.nextLine();
            if (guess.equals(password)) {
                System.out.println("Right!");
                break;
            }
            else {
                System.out.println("Wrong!");
            }
        }
        System.out.println("The secret is: jryy qbar!");
    }
}
