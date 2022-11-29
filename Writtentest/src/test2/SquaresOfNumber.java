package test2;
import java.util.Scanner;
public class SquaresOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter range : ");
		int n = sc.nextInt();
		
		System.out.println("The squares in given range : ");
		for(int i=1;i<=n;i++) {
			System.out.println(i*i);
		}

		
	}

}
