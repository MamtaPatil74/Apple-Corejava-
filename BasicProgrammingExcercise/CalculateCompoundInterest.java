package BasicProgrammingExcercise;

import java.util.Scanner;

//17. Write a Java program to enter P, T, R and calculate Compound Interest.
public class CalculateCompoundInterest
{

	public static void main(String[] args) 
	{
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principal: ");
	     double principal=sc.nextDouble();
	     System.out.println("Enter rate: ");
	     double rate=sc.nextDouble();
	     System.out.println("Enter time: ");
	     double time=sc.nextDouble();
         
        /* Calculate compound interest */
        double CI = principal *
                    (Math.pow((1 + rate / 100), time));
          
        System.out.println("Compound Interest is "+ CI);
	}

}
