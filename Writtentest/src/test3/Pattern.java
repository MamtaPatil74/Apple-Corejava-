package test3;

public class Pattern {

	void starPattern()
	{		
		for(int i=1;i<=4;i++)
		{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
	System.out.println();}
		
	} 
	
	void pattern()
	{
	
	for(int i=1; i<=4; i++){
		  for(int j=1; j<=i; j++)
		  {
		  if(i%2==1){
		      System.out.print("0");
		  }
		  else{
		      System.out.print("1");
		  }
		  
		}
		System.out.println();
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern p1= new Pattern();
		p1.starPattern();
		
		Pattern p2= new Pattern();
		p2.pattern();
	}

}
