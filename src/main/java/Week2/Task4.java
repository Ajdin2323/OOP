package Week2;

import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int last = Integer.parseInt(reader.nextLine());

        while (true) {
            if (first > last) {
                break;
            }
            else {
                for (int i = first; i <= last; i++) {
                    System.out.println(i);
                }
                break;
            }
        }
    }
}
