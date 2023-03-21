package week7_homework;

import java.util.Scanner;

/**
 * 5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20& : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================|
 */

public class Program5_SalarySlip
{
    public static void main(String[] args)
    {
        salarySlip();//calling static method into the main method
    }
    public static void salarySlip()
    {
        Scanner scan = new Scanner(System.in); // scan object created for Scanner class for the inputs
        System.out.print("Enter the employee ID: ");
        int eId = scan.nextInt();
        System.out.println("Enter Employee Name: ");
        String eName = scan.next();
        System.out.print("Enter the basic salary: ");
        double salary = scan.nextDouble();
        // calculation for gross salary,hra,ta,da,pf
        double hra = (salary * 10)/100;
        double ta = (salary * 8)/100;
        double da = (salary * 9)/100;
        double pf = (salary * 20)/100;
        double grossSalary = (salary + hra + ta + da)-pf;
        //output as per the given format
        System.out.println("---------------------------------");
        System.out.println("|       Salary Slip             |");
        System.out.println("|_______________________________|");
        System.out.println("|Emplyee Id  : "+eId  +  "          |");
        System.out.println("|Emplyee Name: "+eName +  "         |");
        System.out.println("|_______________________________|");
        System.out.println("|Basic Salary:"+salary+"        |");
        System.out.println("|HRA 10%     :"+hra   +"           |");
        System.out.println("|TA 8%       :"+ta    +"            |");
        System.out.println("|DA 9%       :"+da    +"            |");
        System.out.println("|pf 20%      :"+pf    +"            |");
        System.out.println("|_______________________________|");
        System.out.println("|Gross Salary:"+grossSalary+"         |");
        System.out.println("|_______________________________|");
        scan.close();







    }
}
