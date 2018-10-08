package Automation_Tasks;

// Given an array of floating point numbers, inverse the elements of the array

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task_3 {

    public static float generateRandomFloat() {
        Random random = new Random();
        return random.nextFloat();
    }

    public static void main(String[] args) {

        ArrayList<Float> floatArray = new ArrayList<>();
        ArrayList<Float> reversedArray = new ArrayList<>();

        System.out.println("Introduce the number of floats to generate:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        for(int i = 0; i < number; i++) {
            floatArray.add(generateRandomFloat());
        }

        System.out.println("Your generated array: " + floatArray);

        int length = floatArray.size();
        for (int n = length - 1; n > -1; n--) {
            float temp = floatArray.get(n);
            reversedArray.add(temp);
        }
        System.out.println("Your reversed array: " + reversedArray);

    }
}
