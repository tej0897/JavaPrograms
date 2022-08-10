package BasicPrograms;

import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);    //System.in is a standard input stream
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = s.nextInt();
        System.out.println("Enter second number");
        int b = s.nextInt();
        System.out.println("Please enter your name");
        String name = sc.nextLine();
        System.out.println("Hi "+name+"! The sum of first two numbers are: "+ (a+b));
    }
}
