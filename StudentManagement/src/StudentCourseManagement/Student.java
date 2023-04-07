package StudentCourseManagement;

import java.util.Arrays;

public class Student {

	private int sid;
	private String sName;
	private int age;
	Course course[];
	
	public Student() {
			}
	
	public Student(int sid, String sName, int age, Course[] course) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.age = age;
		this.course = course;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Course[] getCourse() {
		return course;
	}

	public void setCourse(Course[] course) {
		this.course = course;
	}


	public String toString() {
		return "Student :sid=" + sid + ", sName=" + sName + ", age=" + age + ", course=" + Arrays.toString(course);
	}

	
	
}
