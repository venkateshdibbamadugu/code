<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import="com.venkat.DataBaseImplementation,com.venkat.GetCustomerDetails,java.util.*" %>
<%!

   long acc_No;
%>
<%
 
  acc_No=Long.parseLong(request.getParameter("accNo"));

   DataBaseImplementation db=new DataBaseImplementation();
   GetCustomerDetails g=new GetCustomerDetails();
   
   List<GetCustomerDetails> list=new ArrayList<GetCustomerDetails>();
   
   List<GetCustomerDetails> list1=db.getDetails(list,acc_No);
   out.println("<head>");
  out.println("<style>");
   out.println("table{ font-family: arial, sans-serif;  border-collapse: collapse;}");

  out.println(" td, th {   border: 1px solid #dddddd;   text-align: left; padding: 8px;}");
 
  out.println(" tr:nth-child(even) {background-color: #dddddd; }");
  out.println("</style"); 
  out.println("</head>");
 // out.println(" td, th {   border: 1px solid #dddddd;   text-align: left; padding: 8px;}");
   out.println("<center><h2>Account-Holder Details</h2></center>");
    out.println("<table  style='margin:0px auto'>");
    out.println("<tr>");
    out.println("<th>Account-No</th>");
    out.println("<th>Holder-Name</th>");
    out.println("<th>Gender</th>");
    out.println("<th>Father-Name</th>");
    out.println("<th>CustomerAddress</th>");
    out.println("<th>BankName</th>");
    out.println("<th>BankAddress</th>");
    out.println("</tr>");
  
    for(GetCustomerDetails c:list1)
    {
    	   out.println("<tr>");
    	   out.println("<td>"+c.getAccount_No()+"</td>");
    	   out.println("<td>"+c.getHolder_Name()+"</td>");
    	   out.println("<td>"+c.getGender()+"</td>");
    	   out.println("<td>"+c.getFather_Name()+"</td>");
    	   out.println("<td>"+c.getCustomer_Address()+"</td>");
    	   out.println("<td>"+c.getBankName()+"</td>");
    	   out.println("<td>"+c.getBankAddress()+"</td>");
           out.println("</tr>");
    }
    out.println("</table>");
    list=null;
    list1=null;
   
   
    List<GetCustomerDetails> list2=new ArrayList<GetCustomerDetails>();
    List<GetCustomerDetails> list3=db.mimiDetails(list2, acc_No);
    out.println("<center><h2>Mini Statement</h2></center>");
    out.println("<table  style='margin:0px auto'>");
    out.println("<tr>");
    out.println("<th>Date</th>");
    out.println("<th>WithDraw</th>");
    out.println("<th>Deposite</th>");
    out.println("<th>Total-Balance</th>");
    out.println("</tr>");
    for(GetCustomerDetails c:list3)
    {
    	   out.println("<tr>");
    	   out.println("<td>"+c.getDate()+"</td>");
    	   out.println("<td>"+c.getWithDraw()+"</td>");
    	   out.println("<td>"+c.getDeposite()+"</td>");
    	   out.println("<td>"+c.getTotal_Balance()+"</td>");
           out.println("</tr>");
    }
    out.println("</table>");
   list2=null;
   list3=null;
   /* List<GetCustomerDetails> list4=new ArrayList<GetCustomerDetails>();
    List<GetCustomerDetails> list5=db.loanDetails(list4, acc_No);
    out.println("<center><h2>Loan Details</h2></center>");
    out.println("<table  style='margin:0px auto'>");
    out.println("<tr>");
    out.println("<th>Loan-No</th>");
    out.println("<th>Type-Of-Loan</th>");
    out.println("<th>Loan-Amount</th>");
    out.println("<th>Interest</th>");
    out.println("<th>Paid</th>");
    out.println("</tr>");
    for(GetCustomerDetails c:list5)
    {
    	   out.println("<tr>");
    	   out.println("<td>"+c.getLoan_No()+"</td>");
    	   out.println("<td>"+c.getTypeofLoan()+"</td>");
    	   out.println("<td>"+c.getLoan_Amount()+"</td>");
    	   out.println("<td>"+c.getInterest()+"</td>");
    	   out.println("<td>"+c.getPayment()+"</td>");
           out.println("</tr>");
    }
    out.println("</table>");*/


%>