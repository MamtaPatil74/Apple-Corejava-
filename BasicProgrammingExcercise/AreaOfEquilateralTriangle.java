package BasicProgrammingExcercise;

import java.util.Scanner;

//14. Write a Java program to calculate area of an equilateral triangle.

public class AreaOfEquilateralTriangle 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to calculate area: ");
		float a=sc.nextFloat();
	    
        double area = ( 1.73 * a*a) / 4 ;  
        
        System.out.println("Area of Equilateral Triangle is : "+area);  
	}

}
