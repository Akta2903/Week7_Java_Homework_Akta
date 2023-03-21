package week7_homework;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 */
public class Program1_OddOrEven
{
    public static void oddOrEven()
    {
        Scanner scan = new Scanner(System.in); // creating an object of Scanner class for to input the values
        System.out.println("Enter the Integer value: " );
        int value = scan.nextInt(); // entered input is assigned to value variable
        //Logic for odd and even

        String result = value%2==0? "even" : "Odd";
        System.out.println(value + " number is  " + result);
        scan.close();
    }

    public static void main(String[] args)
    {
       oddOrEven(); // calling a static method into main method
    }
}
