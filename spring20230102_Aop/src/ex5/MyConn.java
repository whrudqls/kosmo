package ex5;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MyConn {
	private static DataSource ds;
	static {
		InitialContext ctx;
		try {
			//System.out.println("초기화 시작");
			ctx = new InitialContext();
			ds =(DataSource) ctx.lookup("java:comp/env/jdbc/myora");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}	
	
	public static Connection getDs() throws SQLException {
		return ds.getConnection();
	}
}
