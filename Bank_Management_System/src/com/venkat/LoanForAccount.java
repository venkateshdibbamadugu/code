package com.venkat;

import com.venkat.DataBaseImplementation;
import java.time.LocalDate;

public class LoanForAccount {
	
	static int loan_No=10000;
	private long account_No;
	private String typeOfLoan;
	private double LoanAmount;
	private float interest;
	private double payamount;
//	private String date;
	public int getLoan_No() {
		return loan_No;
	}
	public void setLoan_No(int loan_No) {
		if(loan_No==0)
		{
			
			loan_No=10000+1;
			this.loan_No=loan_No;
			System.out.println(loan_No);
		}
		else
		{
			loan_No++;
			
		    this.loan_No = loan_No;
		}
	}
	public long getAccount_No() {
		return account_No;
	}
	public void setAccount_No(long account_No) {
		this.account_No = account_No;
		DataBaseImplementation db=new DataBaseImplementation();
		int x=db.retriewMaxLoanNo();
		System.out.println("loan_no="+x);
		LoanForAccount l=new LoanForAccount();
		l.setLoan_No(x);
		
		
	}
	public String getTypeOfLoan() {
		return typeOfLoan;
	}
	public void setTypeOfLoan(String typeOfLoan) {
		this.typeOfLoan = typeOfLoan;
	}
	public double getLoanAmount() {
		return LoanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.LoanAmount = loanAmount;
	}
	public float getInterest() {
		return interest;
	}
	public void setInterest(float interest) {
		this.interest = interest;
	}
	public double getPayamount() {
		return payamount;
	}
	public void setPayamount(double payamount) {
		this.payamount = payamount;
	}
	public String getDate() {
		LocalDate date=LocalDate.now();
		return date.toString();
	}
	
	

	//create table LoanTransction(loan_No int,account_No Number(15),typeOfLoan varchar(15),loanAmount float,interest float,paid float,dateLoan varchar(10));
}
