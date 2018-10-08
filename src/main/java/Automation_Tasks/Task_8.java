package Automation_Tasks;

// Given an integer n, determine all prime numbers smaller than n

public class Task_8 {

    static void primeMNumbers (int n) {

        int[] primeArray = new int[n];

        // Create an array and add numbers to it
        for (int i = 1; i < n; i++) {
            primeArray[i] = i;
        }

        for(int i=0; i<primeArray.length; i++){
            boolean isPrime = true;

            // Using for loop and if condition, prime numbers are identified from all the numbers that are entered in the array
            for (int j=2; j<i; j++){

                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime)

                System.out.println(i + " is a prime number in the array ");
        }
    }

    public static void main(String[] args) {
        int n = 41;
        primeMNumbers(n);
    }
}
