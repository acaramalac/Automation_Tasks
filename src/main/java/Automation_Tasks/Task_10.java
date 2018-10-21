// Write a program that outputs the next k leap years

package Automation_Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {

        ArrayList<Integer> leapYear = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter current year: ");
        int currentYear = scanner.nextInt();
        System.out.println("Enter next k leap years to be calculated: ");
        int givenYears = scanner.nextInt();
        int lastYear = currentYear + givenYears;

        for(int i = currentYear + 1; i <= lastYear; i++){
            if (i % 4 != 0){
//                System.out.println("Year " + i + " is common");
            } else if (i % 100 != 0){
                leapYear.add(i);
            } else if (i % 400 != 0){
//                System.out.println("Year " + i + " is common");
            } else {
                leapYear.add(i);
            }
        }
        System.out.println("The next k leap years are: " + leapYear);
    }

}
