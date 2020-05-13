// Given a list of coins with different values (1, 3, 10, 25, 50), determine the minimum amount of coins needed to sum up a certain amount of money

//[20] -> sum of array bigger than 37? NO -> add it to itself
//[20, 20] greater than 37? YES (20 + 20) -> remove last and jump to smaller coin
//[20, 15] 35 OK
//[20, 15, 15] 50 NO
//[20, 15, 7] 42 NO
// Replace biggest number and repeat
//[15] 15 OK
//[15, 15] 30 OK
//[15, 15, 15] 45 NO
//[15, 15, 7] 37! RETURN NUMBER!

package Automation_Tasks;

import java.util.Scanner;

public class Task_14 {

    static int solution(int[] coins, int amount, int coinsCount){

        if(amount == 0) { return 0;}
        Task_4.decreasingBubbleSort(coins);

        //initialize result
        int result = Integer.MAX_VALUE;

        for(int i = 0; i < coinsCount; i++){
            if ( coins[i] <= amount ){
                int tempResult = solution(coins, amount-coins[i], coinsCount);
                // Check for INT_MAX to avoid overflow and see if
                // result can minimized
                if (tempResult != Integer.MAX_VALUE && tempResult + 1 < result)
                    result = tempResult + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce the number of coins");
        int coinsCount = scan.nextInt();

        int[] coins = new int[coinsCount];

        System.out.println("Introduce amount of each coin:");
        for (int i = 0; i < coinsCount; i++){
            coins[i] = scan.nextInt();
        }

        System.out.println("Introduce the amount to split:");
        int amount = scan.nextInt();

        System.out.println("The minimum amount of coins needed to sum up your amount of money is " + solution(coins, amount, coinsCount));
    }
}
