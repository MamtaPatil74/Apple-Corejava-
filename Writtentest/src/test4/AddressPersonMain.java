package test4;

public class AddressPersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		Address a1=new Address();
		a1.setCountry("India");
		a1.setCity("Pune");
		a1.setState("Maharashtra");
		
	
		Person p=new Person();
		p.setName("priya");
		p.setGender("Female");
		p.setAge(25);
		p.setAdd(a1);
		
		
		 	System.out.println("\nperson Details: ");
		System.out.println(p.getName()+" "+p.getGender()+" "+p.getAge());

			}



}
