package com.venkat;

public class CustomerDetails {

	//declaring Data members
	static long account_No;
	private String customerName;
	private String date_of_birth;
	private String gender;
	private String fatherName;
	private String motherName;
	private long adharNo;
	private String rationNo;
	private long mobile;
	private String customerAddress;
	private String bankName;
	private String accountType;
	static String branchAddress;
	
	
	// Declaring Member functions;
	
	
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
		return adharNo;
	}
	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}
	public String getRationNo() {
		return rationNo;
	}
	public void setRationNo(String rationNo) {
		this.rationNo = rationNo;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName,String accountType) {
		DataBaseImplementation db=new DataBaseImplementation();
		CustomerDetails c=new CustomerDetails();
		this.bankName = bankName;
		this.accountType=accountType;
		long accountNo1=0;
		 long accountNo=0;
	//	branchAddress=null;
		switch(bankName)
		{
		case "State bank of india":
			branchAddress="State Bank of India,padur,chennai,523331";
		    accountNo1=91000000000l;
		    accountNo=db.getAccountNo(bankName);
		    
		   if(accountNo>910000000l)
		   {
		   accountNo++;
		   accountNo1=accountNo;
		   }
		   else
		   {
			   accountNo1++;
		   }
			c.setAccount_No(accountNo1);
			//c.setBranchAddress(branchAddress);
		   
			
			break;
			
		case "Andhra Bank":
			
		    branchAddress="Andhra Bank,padur,chennai,523331";
		    accountNo1=81000000000l;
		    accountNo=db.getAccountNo(bankName);
		    
		   if(accountNo>81000000000l)
		   {
		   accountNo++;
		   accountNo1=accountNo;
		   }
		   else
		   {
			   accountNo1++;
		   }
			c.setAccount_No(accountNo1);
			//c.setBranchAddress(branchAddress);

			
			break;
			
		case "Union Bank":
			
			 branchAddress="Union Bank,padur,chennai,523331";
			    accountNo1=71000000000l;
			    accountNo=db.getAccountNo(bankName);
			    
			   if(accountNo>71000000000l)
			   {
			   accountNo++;
			   accountNo1=accountNo;
			   }
			   else
			   {
				   accountNo1++;
			   }
				c.setAccount_No(accountNo1);
			//	c.setBranchAddress(branchAddress);

				
			break;
			
		case "Punjab Bank":
			
			 branchAddress="Punjab Bank,padur,chennai,523331";
			    accountNo1=61000000000l;
			    accountNo=db.getAccountNo(bankName);
			    
			   if(accountNo>61000000000l)
			   {
			   accountNo++;
			   accountNo1=accountNo;
			   }
			   else
			   {
				   accountNo1++;
			   }
				c.setAccount_No(accountNo1);
				//c.setBranchAddress(branchAddress);
				
			break;
			
		case "Borda Bank":

			branchAddress="Borda Bank,padur,chennai,523331";
			    accountNo1=61000000000l;
			    accountNo=db.getAccountNo(bankName);
			    
			   if(accountNo>61000000000l)
			   {
			   accountNo++;
			   accountNo1=accountNo;
			   }
			   else
			   {
				   accountNo1++;
			   }
				c.setAccount_No(accountNo1);
				//c.setBranchAddress(branchAddress);
				
			break;
		}
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
		
	}
	public String getCustomerAddress()
	{
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress)
	{
		this.customerAddress=customerAddress;
	}
	public String getBranchAddress()
	{
		return branchAddress;
	}
	/*public void setBranchAddress(String branchAddress)
	{
		this.branchAddress=branchAddress;
	}*/
	
	
}
