package StudentCourseManagement;

import java.util.Scanner;

public class StudentTest {

	static Scanner sc=new Scanner(System.in);
    public  static void addStudent(Student s) {
		System.out.println("Enter the Students Id: ");
		int id=sc.nextInt();
		System.out.println("Enter the Students name: ");
		String name=sc.next();
		System.out.println("Enter the Students age: ");
        int age=sc.nextInt();
	}
	
	public static void deleteStudent(Student st[],int id){
		int len=st.length-1;
		Student s[]=new Student[len];
		int index=0;
		for(int i=0;i<st.length;i++) {
			if(st[i]!=null) {
			if(st[i].getSid()==id) {
				index=i;
			}
		}
	}
	int j=0;
	for(int i=0;i<st.length;i++) {
		if(i==index) {
			continue;
		}
		else {
			s[i]=st[i];
			j++;
		}
		
	}
	for(int i=0;i<s.length;i++) {
		st[i]=s[i];
	}

		
	}
	
	public static void updateStudent() {
		
	}
	
	public static void displayStudent(Student st[]) {
		for( Student s:st) 
		{
			System.out.println(s);
		}
	}
	
	public static void main(String args[]) {
	StudentTest st=new StudentTest();
	Student s[]=new Student[3];
	
	for(int i=0;i<s.length;i++) {
		s[i]=new Student();
		st.addStudent(s[i]);
	}

	String s="";
	do {
		System.out.println("");
		
		System.out.println("Crud Operations");
		System.out.println("\n1.addStudent \n2.deletestudent \n3.updatestudent \4.displayStudent");

		System.out.println("Enter your Choice !");
		int ch=sc.nextInt();
		
		switch(ch) {
		
		case 1:
			st.addStudent();
			break;
			
		case 2:
			st.deleteStudent();
			break;
			
		case 3:
			st.updateStudent();
			break;
			
		case 4:
			st.displayStudent();
			break;
         default:System.out.print("Enter valid choice..!!");

		}
		System.out.println(" Do you want to continue  Y/N");
         ch=sc.next().charAt(0);
	} while(s.equalsIgnoreCase("Y"));

	

	
	
		
	}
	

}
