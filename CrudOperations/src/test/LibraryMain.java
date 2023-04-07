package test;

import java.util.Scanner;

import dao.Library;

public class LibraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Library l=new Library();
		String s="";
		do {
			System.out.println("");
			System.out.println("1.issuebook\n"+
			"2.returnbook\n" +"3.viewbook\n" + "4.checkbook\n"+"5.bookdetails\n");
			
			
			System.out.println("Enter your Choice !");
			int ch=sc.nextInt();
			
			switch(ch) {
			
			case 1:
				l.issueBook();
				l.viewBook();
				break;
				
			case 2:
				l.returnBook();
				l.viewBook();
				break;
				
			case 3:
				l.viewBook();
				break;
				
			case 4:
				l.availableBooks();
				break;
			case 5:
				l.bookIssueDetails();
				break;
             default:System.out.print("Enter valid choice..!!");

			}
			System.out.println(" Do you want to continue  Y/N");
             ch=sc.next().charAt(0);
		} while(s.equalsIgnoreCase("Y"));
	}

}
