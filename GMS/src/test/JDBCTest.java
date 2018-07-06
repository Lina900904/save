package test;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JDBCTest {

	public static void main(String[] args) {
		
	try {
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.
				getConnection("jdbc:oracle:thin:@localhost:1521:xe",
						"seul1990","12345");
		String sql = "SELECT * FROM TAB";
		Statement stmt = conn.createStatement(); //팩토리 패턴
		ResultSet rs = stmt.executeQuery(sql);
		List<String>list = new ArrayList<>();
		while(rs.next()) {
			list.add(rs.getString("TNAME"));
			
		}
		System.out.println("테이블 개수"+list);
	} catch (SQLException e) {
	System.err.println("에러");
		e.printStackTrace();
	}catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}		

	}

}
