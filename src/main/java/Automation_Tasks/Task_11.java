// Given three ascendingly sorted arrays, merge the elements of these three arrays to obtain one ascendingly sorted array

package Automation_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int stsSize;
        int snSize;
        int tdSize;

        System.out.println("Introduce size of three arrays: ");
        stsSize = scan.nextInt();
        snSize = scan.nextInt();
        tdSize = scan.nextInt();

        int[] stArray = new int[stsSize];
        int[] ndArray = new int[snSize];
        int[] rdArray = new int[tdSize];

        System.out.println("Introduce values of first array: ");
        for (int i = 0; i < stsSize; i++) {
            stArray[i] = scan.nextInt();
        }

        System.out.println("Introduce values of second array: ");
        for (int i = 0; i < snSize; i++) {
            ndArray[i] = scan.nextInt();
        }

        System.out.println("Introduce values of third array: ");
        for (int i = 0; i < tdSize; i++) {
            rdArray[i] = scan.nextInt();
        }

        int[] mergedArrays = new int[stArray.length + ndArray.length + rdArray.length];
        int c = 0;
        int f = stArray.length + ndArray.length;

        for (int i = 0; i < stArray.length; i++) {
            mergedArrays[i] = stArray[i];
            c++;
        }
        for (int aNdArray : ndArray) {
            mergedArrays[c++] = aNdArray;
        }
        for (int aRdArray : rdArray) {
            mergedArrays[f++] = aRdArray;
        }

        Task_4.bubbleSort(mergedArrays);

        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(mergedArrays));
    }
}
