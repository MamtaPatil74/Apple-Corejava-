package ConditionalStatement;

import java.util.Scanner;

public class DivisibleBy5And10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        //Scanner class object created
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        //taking a number as user input
        int num=sc.nextInt();
        //checking if number is divisible by both 5 and 11 
        //then print is divisbile by both 5 and 11
        if((num%5==0)&&(num%11==0))
        {
          System.out.println("Number " +num+ " is divisible by both 5 and 11");
        }
        //else print the number is not divisible by both 5 and 11
        else 
        {
          System.out.println("Number " +num+ " is not divisible by both 5 and 11");
        }
	}

}
