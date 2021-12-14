<%@ page import="com.venkat.MiniStatement,com.venkat.DataBaseImplementation" %>
<%!
   long account_No;
   String accType;
   double deposite;
%>
<%
   account_No=Long.parseLong(request.getParameter("accoun_No"));
   accType=request.getParameter("accoun-type");
   deposite=Double.parseDouble(request.getParameter("balance"));
   MiniStatement m=new  MiniStatement();
   m.setAccount_No(account_No);
   m.setAccType(accType);
   m.setDate(null);
   m.setParticular("By Cash");
   m.setWithDraw(0);
   m.setDeposite(deposite);
   //m.setBalance(0);
   DataBaseImplementation db=new DataBaseImplementation();
   int x=db.createAccount(m);
   if(x>0)
   {
	    out.println("<head>");
		out.println("<style>");
		out.println("h3{margin-top:25%;color:green;}");
		out.println("</style>");
		out.println("</head>");
		out.println("<center>");
		out.println("<div>");
		out.println("<h2>Successfully Account Created</h2>");
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
	 		out.println("<h2>Successfully Account Not Created</h2>");
	 		out.println("<a href='Customer.html'>Click Here</a>");
	 		out.println("</div>");
	 		out.println("</center>");
   }

   
%>