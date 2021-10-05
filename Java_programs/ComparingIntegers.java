package Java_programs;

import java.util.Scanner;

public class ComparingIntegers 
{
    //Main class 
    public static void  main(String[] args) 
    {
        Scanner input = new Scanner(System.in); 
        // Initialize Variables
        
        int num1; //First integer
        int num2; //Second integer

        System.out.print("Enter the first number: ");

        num1 = input.nextInt(); //Read the first integer from the user

        System.out.print("Enter the second number: ");

        num2 = input.nextInt(); //Read the second integer from the user

        if (num1 > num2)
            System.out.printf("%d is larger than %d\n", num1, num2);

        if (num1 < num2)
            System.out.printf("%d is larger than %d\n", num2, num1);

        if (num1==num2)
            System.out.printf("%d is equal to %d\n", num1, num2);

    } //End of the method main

} //End of class
