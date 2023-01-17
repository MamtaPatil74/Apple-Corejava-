package ConditionalStatement;

import java.util.Scanner;

public class CheckPositiveNegativezero {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		  Scanner scan=new Scanner(System.in); 
		  
		  System.out.print("Enter the integer number: ");
		  int num=scan.nextInt();//get input from the user for num
		  
		  if(num>0)
		  {
		    System.out.println(num+" is a positive number");
		  }
		  else if(num<0)
		  {
		    System.out.println(num+" is a Negative number");
		  }
		  else
		  {
		    System.out.println("The given number is zero");
		  }
	}

}
