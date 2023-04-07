package dao;

import java.awt.print.Book;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import pojo.Student1;
import pojo.Transaction;

public class Library {

	Book books[]=new Book[5];
	Student1[] s=new Student1[2];
	Transaction[] tra =new Transaction[5];
	boolean bookAvailable=true;
	
	Scanner sc=new Scanner(System.in);
	
	public Library()
	{
		books[0]=new Book(101,2,"C language","v.p " );
		books[1]=new Book(102,4,"Core java language","madhukar");
		books[2]=new Book(103,2,"Advance java", " ravi");
		books[3]=new Book(104,3,"MYsql","v.p ","jaya");
		books[4]=new Book(105,1,"C++language","v.p ","raj pillay");
	}
		
	public void viewBook() {	
		
		for(Book x:books) {
			System.out.println(x);
		}
		for(Transaction x:tra)
		{		
		System.out.println(x);
		
		}	
	}
	
	public void issueBook() {
		Student1 s1=new Student1();
		Book b=new Book();
		System.out.println("Enter the Students details");
		int id=sc.nextInt();
		String name=sc.next();
		String email=sc.next();
		int c=sc.nextInt();
		String dept=sc.next();
		s1.setId(id);
		s1.setName(name);
		s1.setEmail(email);
		s1.setContact(c);
		s1.setDept(dept);
		for(int i=0;i<s.length;i++) 
		{
			if(s[i]==null) {
				s[i]=s1;
				break;
			}
		}
		
}
	public void returnBook() {
		
	}
	
	public void availableBooks(){
		
	}
	public void bookIssueDetails() {
		
	}
	
}