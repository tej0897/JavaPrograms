package BasicPrograms;

public class SecondHighestWithoutSort {
    public static void main(String[] args) {
        int [] array = {1,2,5,6,9,3,2,10};
        int highest = array[0];
        int secondHighest = 1;

        for (int j : array) {
            if (highest < j) {
                secondHighest = highest;
                highest = j;
            } else if (secondHighest < j && j != highest) {
                secondHighest = j;
            }
        }
        System.out.println("Second Highest : " +secondHighest);
    }
}
