package Automation_Tasks;

// Given a string of characters, determine if it is a palindrome or not

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word to check: ");
        String str = scan.next();

        if(isPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Is not a Palindrome");
        }
    }

    private static boolean isPalindrome(String str) {
        // Convert String to char array
        char[] charArray = str.toCharArray();
        for(int i=0; i < str.length(); i++) {
            if(charArray[i] != charArray[(str.length()-1) - i]) {
                return false;
            }
        }
        return true;
    }
}
