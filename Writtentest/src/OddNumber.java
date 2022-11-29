import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
	      
	      System.out.print("Enter two Number: ");
	        int i= sc.nextInt();

int a = sc.nextInt();

while(i > a){
    if ((i % 2) != 0){
        System.out.println(i);
    }
    i--;
}

		
	}

}
