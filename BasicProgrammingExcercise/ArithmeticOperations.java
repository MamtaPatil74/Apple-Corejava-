package BasicProgrammingExcercise;
//write a java program to enter two number and perform all the arithmetic operations

import java.util.Scanner;

public class ArithmeticOperations 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1=sc.nextInt();
		System.out.println("Enter num2: ");
		int num2=sc.nextInt();

	int sum,difference,product,quotient,modulo;
	
	sum=num1+num2;
	difference=num1-num2;
	product=num1*num2;
	quotient=num1/num2;
	modulo=num1%num2;
	
	System.out.println("Sum is "+sum);
	System.out.println("Difference is "+difference);
	System.out.println("Product is "+product);
	System.out.println("Quotient is "+quotient);
	System.out.println("Modulo is "+modulo);


	}

}
