package BasicProgrammingExcercise;

import java.util.Scanner;

public class SumOfTwoNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number : ");
	     int  a=sc.nextInt();
	     System.out.println("Enter Second number : ");
	     int  b=sc.nextInt();

		int sum;
		sum=a+b;
		System.out.println("Sum is "+sum);
		
	}

}
