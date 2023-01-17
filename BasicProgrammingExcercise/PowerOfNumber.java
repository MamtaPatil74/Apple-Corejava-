package BasicProgrammingExcercise;

import java.util.Scanner;

public class PowerOfNumber 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base: ");
	     int  base=sc.nextInt();
	     System.out.println("Enter exponent: ");
	     int  exponent=sc.nextInt();

	   double result=Math.pow(base, exponent);
	   System.out.println("power is "+result);
        
	}

}
