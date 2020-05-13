/*The prime factors of 13195 are 5, 7, 13 and 29.
* What is the largest prime factor of the number 600851475143 ?
*/

package Other_tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Recursion {


    public static void main(String args[]){

        ArrayList primeFactors = new ArrayList();

        long number = 600851475143L;

        for(long i = 2; i <= number; i++) {
            while(number % i == 0) {
                primeFactors.add(i);
                number = number/i;
            }
        }

        System.out.println(primeFactors);
    }
}
