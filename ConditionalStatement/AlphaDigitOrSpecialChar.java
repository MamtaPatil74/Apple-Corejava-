package ConditionalStatement;

import java.util.Scanner;

public class AlphaDigitOrSpecialChar 
{

	public static void main(String[] args) 
	{
		

        Scanner inp= new Scanner(System.in);
        System.out.print("Enter the Character: ");
       
        char ch=inp.next().charAt(0);
       
        if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
        {
            System.out.println(ch+" is an Alphabet.");
        }
       
        else if(ch>=48 && ch<=57)
        {
            System.out.println(ch+" is a digit.");
        }
        else
        {
            System.out.println(ch+" is a special character.");
        }

	}

}
