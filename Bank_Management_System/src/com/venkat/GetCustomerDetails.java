package com.venkat;

public class GetCustomerDetails {
	
	//Customer Details
	
	     private long account_No;
	     private String holder_Name;
	     private String gender;
	     private String father_Name;
	     private String customer_Address;
	     private String bankName;
	     private String bankAddress;
		public long getAccount_No() {
			return account_No;
		}
		public void setAccount_No(long account_No) {
			this.account_No = account_No;
		}
		public String getHolder_Name() {
			return holder_Name;
		}
		public void setHolder_Name(String holder_Name) {
			this.holder_Name = holder_Name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getFather_Name() {
			return father_Name;
		}
		public void setFather_Name(String father_Name) {
			this.father_Name = father_Name;
		}
		public String getCustomer_Address() {
			return customer_Address;
		}
		public void setCustomer_Address(String customer_Address) {
			this.customer_Address = customer_Address;
		}
		public String getBankName() {
			return bankName;
		}
		public void setBankName(String bankName) {
			this.bankName = bankName;
		}
		public String getBankAddress() {
			return bankAddress;
		}
		public void setBankAddress(String bankAddress) {
			this.bankAddress = bankAddress;
		}
		
		
		
		
		//Mini Statement Details
		
		private String date;
		private String time;
		private double withDraw;
		private double deposite;
		private double total_Balance;
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}
		public double getWithDraw() {
			return withDraw;
		}
		public void setWithDraw(double withDraw) {
			this.withDraw = withDraw;
		}
		public double getDeposite() {
			return deposite;
		}
		public void setDeposite(double deposite) {
			this.deposite = deposite;
		}
		public double getTotal_Balance() {
			return total_Balance;
		}
		public void setTotal_Balance(double total_Balance) {
			this.total_Balance = total_Balance;
		}
		
		
		
		// Customer Loan Details
		
		private int loan_No;
		private String typeofLoan;
		private double loan_Amount;
		private float interest;
		private double payment;
		public int getLoan_No() {
			return loan_No;
		}
		public void setLoan_No(int loan_No) {
			this.loan_No = loan_No;
		}
		public String getTypeofLoan() {
			return typeofLoan;
		}
		public void setTypeofLoan(String typeofLoan) {
			this.typeofLoan = typeofLoan;
		}
		public double getLoan_Amount() {
			return loan_Amount;
		}
		public void setLoan_Amount(double loan_Amount) {
			this.loan_Amount = loan_Amount;
		}
		public float getInterest() {
			return interest;
		}
		public void setInterest(float interest) {
			this.interest = interest;
		}
		public double getPayment() {
			return payment;
		}
		public void setPayment(double payment) {
			this.payment = payment;
		}
		
		

}
