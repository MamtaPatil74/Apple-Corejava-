package test2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		   int n,i, j, flag=0;
		 System.out.println("Enter two Number:");
		 n= sc.nextInt();
		  i= sc.nextInt();
		   for(i=n; i>1; i--)
		   {
		      for (j = i/2; j >= 1; j--) 
		      {
		         if(i%j==0)
		         {
		            flag++;
		            break;
		       
		      }
		      if(flag == 0) {
		         System.out.println(i);
		      }
		      }}

		
		
	}

}
