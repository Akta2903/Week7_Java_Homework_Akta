package week7_homework;

import java.util.Scanner;

/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol.
 */

public class Program12_NumberOrAlphabetOrSymbol
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); //declaring scanner class and creating scan object for inputting the value
        System.out.println("Enter the any character from alphabet,digit or symbol : ");
        char character = scan.next().charAt(0); // to input the value
        scan.close();
        Program12_NumberOrAlphabetOrSymbol obj = new Program12_NumberOrAlphabetOrSymbol(); //obj object created to call the instance method
        obj.NumberAlphaSymbol(character); //calling instance method


    }
    public void NumberAlphaSymbol(char ch) // instance method
    {
        if(Character.isAlphabetic(ch))
        {
            System.out.println(ch + " is an alphabet" ); //output if the condition is true
        }
        else if (Character.isDigit(ch))
        {
            System.out.println(ch + " is a digit" ); //output if the condition is true
        }
        else
        {
            System.out.println(ch + " is a symbol" ); //output if the above conditions are false
        }
    }
}
