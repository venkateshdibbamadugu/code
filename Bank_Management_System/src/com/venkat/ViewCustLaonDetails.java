package com.venkat;

public class ViewCustLaonDetails {
	
	private int Loan_No;
	private long account_No;
	private String typeOfLoan;
	private float loanAmount;
	static double interest;
	private float payment;
	public int getLoan_No() {
		return Loan_No;
	}
	public void setLoan_No(int loan_No,int presentdate,int presentmonth,int presentyear) {
		this.Loan_No = loan_No;
		
		DataBaseImplementation db=new DataBaseImplementation();
		String dateOfLoan=db.loanDate(loan_No);
		//System.out.println("date of loan="+dateOfLoan);
		char[] date1=dateOfLoan.toCharArray();
		int sum1,sum2,sum3;
		
		
		int previousdate=Integer.parseInt((date1[8]+""+date1[9]).toString());
		//System.out.println("predate="+previousdate);
		int previousmonth=Integer.parseInt((date1[5]+""+date1[6]).toString());
		//System.out.println("predate="+previousmonth);
		int previousyear=Integer.parseInt((date1[0]+""+date1[1]+""+date1[2]+""+date1[3]).toString());
		//System.out.println("predate="+previousyear);
		if(presentdate<=previousdate)
        {
            sum1=(presentdate+30)-(previousdate);
        }
        else
        {
            sum1=presentdate-previousdate;
        }
		
        
        if(presentdate<=previousdate)
        {
            if(presentmonth<=previousmonth)
            {
                sum2=(presentmonth-1+12)-(previousmonth);
            }
            else
            {
                sum2=(presentmonth-1)-(previousmonth);
            }
        }
        else
        {
            if(presentmonth<=previousmonth)
            {
                sum2=(presentmonth+12)-(previousmonth);
            }
            else
            {
                sum2=(presentmonth)-(previousmonth);
            }
        }
		
        
        if(presentdate<=previousdate)
        {
            if(presentmonth<=previousmonth)
            {
                if(presentyear<=previousyear)
                {
                    sum3=(presentyear-1)-(previousyear);
                }
                else
                {
                    sum3=(presentyear-1)-(previousyear);
                }
            }
            else
            {
                 if(presentyear<=previousyear)
                {
                    sum3=(presentyear)-(previousyear);
                }
                else
                {
                    sum3=(presentyear)-(previousyear);
                }
            }
        }
        else
        {
             if(presentmonth<=previousmonth)
            {
                if(presentyear<=previousyear)
                {
                    sum3=(presentyear-1)-(previousyear);
                }
                else
                {
                    sum3=(presentyear-1)-(previousyear);
                }
            }
            else
            {
                 if(presentyear<=previousyear)
                {
                    sum3=(presentyear-1)-(previousyear);
                }
                else
                {
                    sum3=(presentyear)-(previousyear);
                }
            }
      
        }
      //  System.out.println("sum1="+sum1);
      //  System.out.println("sum2="+sum2);
      //  System.out.println("sum3="+sum3);
      
         double p=db.getPrincepal(loan_No);
         double r=0.75d;
         double intrest1;
         double intrest2;
         double intrest3;
         double totalintrest;
         double total_amount;
         
         
         intrest1=((sum3*12)*(r)*(p))/100;
         intrest2=((sum2)*(r)*(p))/100;
         intrest3=((sum1)*(r/30)*(p))/100;
         totalintrest=intrest1+intrest2+intrest3;
         total_amount=(totalintrest)+(p);
         
         ViewCustLaonDetails v=new ViewCustLaonDetails();
       //  System.out.println("total interest="+totalintrest);
         v.setInterest(totalintrest);
         
        
	}
	public long getAccount_No() {
		return account_No;
	}
	public void setAccount_No(long account_No) {
		this.account_No = account_No;
	}
	public String getTypeOfLoan() {
		return typeOfLoan;
	}
	public void setTypeOfLoan(String typeOfLoan) {
		this.typeOfLoan = typeOfLoan;
	}
	public float getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}
	public double getInterest() {
		//System.out.println("hfhdfh"+interest);
		return interest;
	}
	public void setInterest(double interest) {
		//System.out.println("hfhh"+interest);
		this.interest = interest;
		
	}
	public float getPayment() {
		return payment;
	}
	public void setPayment(float payment) {
		this.payment = payment;
	}
	

}
