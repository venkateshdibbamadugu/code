<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
         <link
    rel="stylesheet"
    href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"
  />
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
      <style type="text/css">
  table{
  background-color:lightgreen;
  }
  .main{
  margin-top:15%;
  outer-line:10% solid lightgreen;
  }
      </style>
</head>
<body>

   <form action="./Deposte.jsp" class="main">
   <center>
   <table>
   <table>
   <tr>
   <td><label>Account-No</label></td>
   <td><input type="text" name="accoun_No" value="<%=session.getAttribute("accountNo")%>"/></td>
   </tr>
   <tr>
   <td><label>Account-Type</label></td>
   <td><input type="text" name="accoun-type" value="<%=session.getAttribute("accountType")%>"/></td>
   </tr>
   <tr>
   <td><label>Account-Type</label></td>
   <td><input type="text" name="balance" value="<%=session.getAttribute("mainBalance")%>"/></td>
   </tr>
   <tr>
   <td></td>
   <td><input type="submit" value="Submit"/></td>
   </tr>
   </table>
   </table>
   </center>
   </form>

</body>
</html>
