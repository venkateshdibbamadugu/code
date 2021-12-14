package com.venkat;
import java.util.function.*;

public class Transction {
	
	private String bankName;
	private String tranctionId;
	
	public void setBankName(String bankName,Transction t) {
		this.bankName = bankName;
		String otp="";
		switch(bankName)
		{
		case "State bank of india":
			
            for(int i=0;i<6;i++)
            {
                 otp=otp+(int)(Math.random()*20);
               
            }
            otp="SBI21"+otp;
			t.setTranctionId(otp);
			break;
			
		case "Andhra Bank":
			
			for(int i=0;i<6;i++)
            {
                 otp=otp+(int)(Math.random()*20);
               
            }
            otp="AB21"+otp;
            t.setTranctionId(otp);
			break;
			
		case "Union Bank":
			
			for(int i=0;i<6;i++)
            {
                 otp=otp+(int)(Math.random()*20);
               
            }
            otp="UB21"+otp;
			
            t.setTranctionId(otp);
            
			break;
			
		case "Punjab Bank":
			
			for(int i=0;i<6;i++)
            {
                 otp=otp+(int)(Math.random()*20);
               
            }
            otp="PB21"+otp;
				
            t.setTranctionId(otp);
			break;
			
		case "Borda Bank":

			for(int i=0;i<6;i++)
            {
                 otp=otp+(int)(Math.random()*20);
               
            }
            otp="BB21"+otp;
            t.setTranctionId(otp);
			break;
		}
	
	}
	public String getTranctionId() {
		return tranctionId;
	}
	public void setTranctionId(String tranctionId) {
		this.tranctionId = tranctionId;
	}
	
	
	

}
