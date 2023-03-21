package week7_homework;

import java.util.Scanner;

/**
 * 6. Write a java program to input any number and find out if it’s odd or even
 */

public class Program6_OddEven
{
    public  void oddOrEven()
    {
        Scanner scan = new Scanner(System.in); // creating an object of Scanner class for to input the values
        System.out.println("Enter the Integer value: " );
        int value = scan.nextInt(); // entered input is assigned to value variable
        //Logic for odd and even
        if(value%2==0)
        {
            System.out.println(value + " Number is even"); //output if condition is true
        }
        else
        {
            System.out.println(value + " Number is odd");//output if condition is false
        }
        scan.close();
    }

    public static void main(String[] args)
    {
        Program6_OddEven obj = new Program6_OddEven();
        obj.oddOrEven(); // calling a static method into main method
    }
}
