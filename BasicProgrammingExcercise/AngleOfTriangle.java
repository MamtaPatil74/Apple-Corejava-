package BasicProgrammingExcercise;

import java.util.Scanner;

//12. Write a Java program to enter two angles of a triangle and find the third angle.

public class AngleOfTriangle 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first angle: ");
		int p=sc.nextInt();
		System.out.println("Enter Second angle: ");
		int q=sc.nextInt();
		
        // Compute third angle
       int r = 180 - (p + q);

        System.out.println("\nThird angle of the triangle = " + r + "\n");

	}

}
