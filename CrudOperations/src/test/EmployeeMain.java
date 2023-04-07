package test;

import java.util.Scanner;

import dao.EmployeeOperations;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeOperations em= new EmployeeOperations();
		em.mainArray();
		em.displayEmployeeData();
//		em.addEmployee();
//		em.displayEmployeeData();
//
//		em.updateSalaryEmployeeData();
//		em.displayEmployeeData();
//		
		em.deleteEmployee();
		em.displayEmployeeData();
		
		em.addEmployee();
		em.displayEmployeeData();
		em.searchEmployee();
		em.displayEmployeeData();

//
//		int choice=0;
//		Scanner sc=new Scanner(System.in) ;
//		System.out.println("   Menu   ");
//		System.out.println("1.mainArray  \n");
//		System.out.println("2.Display  \n"); 
//		System.out.println("3.Add   \n");
//		System.out.println("4. Update \n  ");
//		System.out.println("5.Delete   ");
//		System.out.println("6.Search  \n ");
//		System.out.println("Enter your choice: ");
//		choice=sc.nextInt();
//		do 
//		{
//			
//			switch(choice) {
//			case 1:
//				break;
//			}
//		}
//
//		
	}

}
