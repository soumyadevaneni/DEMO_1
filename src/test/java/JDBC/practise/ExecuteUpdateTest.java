package JDBC.practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecuteUpdateTest {
 @Test
   public void executeUpdateTest() throws Throwable
   {
	//step-1 Register the Driver
     Connection con = null;
	try {
		Driver dref = new Driver();
DriverManager.registerDriver(dref);

con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
//Step-3 Create a Statement
		Statement s = con.createStatement();
  //step-4 Execute Non select Query
		int result=s.executeUpdate("insert into students_info(regno,firstname,middlename,lastname) values('55','viyansh','rao','n');" );
		 if(result==1)
		 {
			 System.out.println("Data is added in Database");
		 }
		 else
		 {
			 System.out.println("Data is not Added");
		 }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
	    finally {
      con.close();
}
}}