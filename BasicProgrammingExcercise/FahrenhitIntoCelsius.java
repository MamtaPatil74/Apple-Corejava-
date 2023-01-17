package BasicProgrammingExcercise;

import java.util.Scanner;

//write a java program to enter temperature in fahrenhit and convert it into celsius
public class FahrenhitIntoCelsius 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenhit : ");
	     double fahrenhit=sc.nextDouble();

      double celsius;
      celsius=(fahrenhit-32)/1.8;
      System.out.println("temperature in celsius :"+celsius);

	}

}
