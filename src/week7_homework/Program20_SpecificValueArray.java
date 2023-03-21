package week7_homework;

/**
 * 20. Write a Java program to test if an array contains a specific value.
 */

public class Program20_SpecificValueArray
{
    public static void main(String[] args) // declaring main method
    {
        int myara[] = {10,20,30,40,50,60}; // declaring array

        System.out.println("Array cotains 30: " + arraySpecific(myara,30) ); // output
        System.out.println("Array cotains 80 :" + arraySpecific(myara,80) );

    }
    public static boolean arraySpecific(int[] a , int b) // declaring static method
    {
        for(int i:a)
        {
            if(b==i)
            {
                return true; // returns true if array contains the specific value
            }

        }
        return false; // returns false if array doesn't contain the specific value
    }

}
