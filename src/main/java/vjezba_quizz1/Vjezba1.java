package vjezba_quizz1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Vjezba1 {
    public static void main(String[] args) {
       /* ArrayList <String> teachers = new ArrayList<String>();
        teachers.add("Anthony");
        teachers.add("Paul");
        teachers.add("John");
        teachers.add("Martin");
        teachers.add("Matt");

        Collections.sort(teachers);
        for (String teacher : teachers) {
            System.out.println(teacher);
        } */
        /*
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int s = Integer.parseInt(reader.nextLine());
        System.out.print("Enter a number: ");
        int e = Integer.parseInt(reader.nextLine());
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(reader.nextLine());

        printTableNumber(1,10,3);
        */
/*
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a base value: ");
        int b = Integer.parseInt(reader.nextLine());
        System.out.print("Enter a power value: ");
        int pow = Integer.parseInt(reader.nextLine());

        System.out.println(baseRaisedToPower(b, pow));
*/

        //printInvertedHalfPyramid(5);
        int nums[] = {11,22,0,47,28,2};
        countEvenOddZerosOcc(nums);

    }
    /*
    public static void printTableNumber (int start, int end, int number) {
            for (int i = start; i <= end; i++) {
                int result = i * number;
                System.out.println(i + "*" + number + " = " + result);
            }
        } */

   /*
    public static double baseRaisedToPower (int base, int power) {

        double result = 0;
        if (power == 0) {
            return 1;
        }
        for (int i = 1; i <= power; i++) {
            result = Math.pow(base, power);
        }
        return result;

    }
    */
/*
    public static void printInvertedHalfPyramid (int number) {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if (i+j <= number+1) {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }
*/
    public static void countEvenOddZerosOcc (int[] numbers) {
        int even = 0;
        int odd = 0;
        int zeros = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && numbers[i] != 0) {
                even++;
            }
            else if (numbers[i] % 2 != 0) {
                odd++;
            }
            else if (numbers[i] == 0) {
                zeros++;
            }
        }
        System.out.println("Number of even occs are: " + even);
        System.out.println("Number of odd occs are: " + odd);
        System.out.println("Number of zero occs are: " + zeros);
    }
}

