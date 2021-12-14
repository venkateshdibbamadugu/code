package com.venkat;

public class Update {

	private long account_No;
	private String customerName;
	private String date_of_birth;
	private String gender;
	private String fatherName;
	private String motherName;
	private long adharNo;
	private String rationNo;
	private long mobile;
	private String customerAddress;
	public long getAccount_No() {
		return account_No;
	}
	public void setAccount_No(long account_No) {
		this.account_No = account_No;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public long getAdharNo() {
		System.out.println("getadhhar="+adharNo);
		return adharNo;
	}
	public void setAdharNo(long adharNo) {
		System.out.println("setadhhar="+adharNo);
		this.adharNo = adharNo;
	}
	public String getRationNo() {
		return rationNo;
	}
	public void setRationNo(String rationNo) {
		this.rationNo = rationNo;
	}
	public long getMobile() {
		System.out.println("getmob="+mobile);
		return mobile;
	}
	public void setMobile(long mobile) {
		System.out.println("setmob="+mobile);
		this.mobile = mobile;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	
}
