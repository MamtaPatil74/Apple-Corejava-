package test3;

import java.util.Scanner;

public class NationalGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Scanner in = new Scanner(System.in);
		 System.out.println("1.India \n2.China \n3. Bangladesh  \n4 Italy \n5 Football");
	      System.out.println("Enter the choice: ");
		  int ch = in.nextInt();
		  
		  switch(ch)
		  {
		  case 1:
			  System.out.println("hockey");
			  break;
		  case 2:
			  System.out.println("Table Tennis");
			  break;
		  case 3:
			 System.out.println("Kabaddi");
			  break; 
		 case 4:
			System.out.println("Football");
			break;
		 case 5:
				System.out.println("Baseball");
				break;
			default:
				System.out.println("Enter a valid Country....!!!");

		

	}
	}
}
