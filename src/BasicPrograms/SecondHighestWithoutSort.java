package BasicPrograms;

public class SecondHighestWithoutSort {
    public static void main(String[] args) {
        int [] array = {1,2,5,6,9,3,2,10};
        int highest = array[0];
        int secondHighest = 1;

        for (int i = 0; i < array.length; i++){
            if (highest < array[i]){
                secondHighest = highest;
                highest = array[i];
            } else if (secondHighest < array[i] && array[i] != highest) {
                secondHighest = array[i];
            }
        }
        System.out.println("Second Highest : " +secondHighest);
    }
}
