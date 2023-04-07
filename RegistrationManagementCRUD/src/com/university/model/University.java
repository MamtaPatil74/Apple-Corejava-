package com.university.model;

import java.util.ArrayList;

public class University {

	private static int uid;
	private static String uname;
	ArrayList<Course> cs;
	ArrayList<Student> stud;
	
	static {
		uid=13201;
		uname="MIT University";
		
	}

	public University() {
		cs=new ArrayList<>();
		cs.add(new Course(101,"Bca",9000));
		cs.add(new Course(102,"Be",15000));
		cs.add(new Course(103,"Mba",12000));

	}
	public static int getUid() {
		return uid;
	}

	public static void setUid(int uid) {
		University.uid = uid;
	}

	public static String getUname() {
		return uname;
	}

	public static void setUname(String uname) {
		University.uname = uname;
	}

	public ArrayList<Course> getCs() {
		return cs;
	}

	public void setCs(ArrayList<Course> cs) {
		this.cs = cs;
	}

	public ArrayList<Student> getStud() {
		return stud;
	}

	public void setStud(ArrayList<Student> stud) {
		this.stud = stud;
	}

	@Override
	public String toString() {
		return "University [cs=" + cs + ", stud=" + stud + "]";
	}
	
}
