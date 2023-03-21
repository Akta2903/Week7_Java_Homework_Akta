package week7_homework;

import java.util.Scanner;

/**4. Number of Days In Month
        Write a method isLeapYear with a parameter of type int named year.
        The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
        If the parameter is not in that range return false.
        Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
        otherwise return false.
        A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
        Example of input/Output:
        ● isLeapYear(-1600); should return false since the parameter is not in the range(1-9999)
        ● isLeapYear(1600); should return true since 1600 is a leap year
        ● isLeapYear(2017); should return false since 2017 is not a leap year
        ● isLeapYear(2000);should return true because 2000 is a leap year
        Write another method getDaysInMonth with two parameter month and year. Both of type
        int.
        If parameter month is < 1 or >12 return -1.
        If parameter year is <1 or >9999 than return -1.
        This method needs to return the number of days in the month. Be careful about leap years
        they have 29 days in month 2 (February).
        You should check if the year is a leap year using the method isLeapYear describe above.

        Example of input/Output:
        ● getDaysInMonth(1, 2020); should return 31 since January has 31 days.
        ● getDaysInMonth(2, 2020); should return 29 since February has 29 days in a year and 2020 is a leap
        year.
        ● getDaysInMonth(2, 2018); should return 28 since February has 28 days if it’s not a leap year and
        2018 is not a leap year.
        ● getDaysInMonth(-1, 2020); should return -1 since the parameter month is invalid.
        ● getDaysInMonth(1, -2020); should return -1 since the parameter year is outside the range of 1 to
        9999
        HINT: Use the switch statement.
        NOTE: Methods isLeapYear and getDaysInMonth need to be public static
 **/
public class Program4_LeapYearWithCondition
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); // declaring scanner class for input
        System.out.print("Enter the year : ");
        int year = scan.nextInt(); //input the year
        System.out.print("Enter the month: ");
        int month = scan.nextInt(); // input the month

        System.out.println( isLeapYear(year)); // calling static method

        getDaysInMonth(month,year); // calling static method
        scan.close();

    }
    public static boolean isLeapYear(int year) // declaring static method
    {
        //logic to check whether the input year is leap year or not
        if(year>=1 && year<=9999 )
        {
            if (year%4==0 && year%100!=0 || year%400==0)
            {
                System.out.print(year + " is a leap year since "); // output if the condition is true
                return true;

            }
            else
            {
                System.out.print(year + " is not a leap year since"); //output if the condition is false
                return false;
            }

        }
        System.out.println("Invalid range since"); // output if above both the conditions are false
        return false;
    }
    public static void getDaysInMonth(int month , int year)
    {
        //logic for returning the days of the  month as per the entered  month and year
        if (month < 1 || month > 12 )
        {

            System.out.print(" -1" + month + " since invalid month"); // output if the condition is true

        }
        else if ( year < 1 || year > 9999)
        {
            System.out.print("-1" + year + " since invalid year"); // output if the condition is false
        }
        else {
            switch (month) {
                case 1:
                    System.out.println(" 31 Days in January  " + year);
                    break;
                case 2:
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        System.out.println("29 Days in February " + year);
                    } else {
                        System.out.println("28 Days in February " + year);
                    }
                    break;

                case 3:
                    System.out.println(" 31 Days in March " + year);
                    break;

                case 4:
                    System.out.println(" 30 Days in April " + year);
                    break;
                case 5:
                    System.out.println(" 31 Days in May " + year);
                    break;

                case 6:
                    System.out.println(" 30 Days in June " + year);
                    break;

                case 7:
                    System.out.println(" 31 Days in July " + year);
                    break;
                case 8:
                    System.out.println(" 31 Days in August " + year);
                    break;

                case 9:
                    System.out.println(" 30 Days in September " + year);
                    break;
                case 10:
                    System.out.println(" 31 Days in October " + year);
                    break;

                case 11:
                    System.out.println(" 30 Days in November " + year);
                    break;
                case 12:
                    System.out.println(" 31 Days in December " + year);
                    break;
                default:
                    System.out.println("Enter Valid month number between 1 to 12 ");
                    //boolean leapYear = (year%4==0 && (year%100!=0 || year%400==0));


            }


        }
    }
}
