package Automation_Tasks;

import java.util.Arrays;

public class Task_11 {
    public static void main(String[] args) {

        int[] stArray = {1, 5, 5};
        int[] ndArray = {2, 6, 7};
        int[] rdArray = {1, 4, 7, 8};

        int[] mergedArrays = new int[stArray.length + ndArray.length + rdArray.length];
        int c = 0;
        int f = stArray.length + ndArray.length;

        for (int i = 0; i < stArray.length; i++) {
            mergedArrays[i] = stArray[i];
            c++;
        }
        for (int j = 0; j < ndArray.length; j++) {
            mergedArrays[c++] = ndArray[j];
        }
        for (int k = 0; k < rdArray.length; k++){
            mergedArrays[f++] = rdArray[k];
        }

        Task_4 bubble = new Task_4();
        bubble.bubbleSort(mergedArrays);

        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(mergedArrays));
    }
}
