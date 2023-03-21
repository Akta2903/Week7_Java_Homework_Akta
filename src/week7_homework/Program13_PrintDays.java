package week7_homework;
/**
 * 13. Write a Java program which input any number between 1 to 7 and it print The Days  name MONDAY, TUESDAY…..SUNDAY of
 * the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

import java.util.Scanner;

public class Program13_PrintDays
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); // declaring scanner class and scan object created to input the value
        System.out.println("Enter any number between 1 and 7 : ");
        int value = scan.nextInt(); // input the value
        Program13_PrintDays obj = new Program13_PrintDays(); // obj object created to call the instance method
        obj.printDays(value); // calling instance method
        scan.close();
    }
    public void printDays(int day) // instance method
    {
        switch (day)
        {
            case 1:
                System.out.println("Monday"); // output if this case matches the input value
                break;
            case 2:
                System.out.println("Tuesday"); // output if the case matches the input value
                break;
            case 3:
                System.out.println("Wednesday"); // output if the case matches the input value
                break;
            case 4:
                System.out.println("Thursday"); // output if the case matches the input value
                break;
            case 5:
                System.out.println("Friday"); // output if the case matches the input value
                break;
            case 6:
                System.out.println("Saturday"); // output if the case matches the input value
                break;
            case 7:
                System.out.println("Sunday"); // output if the case matches the input value
                break;
            default:
                System.out.println("Week contains 1 to 7 days"); // output if the above cases doesn't match the input value
        }
    }
}
