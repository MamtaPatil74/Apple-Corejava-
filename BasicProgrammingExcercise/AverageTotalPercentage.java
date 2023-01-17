
package BasicProgrammingExcercise;
//15. Write a Java program to enter marks of five subjects and calculate total, average and percentage.

public class AverageTotalPercentage
{
	public static void main(String[] args)
	{

		int english=70, chemistry=80, computers=95, physics=65, maths=95; 
	    double total, Percentage, Average;
		
		total = english+chemistry+computers+physics+maths;
		Average =english+chemistry+computers+physics+maths / 5;
	    Percentage = (english+chemistry+computers+physics+maths/ 500) * 100;
	    
	    System.out.println(" Total Marks =  " + total);
	    System.out.println(" Average Marks =  " + Average);
	    System.out.println(" Marks Percentage =  " + Percentage);
	}

	}

}
