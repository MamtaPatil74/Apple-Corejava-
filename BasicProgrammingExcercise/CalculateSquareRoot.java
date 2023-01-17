package BasicProgrammingExcercise;

import java.util.Scanner;

public class CalculateSquareRoot 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
	     double num=sc.nextDouble();
       
       double root = (double)Math.sqrt(num);

       
        System.out.println("\nSquare root of:: " + num + " = " + root + "\n");

	}

}
