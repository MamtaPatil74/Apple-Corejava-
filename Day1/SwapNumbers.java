package Day1;

public class SwapNumbers
{
	public static void main(String[] args) 
	{
		
        int num1 = 9, num2 = 5;
        //with using third variable
        int temp = num1;
        num1 = num2;
        num2 = temp;
        
        //without using third variable
//        num1 = num1 - num2;
//        num2 = num1 + num2;
//        num1 = num2 - num1;

        System.out.println("Value of m is " + num1
                           + " and Value of n is " + num2);


	}

}
