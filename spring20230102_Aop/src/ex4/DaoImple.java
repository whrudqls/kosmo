package ex4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import ex5.MyConn;

public class DaoImple implements DaoInter {

	@Override
	public void first() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);// 쳐주면 자동으로 뜸
				System.out.println(i + " ");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("End");
	}

	@Override
	public String second() {
		StringBuffer sb = new StringBuffer();
		sb.append("=============================").append("|n");
		sb.append("김길동").append("|n");
		sb.append("=============================").append("|n");
		return sb.toString();
	}

	@Override
	public void third() {
		String[] ar = { "메세지1", "메세지2", "메세지3", "메세지4", "메세지5" };
		for (int i = 0; i <= ar.length; i++) {
			System.out.println("비지니스로직의  " + ar[i]);
		}
	}

	@Override
	public String firstStatementTest(int num) {
		if (num == 1) {// statement
			try (Connection con = MyConn.getDs(); Statement stmt = con.createStatement();) {
				for (int i = 1; i < 10000; i++) {
					StringBuilder sql = new StringBuilder();
					sql.append("insert into speedtest values(");
					sql.append(i).append(",'").append("xman" + i).append("',");
					sql.append("sysdate");
					System.out.println("Log1 => "+sql);
					stmt.executeUpdate(sql.toString());
				}

			} catch (SQLException e) {

				e.printStackTrace();
			}
		} else if (num == 2) {// prepareStatement
			StringBuilder sql = new StringBuilder();
			sql.append("insert into speedtest values(?,?,sysdate)");
			try (Connection con = MyConn.getDs();
					PreparedStatement pstmt = con.prepareStatement(sql.toString())
					) {
				for (int i = 1; i < 10000; i++) {
					pstmt.setInt(1, i);
					pstmt.setString(2, "xman"+i);
					pstmt.executeUpdate();
				}
				
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return "Check 완료!";

	}

}
