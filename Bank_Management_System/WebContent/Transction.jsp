<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import="com.venkat.Transction,com.venkat.WithDraw,com.venkat.DataBaseImplementation,com.venkat.Deposite,java.io.*" %>

<%!
   long acc_No;
   double amount;
   
   long tAcc_No;
   String bName;
%>
<%
     acc_No=Long.parseLong(request.getParameter("sAcc_No"));
     amount=Double.parseDouble(request.getParameter("tAmount"));
     
     tAcc_No=Long.parseLong(request.getParameter("tAcc_No"));
     bName=request.getParameter("bankName");
     
     DataBaseImplementation db=new DataBaseImplementation();
     double amt=db.getAmount(acc_No);
     
     
     String bank_Name=db.getBankName(acc_No);
     
     Transction t=new Transction();
     t.setBankName(bank_Name, t);
    
   //  PrintWriter out=response.getWriter();
     
     if(amt>(amount+1000))
     {
    	    if(bName.equals(bank_Name))
    	    {
    	    	
    	     WithDraw w=new WithDraw();
   	         w.setWithDraw(amount);
   	         w.setAccount_No(acc_No);
   	        
   	         int y=db.withDraw(acc_No,w);
    	    Deposite m=new Deposite();
    	    m.setDeposite(amount);
    	    m.setAccount_No(tAcc_No);
    	    int x=db.depsite(tAcc_No,m);
    	    if(x>0)
    	    {
    	    	out.println("<head>");
    	 		out.println("<style>");
    	 		out.println("h3{margin-top:25%;color:green;}");
    	 		out.println("</style>");
    	 		out.println("</head>");
    	 		out.println("<center>");
    	 		out.println("<div>");
    	 		out.println("<h3>Successfully Transction Done</h3>");
    	 		out.println("<table>");
    	 		out.println("<tr>");
    	 		out.println("<td>ID :</td>");
    	 		out.println("<td>"+t.getTranctionId()+"</td>");
    	 		out.println("</tr>");
    	 		out.println("</tabel>");
    	 		out.println("<h3>ID: "+t.getTranctionId()+"</h3>");
    	 		System.out.println("Transction ID1:"+t.getTranctionId());
    	 		out.println("<a href='Home.html'>Click Here</a>");
    	 		out.println("</div>");
    	 		out.println("</center>");
    	    }
    	    m=null;
    	    w=null;
    	    }
    	    else
    	    {
    	    	 WithDraw w=new WithDraw();
    	         w.setWithDraw(amount+200);
    	         w.setAccount_No(acc_No);
    	        
    	        int y=db.withDraw(acc_No,w);
    	        
    	    	Deposite m=new Deposite();
        	    m.setDeposite(amount);
        	    m.setAccount_No(tAcc_No);
        	    int x=db.depsite(tAcc_No,m);
        	    if(x>0)
        	    {
        	    	out.println("<head>");
        	 		out.println("<style>");
        	 		out.println("h3{margin-top:20%;color:green;}");
        	 		out.println("</style>");
        	 		out.println("</head>");
        	 		out.println("<center>");
        	 		out.println("<div>");
        	 		out.println("<h3>Successfully Transction Done</h3>");
        	 		out.println("<table>");
        	 		out.println("<tr>");
        	 		out.println("<td>ID :</td>");
        	 		out.println("<td>"+t.getTranctionId()+"</td>");
        	 	//	out.println("<td>"+t.getTranctionId()+"</td>");
        	 		out.println("</tr>");
        	 		out.println("</tabel>");
        	 	//	out.println("<h3>ID: "+t.getTranctionId()+"</h3>");
        	 		//System.out.println("Transction ID2:"+t.getTranctionId());
        	 		out.println("</div>");
        	 		out.println("<a href='Home.html'>Click Here</a>");
        	 		out.println("</center>");
        	    }
        	    m=null;
        	    w=null;
    	    }
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
	 		out.println("<h3>Successfully Transction Not Done</h3>");
	 		out.println("<a href='Home.html'>Click Here</a>");
	 		out.println("</div>");
	 		out.println("</center>");

     }
     
%>


 

