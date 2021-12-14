<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.venkat.DataBaseImplementation,com.venkat.LoanPayment"%>
<%!
   int loanNo;
   long accountNo;
   double interest;
   double loan;
   
%>
<%
   System.out.println("fjgkj1");
   loanNo=Integer.parseInt(request.getParameter("lNo"));
   System.out.println("fjgkj2 "+loanNo);
   accountNo=Long.parseLong(request.getParameter("acc_No"));
   System.out.println("fjgkj3=0"+ accountNo);
   interest=Double.parseDouble(request.getParameter("interest"));
   System.out.println("fjgkj4="+interest);
   loan=Double.parseDouble(request.getParameter("loan"));
   System.out.println("fjgkj5="+loan);
   
   
   DataBaseImplementation db=new DataBaseImplementation();
   int x=db.interest(loanNo, accountNo, interest);
   
   int y=db.loan(loanNo, accountNo, loan);
   
   if(x>0 || y>0)
   {
	    out.println("<head>");
		out.println("<style>");
		out.println("h3{margin-top:25%;color:green;}");
		out.println("</style>");
		out.println("</head>");
		out.println("<center>");
		out.println("<div>");
		out.println("<h3>Successfully  Done</h3>");
		out.println("<a href='Home.html'>Click Here</a>");
		out.println("</div>");
		out.println("</center>");
   }
   else
   {
	    out.println("<head>");
		out.println("<style>");
		out.println("h3{margin-top:25%;color:green;}");
		out.println("</style>");
		out.println("</head>");
		out.println("<center>");
		out.println("<div>");
		out.println("<h3>Successfully Not Done</h3>");
		out.println("<a href='Home.html'>Click Here</a>");
		out.println("</div>");
		out.println("</center>");
   }
%>