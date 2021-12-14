<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import="com.venkat.WithDraw,com.venkat.DataBaseImplementation"%>
<%!
long account_No=0;
double withDraw_Balance=0;
%>
<%
        account_No=Long.parseLong(request.getParameter("accNo"));
        withDraw_Balance=Double.parseDouble(request.getParameter("withDraw"));
        WithDraw w=new WithDraw();
        w.setWithDraw(withDraw_Balance);
        w.setAccount_No(account_No);
        DataBaseImplementation db=new DataBaseImplementation();
        int x=db.withDraw(account_No,w);
        
%>

<%
if(x>0)
{
	out.println("<head>");
	out.println("<style>");
	out.println("h3{margin-top:25%;color:green;}");
	out.println("</style>");
	out.println("</head>");
	out.println("<center>");
	out.println("<div>");
	out.println("<h3>Successfully WithDraw Done</h3>");
	out.println("<a href='Home.html'>Click Here</a>");
	out.println("</div>");
	out.println("</center>");
}
else
{
	out.println("<head>");
	out.println("<style>");
	out.println("h3{margin-top:30%;color:green;}");
	out.println("</style>");
	out.println("</head>");
	out.println("<center>");
	out.println("<div>");
	out.println("<h3>Successfully WithDraw Not Done</h3>");
	out.println("<a href='WithDraw.html'>Click Here</a>");
	out.println("</div>");
	out.println("</center>");
}
%>
