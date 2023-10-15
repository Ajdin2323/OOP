package Week2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("How many times you want to text be printed: ");
        int n = Integer.parseInt(reader.nextLine());

        for (int i = 0; i < n; i++) {
            printText();
        }
    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.\n");
    }
}
