package Automation_Tasks;

// Given an array of integers, implement the BubbleSort algorithm for sorting the elements of the array

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_4 {

        public static int generateRandomInt(int upperRange){
        Random random = new Random();
        return random.nextInt(upperRange);
    }

    public static void main (String[] args) {

        System.out.println("Introduce the number of integers to generate:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        // Generate an int array
        System.out.println("Your array is: ");
        int[] bubbleArray = new int[number];
        for(int i = 0; i < bubbleArray.length; i++){
            bubbleArray[i] = generateRandomInt(100);
            System.out.print(bubbleArray[i] + " ");
        }
        System.out.println();
        bubbleSort(bubbleArray);

        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(bubbleArray));
    }

    // BubbleSort implementation
    public static void bubbleSort(int[] bubbleArray){
        boolean swap = true;
        while(swap){
            swap = false;
            for (int i = 1; i < bubbleArray.length; i++){
                if(bubbleArray[i - 1] > bubbleArray[i]){
                    int temp = bubbleArray[i - 1];
                    bubbleArray[i - 1] = bubbleArray[i];
                    bubbleArray[i] = temp;
                    swap = true;
                }
            }
        }
    }

}
