package Week2;

import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());

        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += Math.pow(2,i);

        }
        System.out.print("The result is: " + sum);
    }

}
