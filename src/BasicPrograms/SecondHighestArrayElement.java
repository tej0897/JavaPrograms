package BasicPrograms;

public class SecondHighestArrayElement {
    public static void main(String[] args) {
        int [] array = {44,66,99,77,33,22,55};
        System.out.println("Second Highest number in Array is : " +getSecondHightest(array, array.length));
    }

    private static int getSecondHightest(int[] array, int length) {
        int temp = 0;
        for (int i = 0; i < length; i++){
            for (int j = i+1; j < length; j++){
                if (array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array[length-2];
    }
}
