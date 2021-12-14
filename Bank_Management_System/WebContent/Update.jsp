<%@ page import="com.venkat.Update,com.venkat.DataBaseImplementation" %>
<%!
long accNo;
String fName;
String lName;
String dob;
String gender;
String fatherName;
String motherName;
long adharNo=0l;
String rationNo;
long mobile=0l;
String bankName;
String accountType;
String customerName;
String customerAddress;
%>
<%
    
      accNo=Long.parseLong(request.getParameter("accNo"));
      fName=request.getParameter("fname");
      lName=request.getParameter("lname");
      customerName=fName+" "+lName;
      System.out.println("customer name="+customerName);
      dob=request.getParameter("dob");
      gender=request.getParameter("gender");
      fatherName=request.getParameter("fatherName");
      motherName=request.getParameter("motherName");
      adharNo=Long.parseLong(request.getParameter("adharNo"));
      rationNo=request.getParameter("rationNo");
      mobile=Long.parseLong(request.getParameter("mobile"));
      customerAddress=request.getParameter("address");
     
      Update u=new Update();
      
      u.setAccount_No(accNo);
      u.setCustomerName(customerName);
      u.setDate_of_birth(dob);
      u.setGender(gender);
      u.setFatherName(fatherName);
      u.setMotherName(motherName);
      u.setAdharNo(adharNo);
      u.setRationNo(rationNo);
      u.setMobile(mobile);
      u.setCustomerAddress(customerAddress);
    
      DataBaseImplementation db=new DataBaseImplementation();
      int x=db.update(u);
      
      if(x>0)
      {
    	  out.println("<head>");
  		out.println("<style>");
  		out.println("h3{margin-top:25%;color:green;}");
  		out.println("</style>");
  		out.println("</head>");
  		out.println("<center>");
  		out.println("<div>");
  		out.println("<h3>Successfully  Updation Done</h3>");
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
  		out.println("<h3>Successfully Updation Not Done</h3>");
  		out.println("<a href='Home.html'>Click Here</a>");
  		out.println("</div>");
  		out.println("</center>");
      }
%>