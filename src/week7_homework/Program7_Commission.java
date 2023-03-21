package week7_homework;

import java.util.Scanner;

/**
 * 7. Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */

public class Program7_Commission
{
    public void salesCommission()
    {
        Scanner scan = new Scanner(System.in); //scan object created for inputting the values
        System.out.println("Enter Sales id : ");
        int sId = scan.nextInt(); // sales id stored to sId
        System.out.println("Enter the Seller's name: ");
        String name = scan.next(); // seller name stored to name
        System.out.println("Enter Sales amount : ");
        double salesAmount = scan.nextDouble(); // sales amount stored to salesamount
        System.out.println("Enter the basic salary : ");
        double basicSalary = scan.nextDouble(); // basic salary stored to basicSalary
        double commission ;
        // commission calculation as per the sales amount
        if (salesAmount>=50000 )
        {
            commission =(basicSalary*35)/100;
            System.out.println("Commission : " + commission); // output if this condition is true
        }
        else if (salesAmount>=30000 && salesAmount<50000)
        {
            commission =(basicSalary*20)/100;
            System.out.println("Commission : " + commission); // output if this condition is true
        }
        else if (salesAmount>=20000 && salesAmount<30000)
        {
            commission =(basicSalary*10)/100;
            System.out.println("Commission : " + commission); // output if this condition is true
        }
        else if (salesAmount>=10000 && salesAmount<20000)
        {
            commission =(basicSalary*5)/100;
            System.out.println("Commission : " + commission); //output if this condition is true
        }
        else
        {
            commission =(basicSalary*2)/100;
            System.out.println("Commission : " + commission); //output if the above conditions are false
        }
        scan.close();
    }

    public static void main(String[] args)
    {
        Program7_Commission obj = new Program7_Commission(); // scan object created to call instance method
        obj.salesCommission(); //salesCommission() calling
    }
}
