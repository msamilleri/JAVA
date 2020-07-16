/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questions;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MUSTAFA
 */
public class Questions {

    // i wrote these code for Codewars web site weekley cha. questions.
    //find the prime number
    public static boolean primeNumber(int sayi) {

        for (int j = 2; j < sayi; j++) {
            if (sayi % j == 0) {
                return false;
            }

        }
        return true;
    }

    public static void findEBOB(int x, int y) {
        for (int i = x; i < y; i++) {

        }
    }

    public static char getGrade(int s1, int s2, int s3) {
        char grade;
        int average = (s1 + s2 + s3) / 3;
        if (average <= 100 && average >= 90) {
            return grade = 'A';

        } else if (average < 90 && average >= 80) {
            return grade = 'B';

        } else if (average < 80 && average >= 70) {
            return grade = 'C';

        } else if (average < 70 && average >= 600) {
            return grade = 'D';

        } else {
            return grade = 'F';
        }

    }

    public static String switchItUp(int number) {
        String word;
        switch (number) {
            case 1:
                word = "One";
                return word;

            case 2:
                word = "Two";
                return word;

            case 3:
                word = "Three";
                return word;

            case 4:
                word = "four";
                return word;

            case 5:
                word = "Five";
                return word;

            case 6:
                word = "six";
                return word;

            case 7:
                word = "Seven";
                return word;
            case 8:
                word = "Eight";
                return word;
            case 9:
                word = "Nine";
                return word;

            default:
                word = "Zero";
                return word;

        }
    }

    public static int ConvertBinaryArrayToInt(ArrayList<Integer> binary) {
        //  ArrayList<Integer>binary=new ArrayList<>();
        int binary_number;
        return binary_number = (binary.get(0) * 1) + (binary.get(1) * 2) + (binary.get(2) * 4) + (binary.get(3) * 8);

    }

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {

        int ageeras[] = new int[3];
        int catyeras = 0;
        int dogyeras = 0;

        if (humanYears == 1) {

            catyeras = 15;
            dogyeras = 15;
            ageeras[0] = 1;
            ageeras[1] = 15;
            ageeras[2] = 15;

        }
        if (humanYears == 2) {
            catyeras = 24;
            dogyeras = 24;
            ageeras[0] = 2;
            ageeras[1] = 24;
            ageeras[2] = 24;

        }
        if (humanYears > 1 && humanYears > 2) {
            ageeras[0] = humanYears;
            int newwage = humanYears - 2;
            ageeras[1] = (newwage * 4) + 24;
            ageeras[2] = (newwage * 5) + 24;

        }

        for (int i = 0; i < ageeras.length; i++) {
            System.out.print(ageeras[i] + " ");
        }
        return ageeras;
    }

    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
        //TEST
        humanYearsCatYearsDogYears(3);

        char f=getGrade(24, 16, 42);
         System.out.println(f);
         System.out.println(switchItUp(0));
        ArrayList<Integer> binary = new ArrayList<>();
        binary.add(1);
        binary.add(0);
        binary.add(0);
        binary.add(1);

        System.out.println(ConvertBinaryArrayToInt(binary));
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.println(s1 + "               " + x);

        }
        System.out.println("================================");
    }
}
