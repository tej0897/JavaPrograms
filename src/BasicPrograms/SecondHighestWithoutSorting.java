package BasicPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighestWithoutSorting {
    public static void main(String[] args) {
        Integer array[]={1,2,5,6,3,2};
        System.out.println("Second Highest Element in Array is : " +secondHighest(array, array.length));
    }

    private static Integer secondHighest(Integer[] array, int length) {
        List <Integer> list = Arrays.asList(array);
        Collections.sort(list);
        int secondHighest = list.get(length-2);
        return secondHighest;
    }
}
