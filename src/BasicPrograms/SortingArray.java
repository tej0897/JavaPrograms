package BasicPrograms;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int [] array = {90, 23, 5, 109, 12, 22, 67, 34};
        Arrays.sort(array);
        for(int i: array){
            System.out.println(i);
        }

        // without using built-in methods:

        int[] arr = {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};

        System.out.println("Without using Methods");

        for( int i=0; i < arr.length; i++){
            for( int j=i+1; j < arr.length; j++){
                int temp = 0;
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }


    }
}
