package com.venkat;

public class LoanPayment {

	private int loanNp;
	private long accountNo;
	private double interest;
	private double loanPayment;
	
	public int getLoanNp() {
		return loanNp;
	}
	public void setLoanNp(int loanNp,long accountNo) {
		this.loanNp = loanNp;
		this.accountNo = accountNo;
	}
	public long getAccountNo() {
		return accountNo;
	}
	
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public double getLoanPayment() {
		return loanPayment;
	}
	public void setLoanPayment(double loanPayment) {
		this.loanPayment = loanPayment;
	}
}
