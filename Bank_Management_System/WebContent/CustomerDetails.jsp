<%@ page import="com.venkat.CustomerDetails,com.venkat.DataBaseImplementation" %>
<%!
String fName;
String lName;
String dob;
String gender;
String fatherName;
String motherName;
long adharNo;
String rationNo;
long mobile;
String bankName;
String accountType;
String customerName;
String customerAddress;
%>
<%
      CustomerDetails c=new CustomerDetails();
      fName=request.getParameter("fName");
      lName=request.getParameter("lName");
      customerName=fName+" "+lName;
      dob=request.getParameter("dob");
      gender=request.getParameter("gender");
      fatherName=request.getParameter("fatherName");
      motherName=request.getParameter("motherName");
      adharNo=Long.parseLong(request.getParameter("adharNo"));
      rationNo=request.getParameter("rationNo");
      mobile=Long.parseLong(request.getParameter("mobile"));
      customerAddress=request.getParameter("address");
      bankName=request.getParameter("bankName");
      accountType=request.getParameter("accountType");
       
      c.setCustomerName(customerName);
      c.setDate_of_birth(dob);
      c.setGender(gender);
      c.setFatherName(fatherName);
      c.setMotherName(motherName);
      c.setAdharNo(adharNo);
      c.setRationNo(rationNo);
      c.setMobile(mobile);
      c.setCustomerAddress(customerAddress);
      c.setBankName(bankName,accountType);
      DataBaseImplementation db=new DataBaseImplementation();
      long x=db.insertCustomerDetails(c);
      String accountType=c.getAccountType();
      session.setAttribute("accountNo",x);
      session.setAttribute("accountType",accountType);
      if(accountType.equals("Main"))
      {
    	  session.setAttribute("mainBalance",1000);
      }
      else
      {
    	  session.setAttribute("mainBalance",500);
      }
      if(x>0)
      {
    	 // out.println("Account-No-"+x);
    	// <jsp:forward page="AccountDetails.jsp"/>
    	RequestDispatcher rd=request.getRequestDispatcher("AccountDetails.jsp");
    	rd.forward(request, response);
    	
    	
      }
      
%>
<html>
<body>

</body>
</html>