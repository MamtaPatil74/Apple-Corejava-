package pojo;

public class Book {

	
	int id,copyno;
	String name,author;
	
	public Book(int id,int copyno,String bname,String author) 
	{
		this.id=id;
		this.copyno=copyno;
		this.name=bname;
		this.author=author;
	
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCopyno() {
		return copyno;
	}
	public void setCopyno(int copyno) {
		this.copyno = copyno;
	}
	public String getbName() {
		return name;
	}
	public void setbName(String bname) {
		this.name = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String toString()
	{
		return id+" "+name+" "+author+" "+copyno;
	}


}
