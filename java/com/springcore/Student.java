package com.springcore;

public class Student {
	private Integer Id;
	private String studentName;
	private String studentAddress;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public Student(Integer id, String studentName, String studentAddress) {
		super();
		Id = id;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", studentName=" + studentName + ", studentAddress=" + studentAddress + "]";
	}

}
