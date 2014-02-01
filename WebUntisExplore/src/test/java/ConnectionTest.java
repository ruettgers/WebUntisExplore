

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		jdbcCheck();
	}

	private static void jdbcCheck() {

		System.out.println("MySQL Connect Example.");
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "webuntis";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "";
		try {
			Class.forName(driver).newInstance();
			conn = DriverManager
					.getConnection(url + dbName+"?"+"user="+userName+"&"+"password="+password);
			System.out.println("Connected to the database");
			conn.close();
			System.out.println("Disconnected from database");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
