package week7_homework;

/**
 * 19. Write a Java program to calculate the average value of array elements.
 */
public class Program19_AverageOfArray
{
    public static void main(String[] args)
    {
        Program19_AverageOfArray obj = new Program19_AverageOfArray(); // obj object created to call the instance method
        obj.averageOfArray(); // calling instance method
    }
    public void averageOfArray()
    {
        int avg[] = {10,20,20,30,80}; //declaring array
        int ans=0;
        for(int i=0;i<avg.length;i++)
        {
            ans=ans+avg[i]; //addition of array element until the array length
        }
        double average = ans/ avg.length; // calculating
        System.out.println("Average of Array is: " + average); //output the average of array

    }
}
