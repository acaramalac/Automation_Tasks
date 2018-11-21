package Automation_Tasks;

// Given an array of integers, determine the sum of odd numbers and the amount of even numbers

import java.util.Scanner;

public class Task_5 {

    public static void main (String[] args) {

        System.out.println("Introduce the number of integers in array:");
        Scanner scan = new Scanner(System.in);
        int[] arrayOfInt = new int[scan.nextInt()];

        for (int i = 0; i < arrayOfInt.length; i++)
        {
            System.out.println("Please enter number");
            arrayOfInt[i] = scan.nextInt();
        }

        int sumOfOdd = 0;
        int evenAmount = 0;

        for (int i = 0; i < arrayOfInt.length - 1; i++) {
            if ( (arrayOfInt[i] & 1) == 0 ) {
                sumOfOdd = sumOfOdd + arrayOfInt[i];
            } else {
                evenAmount = evenAmount + 1;
            }
        }
        System.out.println("The sum of odd numbers is: " + sumOfOdd);
        System.out.println("The amount of even numbers is: " + evenAmount);
    }
}
