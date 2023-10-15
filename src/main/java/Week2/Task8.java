package Week2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        drawStarsPiramid(10);
    }

    public static void drawStarsPiramid (int number) {

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                //if (i >= j)
                if (i+j <= number-1){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
