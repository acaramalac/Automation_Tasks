package Automation_Tasks;

// Algorithm used: Pi = 4/1 + 4/3 - 4/5 +4/7 + ....
// 1st step: create odd number generator
// 2nd step: change sign for odd numbers and even numbers (odd=1, pi=0)
// 3rd step: implement the algorithm
// 8 digits after comma

import java.util.Scanner;

public class Task_6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of digits after the comma (Max 8 digits for perfect precision): ");
        int decimal = scan.nextInt();

        int precision = 1;

        for(int j = 1; j <= decimal; j++){
            precision = precision * 10;
        }
//        System.out.println("test = " + precision);
        System.out.println("Waiting for Pi to be calculated...");



        int term = 500000000;
        int odd = 1;
        double Pi = 0.0;

        for(int i = 1; i <= term; i++){
            double currentTerm;
            if(i % 2 == 0){
                currentTerm = (double) -4/odd;  // cast to double as "4" and "odd" are int
            }else{
                currentTerm = (double) 4/odd;
            }
            odd = odd + 2;
            Pi = Pi + currentTerm;
        }

        double decimalPi = (int)Math.round(Pi * precision)/(double)precision;
        System.out.println("Your Pi number is: " + decimalPi);
    }
}
