package week7_homework;

import java.util.Scanner;

/**
 * Same as above program-8 using switch statement.
 */

public class Program9_CityUsingSwitch
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); // declaring scanner class and creating scan object for input
        System.out.print("Enter any alphabet  between A to F :");
        char alphabet = scan.next().charAt(0); // to input single character
        Program9_CityUsingSwitch obj = new Program9_CityUsingSwitch(); //obj object created for calling instance method
        obj.citySwitch(alphabet); // calling instance method
        scan.close();

    }
    public  void citySwitch(char a) // Instance method used for program logic
    {
        switch (a)
        {
            case 'A':
                System.out.println("Ahmedabad"); //output
                break;
            case 'a':
                System.out.println("Ahmedabad"); //output
                break;
            case 'B':
                System.out.println("Bangalore");
                break;
            case 'b':
                System.out.println("Bangalore");
                break;
            case 'C':
                System.out.println("Chelsea");
                break;
            case 'c':
                System.out.println("Chelsea");
                break;
            case 'D':
                System.out.println("Delhi");
                break;
            case 'd':
                System.out.println("Delhi");
                break;
            case 'E':
                System.out.println("England");
                break;
            case 'e':
                System.out.println("England");
                break;
            case 'F':
                System.out.println("Florida");
                break;
            case 'f':
                System.out.println("Florida");
                break;
            default:
                System.out.println("Invalid entry");


        }
    }
}
