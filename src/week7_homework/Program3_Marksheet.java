package week7_homework;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */
public class Program3_Marksheet
{
    int mathsMarks,scienceMarks,englishMarks;
    public void markSheet(String name,int rollNumber,int maths,int science,int english ) //declaring instance method
    {

        int total = maths + science +english; // calculating the total marks of all 3 subject
        //System.out.println(total);
        double percentage = (total*100)/300; // calculating the percentage

        String result;
        //calculation for pass or fail
         if(percentage>=35 && percentage<=100)
         {
             result = "Pass";
            System.out.println(result); //output if the condition is true

        }
         else {
             result = "Fail";
             System.out.println(result); //output if the condition is false
         }







        //calculation for grade
        String g="";
        String result1="Fail";
             if (percentage >= 80 && percentage <= 100)
            {
                //System.out.println("Grade = A+");
                g="A+";
            }
             else if (percentage < 80 && percentage >= 60)
             {
                //System.out.println("Grade = A");
                 g="A";
             }
             else if (percentage < 60 && percentage >= 50)
             {
                //System.out.println("Grade = B");
                 g="B";
            }
            else if(percentage>=35 && percentage<50)
            {
                //System.out.println("Grade = c");
                g="C";
            }
            else
            {
                g= "Fail";
                System.out.println(g);
            }


        //printing the marksheet
        System.out.println("-------------------------------------");
        System.out.println("|                                   |");
        System.out.println("|          Mark sheet               |");
        System.out.println("|-----------------------------------|");
        System.out.println("| Name        :" + name + "         |");
        System.out.println("| Roll Number :" + rollNumber +"    |");
        System.out.println("|                                   |");
        System.out.println("------------------------------------");
        System.out.println("| Subject     :    Marks            |");
        System.out.println("------------------------------------");
        System.out.println("| Maths       :    " + maths+"      |");
        System.out.println("| Science     :    " + science+"    |");
        System.out.println("| English     :    " + english+"    |");
        System.out.println("------------------------------------");
        System.out.println("| Total       :    " + total+"      |");
        System.out.println("------------------------------------");
        System.out.println("| Percentage  :    " + percentage+" |");
        System.out.println("| Result      :    " + result + "    |");
        System.out.println("| Grade       :    "+ g +"          |");
      //  System.out.println("|                             "+result);
        System.out.println("------------------------------------");






        }



    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); // scanner class declared and scan object created for input
        System.out.println("Enter the student name: ");
        String sName = scan.nextLine(); //input
        System.out.println("Enter the student roll number:");
        int sRollNumber=scan.nextInt();//input
        System.out.println("Enter the Math's marks:");

         int mathsMarks = scan.nextInt();//input
        if(mathsMarks<0 || mathsMarks>100)
        {
            System.out.println("Invalid Input, Marks should between 0 to 100");
           System.out.print("Enter the valid marks : "); //to input the valid marks
            mathsMarks = scan.nextInt(); //to input the valid marks
        }




        System.out.println("Enter the Science's marks:");
        int scienceMarks = scan.nextInt();
        if(scienceMarks<0 ||scienceMarks>100)
        {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.out.println("Enter the valid marks : ");
            scienceMarks = scan.nextInt(); //input the valid science marks
        }


        System.out.println("Enter the English's marks:");
        int englishMarks = scan.nextInt();
        if(englishMarks<10 || englishMarks>100)
        {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.out.print("Enter the valid marks : ");
            englishMarks = scan.nextInt(); // input the valid english class
        }
        Program3_Marksheet obj = new Program3_Marksheet(); // obj object created to call the instance method
        obj.markSheet(sName,sRollNumber,mathsMarks,scienceMarks,englishMarks); // calling instance method
        scan.close();

    }
}
