package test2;

public class FrequencyOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int n = 1122322;
		 int d = 2;
		 int c = 0;
		    while (n > 0)
		    { 
		        if (n % 10 == d)
		        c++;
		        n = n / 10;
		    }
		    System.out.println(c);
	}

}
