import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter two Number: ");
	        int i= scan.nextInt();
	    int n = scan.nextInt();
	    
	
      while (i<=n) {

          if (i%2==0) {
              System.out.print(i+"  ");
          }
          i++;
      }


	}

}
