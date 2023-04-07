package pojo;

public class Student1 {

	int id,contact ;
	String name ,email,dept;
	
	public Student1(int id,int contact,String name,String email,String dept) 
	{
		this.id=id;
		this.contact=contact;
		this.name=name;
		this.email=email;
		this.dept=dept;
		
	}
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String toString()
	{
		return id+" "+name+" "+email+" "+dept+" "+contact;
	}

	
	
}
