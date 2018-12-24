package postgrecon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample_pos_conn {
	public static void main(String[] args) {
		try {
			
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		// 接続文字列
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "waka";
		String password = "";
		
		// jdbcドライバの定義
		Class.forName("org.postgresql.Driver");
		// sqlへの接続
		conn = DriverManager.getConnection(url, user, password);
		stmt = conn.createStatement();
		
		// select実行
		rset = stmt.executeQuery("SELECT 1 as col_1");
		
		// 結果表示
		rset.next();
		System.out.println(rset.getInt("col_1"));
		
		rset.close();
		stmt.close();
		conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
