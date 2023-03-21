package week7_homework;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

public class Program2_LeapYear
{
    public void isLeapYear() // declaring instance method
    {
        Scanner scan = new Scanner(System.in); //object created for Scanner class
        System.out.print("Enter the year:");
        int year = scan.nextInt();//entered input assigned to variable year
        //Logic to check whether the entered year is leap year or not
        if (year%4==0 && (year%100!=0 || year%400==0))
        {
            System.out.println(year + " is a leap year"); // output if the condition is true
        }
        else
        {
            System.out.println(year + " is not a leap year"); //  output if condition is false
        }
        scan.close();
    }

    public static void main(String[] args) //declarng main method
    {
        Program2_LeapYear obj = new Program2_LeapYear(); //object  obj created to call the instance method
        obj.isLeapYear(); // calling the isLeapYear() instance method
    }

}
