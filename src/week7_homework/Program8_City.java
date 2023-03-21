package week7_homework;

import java.util.Scanner;

/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

public class Program8_City
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); // scan object created for Scanner class for inputting the values
        System.out.println("Enter the any alphabet between A to F : ");
        char alphabet = scan.next().charAt(0); // to input the character
        Program8_City obj = new Program8_City();// obj object created to call the instance method
        obj.city(alphabet); // calling instance method
        scan.close();



    }
    public void city(char character)
    {
        if (character=='A' || character=='a')
        {
            System.out.println("Alaska"); // output if this condition is true
        }
        else if (character=='B' || character=='b')
        {
            System.out.println("Bangalore"); // output if this condition is true
        }
        else if (character=='c' || character=='c')
        {
            System.out.println("Chelsea"); // output if this condition is true
        }
        else if (character=='D' || character=='d')
        {
            System.out.println("Delhi");
        }
        else if (character=='E' || character=='e')
        {
            System.out.println("England"); // output if this condition is true
        }
        else if (character=='F' || character=='f')
        {
            System.out.println("Florida"); // output if this condition is true
        }
        else
        {
            System.out.println("Invalid entry"); // output if above  conditions don't match
        }
    }

}
