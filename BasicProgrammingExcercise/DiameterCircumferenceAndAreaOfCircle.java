package BasicProgrammingExcercise;

import java.util.Scanner;

//write a java program to enter radius of circle and find its diameter,circumference and area
public class DiameterCircumferenceAndAreaOfCircle
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius: ");
	     float radius=sc.nextFloat();
       

      float PI=3.141f;
      float diameter,circumference,area;
     
      diameter=2*radius;
      circumference=2*PI*radius;
      area=PI*(radius*radius);
      
      System.out.println("Diameter of circle is :"+diameter+" units");
      System.out.println("circumference of circle is :"+circumference+" units");
      System.out.println("area of circle is :"+area+" sq.units");


	}

}
