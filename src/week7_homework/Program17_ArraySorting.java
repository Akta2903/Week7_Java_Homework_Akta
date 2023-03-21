package week7_homework;

import java.util.Arrays;

/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */

public class Program17_ArraySorting
{
    public static void main(String[] args)
    {
        Program17_ArraySorting obj = new Program17_ArraySorting(); //obj object created to call the instance method
        obj.numericArraySorting(); //calling instance method
        stringArray(); // calling static method

    }
    public void numericArraySorting () //declaring instance method
    {
        int a[] = {11,20,5,9,10,60,2,56,40,22}; // declaring numeric array
        System.out.println("Original numeric array : "+ Arrays.toString(a));
        Arrays.sort(a); // sorting the array
        System.out.println("Numeric array after sorting : "+ Arrays.toString(a)); //output the sorted array

    }
    public static void stringArray() // declaring static method
    {
        String name[] = {"Akta","Khushi","Aesha","Dhara","Bhavika","Parul","Hiral","Ishita","Roma"}; // declaring string array
        //System.out.println();
        System.out.println("Original string array : "+ Arrays.toString(name));
        Arrays.sort(name); // sorting array
        System.out.println("String array after sorting : "+ Arrays.toString(name)); //output the sorted string array

    }
}
