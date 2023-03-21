package week7_homework;

/**
 * 18. Write a Java program to sum values of an array
 */

public class Program18_SumOfArray
{
    public static void main(String[] args) // declaring main method
    {
        arrayAddition();
    }
    public static void arrayAddition() // declaring static method
    {
        int sum[] = {10,20,20,30,80,90,45,98}; //declaring array
        int ans=0;
        for(int i=0;i<sum.length;i++)
        {
             ans=ans+sum[i]; //addition of array element until the array length
        }
        System.out.println("Sum of Array is: " + ans); //output the sum of array

    }
}
