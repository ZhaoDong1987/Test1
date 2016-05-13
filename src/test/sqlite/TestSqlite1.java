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
			
			 while (rs.next()) { //����ѯ�������ݴ�ӡ����
                 System.out.print("rowId = " + rs.getString("rowId") + " | "); //������һ
                 System.out.print("WebelementName = " + rs.getString("WebelementName") + " | "); //�����Զ�
                 System.out.print("Xpath =" + rs.getString("Xpath") + " | ");
                 //System.out.print("Css =" + rs.getString("Css") + " | ");
                 System.out.println("Type =" + rs.getString("Type"));
             }
             rs.close();
             conn.commit();
             conn.close(); //�������ݿ������ 
			
		} catch (Exception e) {
			
		}

	}

}
