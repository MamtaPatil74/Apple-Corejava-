package StudentCourseManagement;

import java.util.Scanner;

public class CourseTest {


	static Scanner sc=new Scanner(System.in);
	static int x=0;
	public void addCourse(Course c) 
	{
	System.out.println("Enter the id: ");
     c.setId(sc.nextInt());
	System.out.println("Enter the name: ");
	c.setName(sc.next());
	System.out.println("Enter the fees: ");
	c.setFees(sc.nextFloat());
	
	}
	
	public void deleteCourse(Course ct[],int id1){
		boolean flag=true;
		for(int i=0;i<x;i++)
		{
			if(ct[i].getId()==id1)
			{
				flag=true;
				System.out.println(ct[i].getId()+" "+ct[i].getName()+" "+ct[i].getFees());
				for(int j=i;j<x-1;j++) {
					ct[j]=ct[j+1];
				}
				ct[x-1]=null;
				System.out.println("Course "+id1+" delete sucessfully");
				if(!flag) {
					System.out.println("Course not found ");
				}
				break;
			}
		}
	}
	public void updateCourse(Course ct[],int id) {
	
		boolean status=false;
		for(int i=0;i<x;i++) {
			if(ct[i].getId()==id) {
				status=true;
				System.out.println(ct[i].getName()+" "+ct[i].getFees());
				System.out.println("Enter the name: ");
				ct[i].setName(sc.next());
				System.out.println("Enter the fees: ");
				ct[i].setFees(sc.nextFloat());
			}
		}
		if(!status)
		{
			System.out.println("Id not Found");
		}
	}
	
	public void displayCourse(Course ct[]) {
		
		for(int i=0;i<x;i++) {
			System.out.println(ct[i]);
		}
	}
	
	public static void displayCourseById(Course[] c,int id2) {
		
		for(int i=0;i<x;i++) {
			if(c[i].getId()==id2)
				System.out.println(c[i].toString());
		}
	}
	
	public static void main(String args[]) {
	
		CourseTest ct=new CourseTest();
		Course c1[]=new Course[3];
		
//		for(int i=0;i<c1.length;i++) {
//			c1[i]=new Course();
//			ct.addCourse(c1[i]);
//		}
		
		/*System.out.println("Enter the Course id to update: ");
		int id=sc.nextInt();
		
		ct.updateCourse(c1, id);
		ct.displayCourse(c1);
		
		System.out.println("Enter Course id to delete: ");
		int id1=sc.nextInt();
		ct.deleteCourse(c1, id1);
		ct.displayCourse(c1);*/
		
		String s="";

		do {
			System.out.println("Crud Operations");
			System.out.println("\n1.addCourse \n2.deleteCourse \n3.updateCourse \4.displayCourse");
			System.out.println("Enter the Choice: ");
			int ch=sc.nextInt();
			
			switch(ch) {
			
			case 1:
				// for(int i=0;i<c1.length;i++) {
				if(x<c1.length) {
					c1[x]=new Course();
                    ct.addCourse(c1[x]);
				// }
				}
				else {
					System.out.println("You have already added");
				}
				 break;
				
			case 2:
			       System.out.println("Enter the id to delete: ");
			       int id1=sc.nextInt();
			       ct.deleteCourse(c1, id1);
			       break;
				
			case 3:
			       System.out.println("Enter the id to update: ");
			       int id=sc.nextInt();
				   ct.updateCourse(c1, id);
				   break;
				
			case 4:
				ct.displayCourse(c1);
				break;
				
             default:System.out.print("Enter valid choice..!!");
             
             case 5:
			       System.out.println("Enter the id to view the course: ");
			       int id2=sc.nextInt();
            	 ct.displayCourseById(c1,id2);
            	 break;
			}
			System.out.println(" Do you want to continue  Y/N");
             ch=sc.next().charAt(0);
		} while(s.equalsIgnoreCase("Y"));


		
	}

}
