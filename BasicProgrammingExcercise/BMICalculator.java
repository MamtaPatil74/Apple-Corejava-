package BasicProgrammingExcercise;

import java.util.Scanner;

public class BMICalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Height: ");
	     float height1=sc.nextFloat();
	     System.out.println("Enter Weight: ");
	     float weight=sc.nextFloat();
        
	     
		   float height=height1*30.4f;
			float BMI=(weight)/(height*height);
			System.out.println("Body mass index is " +BMI);

	}

}
