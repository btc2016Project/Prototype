package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
	/**
	* DBと接続する
	*
	* @return DBコネクション
	* @throws ClassNotFoundException
	* @throws SQLException
	*/
	    public static Connection getConn() throws ClassNotFoundException, SQLException {
	    	Class.forName("com.mysql.jdbc.Driver");

			// MySQLに接続
			java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/prototype?useUnicode=true&characterEncoding=utf8", "root", "");
			System.out.println("MySQLに接続できました。");

	        return conn;
	        }
	        /**
	        * DB接続を切断する
	        *
	        * @param conn
	        * DBコネクション
	        */
	        public static void close(Connection conn) {
	            try {
	                // 切断処理
	                if (conn != null) {
	                conn.close();
	                }
	                } catch (SQLException e) {
	                e.printStackTrace();
	                }
	                }
	                }


