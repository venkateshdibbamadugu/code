package com.venkat;
import java.util.*;
import java.time.LocalDate;

public class MiniStatement {
	     private long account_No=0;
	     private String accType=null;
		 private String date=null;
         private String particular=null;
         private double withDraw=0;
         private double deposite=0;
         static double balance=0;
         private int id=1;
         
         public int getId()
         {
        	 return id;
         }
          
        public long getAccount_No() {
			return account_No;
		}
		public void setAccount_No(long account_No) {
			
			this.account_No = account_No;
			
		}
		public String getAccType() {
  			return accType;
  		}
  		public void setAccType(String accType) {
  			this.accType = accType;
  		}
		public String getDate() {
			return date;
		}
		public void setDate(String date1) {
			LocalDate date=LocalDate.now();
			date1= date.toString();
			this.date =date1;
		}
		public String getParticular() {
			return particular;
		}
		public void setParticular(String particular) {
			this.particular = particular;
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
			MiniStatement m=new MiniStatement();
			//System.out.println(deposite);
			m.setBalance(deposite);
		}
		public double getBalance() {
			//System.out.println("getbalance="+balance);
			return balance;
		}
		public void setBalance(double balance) {
			//System.out.println(balance);
			this.balance = balance;
		}
}
