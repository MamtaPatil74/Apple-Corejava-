package BasicProgrammingExcercise;

import java.util.Scanner;

//Write a java program to enter temperature in celsius and convert into Fahrenhit.
public class CelciusIntoFahrenhit 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temperature in celsius: ");
	     double celsius=sc.nextDouble();

	   double fahrenhit=(celsius*1.8)+32; //((celsius*9)/5)+32
	    
	    System.out.println("Temperature in fahrenhit is "+fahrenhit);

	}

}
