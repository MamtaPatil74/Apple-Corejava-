package pojo;

public class Transaction {

	Student1 s;
	String bName,issueDate,returnDate;
	
	
	public Transaction(Student1 s,String bName,String issueDate,String returnDate) 
	{
		this.s=s;
		this.bName=bName;
		this.issueDate=issueDate;
		this.returnDate=returnDate;
		
	}


	public Student1 getS() {
		return s;
	}


	public void setS(Student1 s) {
		this.s = s;
	}


	public String getbName() {
		return bName;
	}


	public void setbName(String bName) {
		this.bName = bName;
	}


	public String getIssueDate() {
		return issueDate;
	}


	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}


	public String getReturnDate() {
		return returnDate;
	}


	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	
	
	public String toString()
	{
		return s+" "+bName+" "+issueDate+" "+returnDate;
	}

	
}
