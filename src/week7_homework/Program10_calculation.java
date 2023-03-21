package week7_homework;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,  /, *)
 * find addition, Subtraction, multiplication and division according to their symbol  (using if else)
 */

public class Program10_calculation
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); // declaring Scanner class and creating scan object for the input
        System.out.print("Enter the first value : ");
        int value1 = scan.nextInt(); // first value input
        System.out.print("Enter the second value : ");
        int value2 = scan.nextInt(); // second value input
        System.out.println("Enter the symbol of addition,subtraction,division,multiplication as per your choice:");
        char symbol = scan.next().charAt(0); // symbol input
        calculation(value1,value2,symbol); // calling static method into the main method
        scan.close();



    }
    public static void calculation(int a , int b,char symbol1) // declaring static method for calculation as per the user choice
    {
        double answer;
        if(symbol1 == '+')
        {
            answer = a + b;
            System.out.println("The addition of " + a + " and " + b + "=" + answer); // output if the condition is true
        }
        else if(symbol1 == '*')
        {
            answer = a * b;
            System.out.println("The multiplication of " + a + " and " + b + "=" + answer); // output if the condition is true
        }
        else if(symbol1 == '-')
        {
            answer = a - b;
            System.out.println("The subtraction of " + a + " and " + b + "=" + answer); // output if the condition is true
        }
        else if(symbol1 == '/')
        {
            answer = a / b;
            System.out.println("The division  of " + a + " and " + b + "=" + answer); // output if the condition is true
        }
        else {
            System.out.println("Invalid input"); // output if the above conditions are false
        }
    }

}
