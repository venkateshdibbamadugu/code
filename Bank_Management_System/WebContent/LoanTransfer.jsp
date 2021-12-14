<%@ page import="com.venkat.LoanForAccount,com.venkat.DataBaseImplementation" %>
<%!
   long account_No;
   String typeOfLoan;
   double loanAmount;
   
%>
<%
       account_No=Long.parseLong(request.getParameter("accNo"));
       typeOfLoan=request.getParameter("loanName");
       loanAmount=Double.parseDouble(request.getParameter("amount"));
       
       LoanForAccount l=new LoanForAccount();
       l.setAccount_No(account_No);
      // l.setLoan_No(0);
       l.setTypeOfLoan(typeOfLoan);
       l.setLoanAmount(loanAmount);
       
       DataBaseImplementation db=new DataBaseImplementation();
       int x=db.createLoan(l);
       
       if(x>0)
       {
    	   out.println("Successfully Loan Transction done");
       }
       else
       {
    	   out.println("Successfully Loan not Transction done");
       }
%>