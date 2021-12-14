<%@ page import="com.venkat.DataBaseImplementation,com.venkat.ViewCustLaonDetails" %>
<%!
     int loan_No;
     int date,month,year;
%>
<%
    loan_No=Integer.parseInt(request.getParameter("loan_No"));
    date=Integer.parseInt(request.getParameter("date"));
    month=Integer.parseInt(request.getParameter("month"));
    year=Integer.parseInt(request.getParameter("year"));
    
    ViewCustLaonDetails v=new ViewCustLaonDetails();
    v.setLoan_No(loan_No,date,month,year);
    
    DataBaseImplementation db=new DataBaseImplementation();
    int x=db.setUpdation(v);
    if(x>0)
    {
    	out.println("Success");
    }
    
%>