package BasicProgrammingExcercise;
//Write a java program to enter length and breadth of a rectangle and find its perimeter

import java.util.Scanner;

public class PerimeterOfRectangle 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter breadth: ");
	     int  breadth=sc.nextInt();
	     System.out.println("Enter length: ");
	     int  length=sc.nextInt();

       int perimeter;
       perimeter=2*(length+breadth);
       System.out.println("Perimeter of Rectangle is :"+perimeter);
    		   
	}

}
