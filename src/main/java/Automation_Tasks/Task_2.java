package Automation_Tasks;

//        Drawing a staircase structure - given the required height, output a staircase as shown in the example
//        Given n = 6, the output should be:
//        #
//        ##
//        ###
//        ####
//        #####
//        ######

public class Task_2 {

    public static void main(String[] args) {

        int n = 7;
        for (int p = 1; p < n; p++) {

//             for (int space = n - p; space > 0; space--){
//                System.out.print(" ");
//            }

            for (int m = 0; m < p; m++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
