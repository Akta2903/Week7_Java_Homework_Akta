package week7_homework;

import java.util.Scanner;

/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or  “ZERO”
 */

public class Program16_PositiveNegativeZero
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); // Scanner class is declared and scan object is created to input the value
        System.out.println(" Enter the value : ");
        int value = scan.nextInt(); // to input the value
        positiveNegZero(value); // calling the static method
        scan.close();
    }
    public static void positiveNegZero(int number) // declaring static method
    {
        if(number<0)
        {
            System.out.println(number + " is negative"); // output if this condition is true
        }
        else if (number>0)
        {
            System.out.println(number + " is positive"); // output if this condition is true
        }
        else if (number==0)
        {
            System.out.println("The number is zero"); // output if this condition is true
        }
        else
        {
            System.out.println("Invalid input"); // // output if above conditions are false
        }
    }

}
