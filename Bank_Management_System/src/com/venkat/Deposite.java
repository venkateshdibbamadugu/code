package com.venkat;
import java.time.LocalDate;

import com.venkat.DataBaseImplementation;

public class Deposite {

	 private long account_No=0;
     private String accType=null;
     private String particular=null;
     static double withDraw=0;
     static double deposite=0;
     static double balance=0;
     static int id=0;
     
     public int getId()
     {
    	 return id;
     }
     public void setId(int id)
     {
    	 id++;
    	 this.id=id;
     }
	public long getAccount_No() {
		return account_No;
	}
	public void setAccount_No(long account_No) {
		this.account_No = account_No;
		Deposite d=new Deposite();
		DataBaseImplementation db=new DataBaseImplementation();

		int x=db.getId(account_No);
		d.setId(x);
		double redeposite=db.retriveDeposite(account_No);
	//	System.out.println("redeposite"+redeposite);
		
		d.setBalance(redeposite);
		
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public String getDate() {
		LocalDate date=LocalDate.now();
		return date.toString();
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
	//	dep=deposite;
	//	System.out.println("jjj="+dep);
		this.deposite = deposite;
		
	}
	public static double getBalance() {
		return balance;
	}
	public  void setBalance(double balance) {
		//System.out.println("balance"+balance);
		//System.out.println("deposite"+dep);
	//	System.out.println("deposite="+deposite);
		
			Deposite.balance = deposite+balance;
			//System.out.println("innner");
		
		
	}
     
}
