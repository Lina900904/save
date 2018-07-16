package test;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JDBCTest {

	public static void main(String[] args) {
		
	try {
			//아래 영역은 오라클 내부의 영역
			Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.
				getConnection("jdbc:oracle:thin:@localhost:1521:xe",
				
				"seul1990","12345"); //싱글톤 패턴
		String sql = "SELECT * FROM TAB";
		Statement stmt = conn.createStatement(); //팩토리 패턴
		//stmt에 문서를 작성
		ResultSet rs = stmt.executeQuery(sql); //작성된 문서를 받음
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
