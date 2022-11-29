package test3;

import java.util.Scanner;

public class Box {

	int length, breadth, height;
	
  void box(int l,int b,int h)
	{
		length=l;
		breadth=b;
		height=h;
		

		
	}
  void display()
	{
		int volume=length*breadth*height;
		System.out.println("Volume of Box is:" +volume);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);


		 System.out.println("Enter the length:");
		int length=sc.nextInt();
		 System.out.println("Enter the breadth:");
		int breadth=sc.nextInt();
		 System.out.println("Enter the height:");
	int	 height=sc.nextInt();
		
			Box b=new Box();
			b.box(length, breadth, height);
			b.display();

	}

}
