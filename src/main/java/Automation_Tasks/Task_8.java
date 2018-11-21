package Automation_Tasks;

// Given an integer n, determine all prime numbers smaller than n

import java.util.ArrayList;

public class Task_8 {

    public static void primeMNumbers (int n) {

        int[] intArray = new int[n];
        ArrayList primeArray = new ArrayList();

        // Create an array and add numbers to it
        for (int i = 1; i < n; i++) {
            intArray[i] = i;
        }

        for(int i=0; i < intArray.length; i++){
            boolean isPrime = true;

            // Using for loop and if condition, prime numbers are identified from all the numbers that are entered in the array
            for (int j = 2; j < i; j++){

                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime)
                primeArray.add(i);
        }
        System.out.println("Prime numbers are: " + primeArray);
    }


    public static void main(String[] args) {
        int n = 100;
        primeMNumbers(n);
    }
}
