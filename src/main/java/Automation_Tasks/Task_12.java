// Given a matrix of integers with size n*n, sort the lines of the matrix by the sum of the elements on those lines

package Automation_Tasks;

import java.util.ArrayList;
import java.util.Scanner;

import static Automation_Tasks.Task_4.generateRandomInt;

public class Task_12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce size of the matrix");
        int matrixRow = scan.nextInt();
        int matrixColumn = matrixRow;

        int[][] matrix = new int[matrixRow][matrixColumn];

        System.out.println("Your random generated matrix is: ");

        for (int i = 0; i < matrixRow; i++) {
            for (int j = 0; j < matrixColumn; j++) {
                matrix[i][j] = generateRandomInt(100);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        ArrayList<Integer> sumOfTheLines = new ArrayList<>();
        // Get sum of the each row
        int tempSum = 0;
        for (int i = 0; i < matrixRow; i++) {
            for (int j = 0; j < matrixColumn; j++) {
                tempSum += matrix[i][j];
            }
            sumOfTheLines.add(tempSum);
            tempSum = 0;
        }
        System.out.println(sumOfTheLines);

        // Bubble sort the SumOfTheLines array
        for (int f = 0; f < sumOfTheLines.size() - 1; f++) {
            for (int k = f + 1; k < sumOfTheLines.size(); k++) {
                if (sumOfTheLines.get(f) > (sumOfTheLines.get(k))) {
                    int temp = sumOfTheLines.get(k);
                    sumOfTheLines.set(k, sumOfTheLines.get(f));
                    sumOfTheLines.set(f, temp);
//                for (int j = 0; j < matrixColumn; j++) {
//                    int temp1 = matrix[k][f];
//                    matrix[i+1][j] = matrix[i][j];
//                    matrix[i][j] = temp1;
//                }
                }
            }
        }
        System.out.println(sumOfTheLines);


//        int tempSum1 = 0;
//        int tempSum2 = 0;
//        for(int i = 0; i < matrixRow; i++) {
//            for (int j = 0; j < matrixColumn; j++) {
//
//                tempSum1 += matrix[i][j];
//                tempSum2 += matrix[i+1][j];
//
//                }
//
//            if (tempSum1 > tempSum2) {
//                for (int j = 0; j < matrixColumn; j++) {
//                    int temp1 = matrix[i+1][j];
//                    matrix[i+1][j] = matrix[i][j];
//                    matrix[i][j] = temp1;
//                }
//            }
//            tempSum1 = 0;
//            tempSum2 = 0;
//        }

//        int i, j = 0,k;
//        for ( i = 0; i < matrixRow; i++) {
//            for ( j = 0; j < matrixColumn; j++) {
//                for (k = j + 1; k < matrixColumn; k++) {
//                        if (matrix[j][i] > matrix[k][i]) {
//                            int temp1= matrix[j][i];
//                            matrix[j][i]=matrix[k][i];
//                            matrix[k][i]=temp1;
//                        }
//                    }
//                }
//            }

//        for(int r = 0; r < matrixRow;r++){
//                for(int m = 0; m < matrixColumn ; m++) {
//                    System.out.print(" " + matrix[r][m]);
//                    }
//                System.out.println();
//            }
    }
}
