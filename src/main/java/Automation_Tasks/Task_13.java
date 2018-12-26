//Write a function that rotates a list by k elements. For example [1,2,3,4,5,6] rotated by two becomes [3,4,5,6,1,2]. Try solving this without creating a copy of the list

package Automation_Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_13 {

    public static void main(String[] args) {

        ArrayList<Integer> List = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce size of the list: ");
        int listSize = scan.nextInt();

        System.out.println("Introduce k to rotate the list: ");
        int elementsToRotate = scan.nextInt();

        System.out.println("Introduce values to list: ");
        for (int i = 0; i < listSize; i++) {
            List.add(scan.nextInt());
        }

        System.out.println("Your list is: " + List);

        //rotate method
        for (int i = 0; i < elementsToRotate; i++){
            List.add(List.get(i));
        }
        for (int k = 0; k < elementsToRotate; k++){
            List.remove(0);
        }

        System.out.println(List);
    }
}
