package BasicPrograms;

import java.util.Scanner;

public class SimplePrimeNumber {
    public static void main(String[] args) {
        int flag = 0;
        System.out.println("Enter a number to check : ");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();


        if (number == 1 || number == 0){
            System.out.println("Not a Prime Number");
        }   else {
            for (int i=2; (i < number / 2) ;i++){
                System.out.println("Not a Prime Number");
                flag=1;
                break;
            }
            if (flag==0){
                System.out.println("It is a Prime Number");
            }
        }
    }
}
