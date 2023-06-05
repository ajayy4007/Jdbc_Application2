package test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DemoCreateTable {
public static void main(String[] args) {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
		Statement stmt=con.createStatement();
		stmt.execute("create table student01( sturollno number(4),stuname varchar2(10),mark number(3))");
		System.out.println("Table is created succssfully");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
