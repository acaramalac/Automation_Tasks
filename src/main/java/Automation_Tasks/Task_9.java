//Given an integer n, determine all friendly number pairs smaller than n

package Automation_Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter range of number to be calculated: ");
        int givenInt = scan.nextInt();

        ArrayList<Double> tempDivisor = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        int tempSum = 0;

            for(int i = 6; i <= givenInt; i++){
                for (int j = 1; j <= i; j++){
                    if((i % j) == 0){
                        tempSum = tempSum + j;
                    }
                }
                double division = (double) tempSum/ (double) i;
                tempDivisor.add(division);
                numbers.add(i);
                tempSum = 0;
            }
//        System.out.println(tempDivisor.size());
        System.out.println(tempDivisor);
        System.out.println(numbers);
//        System.out.println(tempDivisor.get(27));
        System.out.println("Friendly numbers are: ");

        for (int f = 0; f < tempDivisor.size() - 1; f++) {
            for (int k = f + 1; k < tempDivisor.size(); k++) {
                if (tempDivisor.get(k).equals(tempDivisor.get(f)) ){
                    System.out.println(numbers.get(k) + ", " + numbers.get(f));
                }
            }
        }

    }

    public static void findingDuplicates(){}

    public static void divisor(){}

    public static void friendlyNumbers(){}

}
