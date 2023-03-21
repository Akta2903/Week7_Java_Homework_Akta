package week7_homework;

/**
 * 11. Write a java program to print the numbers between 1 to 100 which can be divided by 3  and 5 separately.
 */

public class Program11_DividedBy3Or5
{
    public static void main(String[] args)
    {
        dividedBy3(); // static method
        System.out.println(" "); // to print the blank line between two output
        Program11_DividedBy3Or5 obj = new Program11_DividedBy3Or5(); // obj object created for calling the instance method
        obj.dividedBy5(); // calling instance method into main method
    }
    public static void dividedBy3() // calculation for numbers 1 to 100 which are divided by 3
    {
        System.out.print("The values divided by 3 are: " );
        for(int i=1;i<=100;i++)
        {
            if(i%3==0)
            {

               // System.out.print("The values divided by 3 are: " );
                System.out.print(i + ","); // output numbers divided by 3
            }
        }
    }
    public void dividedBy5() // calculation for numbers 1 to 100 which are divided by 5
    {
        System.out.print("The values divided by 5 are: "  );
        for(int i=1;i<=100;i++)
        {
            if(i%5 == 0)
            {
              System.out.print( i + ","); // output numbers divided by 5
            }
        }
    }
}
