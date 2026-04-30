package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="MIT_Student")
public class Student {
	
	
	@Id
	@Column(name="Student_ID",unique=true)
	private int id;
	
	@Column(name="Student_NAME")
	private String name;
	
	@Column(name="Student_EMAIL",unique=true)
	private String email;
	
	@Column(name="Student_MOBILE_NO",unique=true)
	private float mobileNo;
	
	@Column(name="Student_ADDRESS")
	private String address;
	
	@Column(name="Student_Branch")
	private String branch;
	
	@Column(name="Student_CGPA")
	private double cgpa;

	
	
	public Student(int id, String name, String email, float mobileNo, String address, String branch, double cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.address = address;
		this.branch = branch;
		this.cgpa = cgpa;
	}

	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
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



	public float getMobileNo() {
		return mobileNo;
	}



	public void setMobileNo(float mobileNo) {
		this.mobileNo = mobileNo;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getBranch() {
		return branch;
	}



	public void setBranch(String branch) {
		this.branch = branch;
	}



	public double getCgpa() {
		return cgpa;
	}



	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", mobileNo=" + mobileNo + ", address="
				+ address + ", branch=" + branch + ", cgpa=" + cgpa + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
