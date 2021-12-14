<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import="com.venkat.Deposite,com.venkat.DataBaseImplementation,java.io.*"%>
<%!
long account_No=0;
double deposite_Balance=0;
%>
<%
   account_No=Long.parseLong(request.getParameter("accNo"));
   deposite_Balance=Double.parseDouble(request.getParameter("deposite"));
   Deposite m=new Deposite();
  
   m.setDeposite(deposite_Balance);
   m.setAccount_No(account_No);
   DataBaseImplementation db=new DataBaseImplementation();
   int x=db.depsite(account_No,m);
   
   if(x>0)
   {
	 
        out.println("<head>");
		out.println("<style>");
		out.println("h3{margin-top:25%;color:green;}");
		out.println("</style>");
		out.println("</head>");
		out.println("<center>");
		out.println("<div>");
		out.println("<h3>Successfully deposited Done</h3>");
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
		out.println("<h3>Successfully deposited Not Done</h3>");
		out.println("<a href='Deposite.html'>Click Here</a>");
		out.println("</div>");
		out.println("</center>");
   }
   
		   m=null;
   
%>
 