package Automation_Tasks;

//Given an array of floating point numbers, inverse the elements of the array

import java.util.ArrayList;

public class Task_3 {
    public static void main(String[] args) {

//     private void reverseElements(){
        ArrayList<Float> floatArray = new ArrayList<>();
        ArrayList<Float> reversedArray = new ArrayList<>();
        floatArray.add(3.5f);
        floatArray.add(4.1f);
        floatArray.add(2.6f);
        floatArray.add(9.3f);
        floatArray.add(5.5f);
        floatArray.add(8.7f);
//        float[] elementsArray = {3.5f, 4.1f, 2.6f, 9.3f, 5.5f, 8.7f};
//        float[] reversedArray = new float[floatArray.size() - 1];

        int length = floatArray.size();

        for (int n = length - 1; n > 0; n--) {
            float temp = floatArray.get(n);
            reversedArray.add(temp);
        }
        System.out.println(reversedArray);

    }
//        public void reversedArray (Float[] floatArray){
//            int length = floatArray.length;
//            for (int i = 0; i < length; i++) {
//                int inversedElement = length - 1 - i;
//                System.out.println(floatArray[inversedElement]);
//            }
//        }
}
