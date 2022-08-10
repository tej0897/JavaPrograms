package BasicPrograms;


//In fibonacci series, next number is the sum of previous two numbers
// for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
// The first two numbers of fibonacci series are 0 and 1.

public class FibonacciSeries {
    public static void main(String[] args) {
        int a=0, b=1;
        int c;              // variable for addition of last two numbers
        int count = 10;     // number of fibonacci elements
        int i;

        // print first two numbers

        System.out.println(a + "\n" +b);

        for(i=2; i < count; i++){
            c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }

}
