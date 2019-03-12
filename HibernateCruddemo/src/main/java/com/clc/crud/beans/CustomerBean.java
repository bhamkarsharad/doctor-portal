package com.clc.crud.beans;

public class CustomerBean {
	
	private int custId;
	private String custFname;
	private String custLname;
	private int age;
	private double custBalance;
	
	public int getCustId() {
		
		System.out.println("qwertyuiasdfgh");
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustFname() {
		return custFname;
	}
	public void setCustFname(String custFname) {
		this.custFname = custFname;
	}
	public String getCustLname() {
		return custLname;
	}
	public void setCustLname(String custLname) {
		this.custLname = custLname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double isCustBalance() {
		return custBalance;
	}
	public void setCustBalance(double d) {
		this.custBalance = d;
	}
	public double getCustBalance() {
		return custBalance;
	}
	@Override
	public String toString() {
		return "CustomerBean [custId=" + custId + ", custFname=" + custFname + ", custLname=" + custLname + ", age="
				+ age + ", custBalance=" + custBalance + "]";
	}
	public CustomerBean(int custId, String custFname, String custLname, int age, double custBalance) {
		super();
		this.custId = custId;
		this.custFname = custFname;
		this.custLname = custLname;
		this.age = age;
		this.custBalance = custBalance;
	}
	public CustomerBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
