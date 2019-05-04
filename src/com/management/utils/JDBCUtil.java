package com.management.utils;
/**
*导入JDBC包
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * JDBC
 */
public class JDBCUtil {

	private static Connection con;

	/**
	 *
	 * @return java.sql.Connection
	 */
	public static Connection getConnection()
			throws ClassNotFoundException, SQLException {
		//注册驱动
		//使用java.sql.DriverManager类的静态方法registerDriver（Driver driver）
		Class.forName("com.mysql.jdbc.Driver");
		//获得连接
		//url:数据库地址 jdbc:mysql://连接主机ip:端口号//数据库名字
		String url = "jdbc:mysql://localhost:3306/manager"
				+ "?useUnicode=true&characterEncoding=utf-8&useSSL=false";
		//数据库的用户名
		String user = "root";
		//数据库的密码
		String password = "2016";
		//获取连接对象
		con = DriverManager.getConnection(url, user, password);
		return con;
	}

}
