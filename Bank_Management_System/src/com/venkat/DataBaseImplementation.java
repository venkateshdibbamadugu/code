package com.venkat;
import java.sql.*;
import java.util.*;

public class DataBaseImplementation {
    
	Connection con=null;
	//oracle Database connections
	public Connection getCon()
	{
		
		try {
			
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DS","DS");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return con;
	}
	//insertion of customerDetails
	public long insertCustomerDetails(CustomerDetails c)
	{
		long x=0;
		long accountNo;
		PreparedStatement ps=null;
		try
		{
			DataBaseImplementation db=new DataBaseImplementation();
			Connection con=db.getCon();
			ps=con.prepareStatement("Insert into  BankManagementSystem values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setLong(1,c.getAccount_No());
			
			ps.setString(2,c.getCustomerName());
			ps.setString(3,c.getDate_of_birth());
			ps.setString(4,c.getGender());
			System.out.println(c.getGender());
			ps.setString(5,c.getFatherName());
			ps.setString(6,c.getMotherName());
			ps.setLong(7,c.getAdharNo());
			ps.setString(8,c.getRationNo());
			ps.setString(9,c.getCustomerAddress());
			ps.setLong(10,c.getMobile());
			ps.setString(11,c.getBankName());
			ps.setString(12,c.getAccountType());
			ps.setString(13,c.getBranchAddress());
			x=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(x>0)
		{
			accountNo=c.getAccount_No();
			x=accountNo;
		}
		return x;
	}
	public long getAccountNo(String bankName)
	{
		long x=0l;
		try
		{
			DataBaseImplementation db=new DataBaseImplementation();
			Connection con=db.getCon();
			PreparedStatement ps=con.prepareStatement("select max(accountNo) from  BankManagementSystem where bankName=?");
			ps.setString(1, bankName);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				x=rs.getLong(1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return x;
	}
	public int getId(Long account_No)
	{
		int x=0;
		try
		{
			DataBaseImplementation db=new DataBaseImplementation();
			Connection con=db.getCon();
			Statement st=con.createStatement();
			Long j=account_No;
			String tables="V"+j.toString();
			String id="select max(id) from "+tables;
			PreparedStatement ps=con.prepareStatement(id);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				x=rs.getInt(1);
			}
			
		}
		catch(Exception e)
		{
			
		}
		return x;
	}
	public int createAccount(MiniStatement m)
	{
		int x=0;
		
		try
		{
			DataBaseImplementation db=new DataBaseImplementation();
			Connection con=db.getCon();
			Statement st=con.createStatement();
			Long j=m.getAccount_No();
			String tables="V"+j.toString();
			//int y=Integer.parseInt(tables);
			System.out.println(tables);
		
			
		//	System.out.println("abc");
			String create="create table "+tables+"(id int,Accout_No number(12),Account_type varchar(10),dadte varchar(10),withdraw float(10),Deposite float(10),Total_Balance float(10))";
			st.executeUpdate(create);
		//	System.out.println("xyz");
			String insert="insert into "+tables+" values(?,?,?,?,?,?,?)";
		  
			PreparedStatement ps1=con.prepareStatement(insert);
			ps1.setInt(1,m.getId());
			ps1.setLong(2,m.getAccount_No());
			ps1.setString(3, m.getAccType());
			ps1.setString(4, m.getDate());
			ps1.setDouble(5,m.getWithDraw());
			ps1.setDouble(6,m.getDeposite());
			ps1.setDouble(7,m.getBalance());
			x=ps1.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return x;
	}
	public double retriveDeposite(Long accNo)
	{
		double x=0;
		String table="V"+accNo.toString();
		try
		{
			DataBaseImplementation db=new DataBaseImplementation();
			Connection con=db.getCon();
			String table_Name="select Total_Balance from "+table+" order by id";
			PreparedStatement ps=con.prepareStatement(table_Name);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				x=rs.getDouble(1);
			}
			
		}
		catch(Exception e)
		{
			
		}
		return x;
	}
	public int depsite(Long accNo,Deposite d)
	{
		int x=0;
		String table="V"+accNo.toString();
		try
		{
			DataBaseImplementation db=new DataBaseImplementation();
			Connection con=db.getCon();
			String insert="insert into "+table+" values(?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(insert);
			ps.setInt(1,d.getId());
			ps.setLong(2,d.getAccount_No());
			ps.setString(3,d.getAccType());
			ps.setString(4,d.getDate());
			ps.setDouble(5,d.getWithDraw());
			ps.setDouble(6,d.getDeposite());
			ps.setDouble(7,d.getBalance());
			x=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return x;
	}
	public int withDraw(Long accNo,WithDraw d)
	{
		int x=0;
		String table="V"+accNo.toString();
		try
		{
			DataBaseImplementation db=new DataBaseImplementation();
			Connection con=db.getCon();
			String insert="insert into "+table+" values(?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(insert);
			ps.setInt(1,d.getId());
			ps.setLong(2,d.getAccount_No());
			ps.setString(3,d.getAccType());
			ps.setString(4,d.getDate());
			ps.setDouble(5,d.getWithDraw());
			ps.setDouble(6,d.getDeposite());
			ps.setDouble(7,d.getBalance());
			x=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return x;
	}
	
	public int retriewMaxLoanNo()
	{
		int x=0;
		try
		{
			DataBaseImplementation db=new DataBaseImplementation();
			Connection con=db.getCon();
			
			PreparedStatement ps=con.prepareStatement("select max(loan_No) from  LoanTransction");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				x=rs.getInt(1);
			}
			
		}
		catch(Exception e)
		{
			
		}
		return x;
	}
	public int createLoan(LoanForAccount l)
	{
		int x=0;
		try
		{
			DataBaseImplementation db=new DataBaseImplementation();
			Connection con=db.getCon();
			
			PreparedStatement ps=con.prepareStatement("insert into LoanTransction values(?,?,?,?,?,?,?)");
			ps.setInt(1,l.getLoan_No());
			ps.setLong(2,l.getAccount_No());
			ps.setString(3,l.getTypeOfLoan());
			ps.setDouble(4,l.getLoanAmount());
			ps.setFloat(5,l.getInterest());
			ps.setDouble(6,l.getPayamount());
			ps.setString(7,l.getDate());
			
			x=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return x;
	}
	public String loanDate(int loan_No)
	{
		String date=null;
		try
		{
			DataBaseImplementation db=new DataBaseImplementation();
			Connection con=db.getCon();
			
			PreparedStatement ps=con.prepareStatement("select dateLoan from LOANTRANSCTION where loan_No=?");
			ps.setInt(1,loan_No);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				date=rs.getString(1);
			}
		}
		catch(Exception e)
		{
			
		}
		return date;
	}
	
	public double getPrincepal(int loan_No)
	{
		double x=0;
		try
		{
			DataBaseImplementation db=new DataBaseImplementation();
			Connection con=db.getCon();
			
			PreparedStatement ps=con.prepareStatement("select loanAmount from LOANTRANSCTION where loan_No=?");
			ps.setInt(1,loan_No);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				x=rs.getDouble(1);
			}
		}
		catch(Exception e)
		{
			
		}
		return x;
	}
	
	public int setUpdation(ViewCustLaonDetails v)
	{
		int x=0;
		try
		{
			DataBaseImplementation db=new DataBaseImplementation();
			Connection con=db.getCon();
			
			PreparedStatement ps=con.prepareStatement("update LoanTransction set interest=? where loan_No=?");
			ps.setDouble(1,v.getInterest());
			//System.out.println("interest="+v.getInterest());
			ps.setInt(2,v.getLoan_No());
			x=ps.executeUpdate();
		}
		catch(Exception e)
		{
			
		}
		
		return x;
	}
	
	public List<GetCustomerDetails> getDetails(List<GetCustomerDetails> list,long acc_No)
	{
		GetCustomerDetails g=new GetCustomerDetails();
		try
		{
			DataBaseImplementation db=new DataBaseImplementation();
			Connection con=db.getCon();
			
			PreparedStatement ps=con.prepareStatement("select accountNo,customerName,gender,fatherName,customerAddress,bankName,BranchAddress from BankManagementSystem where  accountNo=?");
			ps.setLong(1,acc_No);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				g.setAccount_No(rs.getLong(1));
				g.setHolder_Name(rs.getString(2));
				g.setGender(rs.getString(3));
				g.setFather_Name(rs.getString(4));
				g.setCustomer_Address(rs.getString(5));
				g.setBankName(rs.getString(6));
				g.setBankAddress(rs.getNString(7));
				list.add(g);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		return list;
	}
	public List<GetCustomerDetails> mimiDetails(List<GetCustomerDetails> list,Long acc_No)
	{
		//GetCustomerDetails g=new GetCustomerDetails();
		List<GetCustomerDetails> l=new ArrayList<GetCustomerDetails>();
		String table="V"+acc_No.toString();
		try
		{
			DataBaseImplementation db=new DataBaseImplementation();
			Connection con=db.getCon();
			
			//String s=("select  DADTE, WITHDRAW,DEPOSITE,TOTAL_BALANCE from +table;
			PreparedStatement ps=con.prepareStatement("select  DADTE,WITHDRAW,DEPOSITE,TOTAL_BALANCE from "+table+" order by id");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				GetCustomerDetails g=new GetCustomerDetails();
				//System.out.println("jfhjh"+rs.getString(1));
				g.setDate(rs.getString(1));
				g.setWithDraw(rs.getDouble(2));
				g.setDeposite(rs.getDouble(3));
				g.setTotal_Balance(rs.getDouble(4));
				list.add(g);
			}
			l.addAll(list);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return l;
	}
	
/*	public List<GetCustomerDetails> loanDetails(List<GetCustomerDetails> list,Long acc_No)
	{
		//GetCustomerDetails g=new GetCustomerDetails();
		List<GetCustomerDetails> l=new ArrayList<GetCustomerDetails>();
		try
		{
			DataBaseImplementation db=new DataBaseImplementation();
			Connection con=db.getCon();
			
			//String s=("select  DADTE, WITHDRAW,DEPOSITE,TOTAL_BALANCE from +table;
			PreparedStatement ps=con.prepareStatement("select  loan_No,typeOfLoan,loanAmount,interest,paid from LOANTRANSCTION where account_No=?");
			ps.setLong(1,acc_No);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				GetCustomerDetails g=new GetCustomerDetails();
				g.setLoan_No(rs.getInt(1));
				g.setTypeofLoan(rs.getString(2));
				g.setLoan_Amount(rs.getDouble(3));
				g.setInterest(rs.getFloat(4));
				g.setPayment(rs.getDouble(5));
				list.add(g);
			}
			l.addAll(list);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return l;
	}*/
	
	public double getAmount(Long acc_No)
	{
		String table="V"+acc_No.toString();
		double x=0;
		try
		{
			DataBaseImplementation db=new DataBaseImplementation();
			Connection con=db.getCon();
			
			//String s=("select  DADTE, WITHDRAW,DEPOSITE,TOTAL_BALANCE from +table;
			PreparedStatement ps=con.prepareStatement("select  max(TOTAL_BALANCE)from "+table+" order by id");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				x=rs.getDouble(1);
			}
		}
		catch(Exception e)
		{
			
		}
		
		return x;
	}
	
	public String getBankName(Long acc_No)
	{
		String table="V"+acc_No.toString();
		String bankName=null;
		try
		{
			DataBaseImplementation db=new DataBaseImplementation();
			Connection con=db.getCon();
			
			//String s=("select  DADTE, WITHDRAW,DEPOSITE,TOTAL_BALANCE from +table;
			PreparedStatement ps=con.prepareStatement("select bankName from  BankManagementSystem where accountNo=?");
		    ps.setLong(1, acc_No);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				bankName=rs.getString(1);
			}
		}
		catch(Exception e)
		{
			
		}
		
		return bankName;
	}
	
	public int interest(int loanNo,long accNo,double interest)
	{
		int x=0;
		try
		{
			DataBaseImplementation db=new DataBaseImplementation();
			Connection con=db.getCon();
		    System.out.println("xj111");
			PreparedStatement ps=con.prepareStatement("update LOANTRANSCTION set interest=0 where loan_No=? and account_No=? and interest=?");
			System.out.println("2222");
			ps.setInt(1,loanNo);
			System.out.println("loan1="+loanNo);
			ps.setLong(2, accNo);
			
			System.out.println("acc1="+accNo);			
			
			System.out.println("interest="+interest);
			ps.setDouble(3, interest);
			
			x=ps.executeUpdate();
			System.out.println("x="+x);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return x;
	}
	
	public int loan(int loanNo,long accNo,double loan)
	{
		int x=0;
		try
		{
			DataBaseImplementation db=new DataBaseImplementation();
			Connection con=db.getCon();
		
			PreparedStatement ps=con.prepareStatement("update LOANTRANSCTION set loanAmount=0 where loan_No=? and account_No=? and loanAmount=?");
			ps.setInt(1, loanNo);
			System.out.println("loan="+loanNo);
			ps.setLong(2, accNo);
			ps.setDouble(3, loan);
            System.out.println("acc="+accNo);			
			
			System.out.println("interest="+loan);
			x=ps.executeUpdate();
			System.out.println("x="+x);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return x;
	}
	public int update(Update u)
	{
		int x=0;
		try
		{

			DataBaseImplementation db=new DataBaseImplementation();
			Connection con=db.getCon();
		
			PreparedStatement ps=con.prepareStatement("update BANKMANAGEMENTSYSTEM set customerName=?,dob=?,gender=?,fatherName=?,mothername=?,adharNo=?,rationNo=?,mobileNo=?,customerAddress=? where accountNo=?");
			ps.setString(1,u.getCustomerName());
			ps.setString(2,u.getDate_of_birth());
			ps.setString(3,u.getGender());
			ps.setString(4,u.getFatherName());
			ps.setString(5,u.getMotherName());
			ps.setLong(6,u.getAdharNo());
			ps.setString(7,u.getRationNo());
			ps.setLong(8,u.getMobile());
			ps.setString(9,u.getCustomerAddress());
			ps.setLong(10,u.getAccount_No());
			
			x=ps.executeUpdate();
			
		}
		catch(Exception e)
		{
			
		}
		
		return x;
	}
	//create table DataBaseImplementation(accountNo number(11),customerName varchar(50),dob varchar(10),gender varchar(6),fatherName varchar(30),mothername varchar(30),adharNo number(12),rationNo varchar(20),customerAddress varchar(100),mobileNo number(12),bankName varchar(20),AccountType varchar(4),BranchAddress varchar(100));
}
