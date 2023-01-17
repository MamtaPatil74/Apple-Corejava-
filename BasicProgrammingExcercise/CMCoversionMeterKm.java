package BasicProgrammingExcercise;

import java.util.Scanner;

//Write a java program to enter length in centimeter and convert it into meter and kilometer
public class CMCoversionMeterKm 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length in cm: ");
	     double cm=sc.nextDouble();
       

        double meter,kilometer;
        
        meter=cm/100.0;
        kilometer=cm/100000.0;
        
        System.out.println("length in meter :"+meter);
        System.out.println("length in kilometer :"+kilometer);

	}

}
