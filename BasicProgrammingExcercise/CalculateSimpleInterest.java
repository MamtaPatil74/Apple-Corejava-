package BasicProgrammingExcercise;
//16. Write a Java program to enter P, T, R and calculate Simple Interest.

import java.util.Scanner;

public class CalculateSimpleInterest {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principal: ");
	     float principal=sc.nextFloat();
	     System.out.println("Enter rate: ");
	     float rate=sc.nextFloat();
	     System.out.println("Enter time: ");
	     float time=sc.nextFloat();


        float P = 10000, R = 5, T = 5;
  
        // Calculate simple interest
        float SI = (P * T * R) / 100;
        
        System.out.println("Simple interest = " + SI);
    
	}

}
