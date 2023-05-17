package org.api;

import java.util.ArrayList;

public class RootClass {
	
	private int id;
	private String name;
	private boolean workingstatus;
	private studentinfo studentinfo;
	private ArrayList<String> course;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public boolean isworkingstatus() {
		return workingstatus;
	}
	public studentinfo getStudentinfo() {
		return studentinfo;
	}
	public ArrayList getCourse() {
		return course;
	}
	public RootClass(int id,String name,boolean workingstatus,studentinfo studentinfo,ArrayList<String> course) {
		super();
		this.id=id;
		this.name=name;
		this.workingstatus=workingstatus;
		this.studentinfo=studentinfo;
		this.course=course;
		
	
	

}
}
