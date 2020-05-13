// Write a program that will rotate a two-dimensional array clockwise

package Automation_Tasks;

import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        int[][] a = new int[][] {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 0, 1, 2 },
                { 3, 4, 5, 6 },
                { 7, 8, 9, 0 }
        };

        System.out.println("Introduce the number of columns: ");
        Scanner scan = new Scanner(System.in);
        int columns = scan.nextInt();

        System.out.println("Introduce the number of lines: ");
        int lines = scan.nextInt();



//        int[][] rotate180 = rotate90(rotate90(a));

        int [][] rotateCompleted = rotate90(a);
        print(rotateCompleted);
    }

    static int[][] rotate90(int[][] a) {
        int[][] ret = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                ret[j][a.length - i - 1] = a[i][j];
            }
        }
        return ret;
    }

    static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.println("]");
        }
    }
}
