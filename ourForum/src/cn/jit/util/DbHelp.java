package cn.jit.util;

import java.sql.Connection;
import java.sql.DriverManager;


public class DbHelp {
	public Connection getCon() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/forum?useUnicode=true&characterEncoding=utf-8&useSSL=false";
			String user = "root";
			String password = "123456";
			Connection conn = (Connection) DriverManager.getConnection(url, user, password);
			System.out.println(conn.getMetaData().getURL());
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}

