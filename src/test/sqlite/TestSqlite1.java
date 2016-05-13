package test.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestSqlite1 {

	public static void main(String[] args) {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:"+System.getProperty("user.dir")+"\\tool\\mydatabase.sqlite");
			//conn.setAutoCommit(false);
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("select * from Test1");
			
			 while (rs.next()) { //将查询到的数据打印出来
                 System.out.print("rowId = " + rs.getString("rowId") + " | "); //列属性一
                 System.out.print("WebelementName = " + rs.getString("WebelementName") + " | "); //列属性二
                 System.out.print("Xpath =" + rs.getString("Xpath") + " | ");
                 //System.out.print("Css =" + rs.getString("Css") + " | ");
                 System.out.println("Type =" + rs.getString("Type"));
             }
             rs.close();
             conn.commit();
             conn.close(); //结束数据库的连接 
			
		} catch (Exception e) {
			
		}

	}

}
