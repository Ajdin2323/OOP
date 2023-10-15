package Week2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        drawNumberPiramid(5);
    }

    public static void drawNumberPiramid(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (i >= j){
                    //System.out.print(j + " ");
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
