package BasicProgrammingExcercise;

import java.util.Scanner;

public class DaysConversion 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of days: ");
	     int days=sc.nextInt();
       
      int years = (days / 365);
      int weeks = (days % 365) / 7;
          days  = (days % 365) % 7;

     
     System.out.println("Year/s = " + years);
     System.out.println("Week/s = " + weeks);
     System.out.println("Day/s  = " + days);


		
	}

}
