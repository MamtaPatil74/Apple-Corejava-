package dao;

import java.util.Arrays;
import java.util.Scanner;

import pojo.Employee;

public class EmployeeOperations {

	
	Employee emp[]= new Employee[10];
	Scanner sc= new Scanner(System.in);
	
	public void mainArray()
	{
		
		/*System.out.println("No of Employee to add: ");
		int size= sc.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the id,name,email,dept,salary: ");
			int id=sc.nextInt();
			String name=sc.next();
			String email=sc.next();
			String dept=sc.next();
			int salary=sc.nextInt();
			
			Employee e= new Employee();
			e.setId(id);
			e.setName(name);
			e.setEmail(email);
			e.setDept(dept);
			e.setSalary(salary);
			
			emp[i]=e;
			
		}*/
		/*Employee e= new Employee();
		e.setId(101);
		e.setName("Aadya");
		e.setEmail("aadya@gmail.com");
		e.setDept("HR");
		e.setSalary(70000);
		
		emp[0]=e;*/
		
		emp[0]=new Employee();
		emp[0].setId(101);
		emp[0].setName("Aadya");
		emp[0].setEmail("aadya@gmail.com");
		emp[0].setDept("HR");
		emp[0].setSalary(70000);
		
		emp[1]=new Employee();
		emp[1].setId(150);
		emp[1].setName("Veer");
		emp[1].setEmail("veer@gmail.com");
		emp[1].setDept("Sales");
		emp[1].setSalary(75000);
		
		emp[2]=new Employee();
		emp[2].setId(120);
		emp[2].setName("Ajay");
		emp[2].setEmail("ajay@gmail.com");
		emp[2].setDept("Finance");
		emp[2].setSalary(60000);
		
		emp[3]=new Employee();
		emp[3].setId(100);
		emp[3].setName("Spruha");
		emp[3].setEmail("spruha@gmail.com");
		emp[3].setDept("HR");
		emp[3].setSalary(80000);
	}
	
	
	public void addEmployee()
	{
		//Scanner sc= new Scanner(System.in);
		System.out.println("Enter the id,name,email,dept,salary: ");
		int id=sc.nextInt();
		String name=sc.next();
		String email=sc.next();
		String dept=sc.next();
		int salary=sc.nextInt();
		
		Employee e= new Employee();
		e.setId(id);
		e.setName(name);
		e.setEmail(email);
		e.setDept(dept);
		e.setSalary(salary);
		
		for(int i=0;i<emp.length;i++)
		{
			if(emp[i]==null)
			{
				emp[i]=e;
				break;
			}
		}
	}
	
	public void displayEmployeeData()
	{
		System.out.println(Arrays.toString(emp));
	}
	
	public void updateSalaryEmployeeData()
	{
		System.out.println("Enter the employee id, new Salary");
		int id=sc.nextInt();
		int salary= sc.nextInt();
		
		for(Employee e:emp)
		{
			if(e!=null)
			{
				if(e.getId()==id )
				{
					e.setSalary(salary);
				}
			}
		}
			
	}
	
	public void deleteEmployee()
	{
		Employee e[]= new Employee[emp.length];
		System.out.println("enter the id of emplyee to delete: ");
		int id=sc.nextInt();
		
		int  index=0;
		
		for(int i=0;i<emp.length;i++)
		{
			if(emp[i]!=null)
			{
				if(emp[i].getId()==id)
				{
					index=i;
				}
			}
		}
		int j=0;
		for(int i=0;i<emp.length;i++)
		{
			if(i==index)
			{
				continue;
			}
			else
			{
				e[j]=emp[i];
				j++;
			}
		}
		for(int i=0;i<e.length;i++)
		{
			emp[i]=e[i];
		}
		
	}
	
	public void searchEmployee()
	{
		{
			System.out.println("Enter the employee id to search");
			int id=sc.nextInt();
			int temp=0;
			for(int i=0;i<emp.length;i++)
	{
				if(emp[i].getId()==id) {
					System.out.println("Id is present at "+id+" index.");
				temp++;
				}
				
			}
			if(temp==0)
			{
				System.out.println("Id is not present.");
			}
			

			
	}

	
	}
	}


