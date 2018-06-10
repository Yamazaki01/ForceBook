package com.forcebook.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.forcebook.dtd.UserDTD;



public class UserDAO {
	public UserDTD serch(String user_name, String user_pass)
	{

		UserDTD dtd =null;
		Connection con = null;
		PreparedStatement st = null;
		try
		{

			Context ic = new InitialContext();

//			Class.forName("com.mysql.jdbc.Driver");
			DataSource ds = (DataSource)ic.lookup("java:/comp/env/jdbc/forcebook");

			con = ds.getConnection();
//			Connection con = DriverManager.getConnection(
//					"jdbc:mysql://localhost:3306/forcebook?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "mysql");

			System.out.println("DB Connected..");

			String sql = "select * from user where user_id=? and user_pass=?";
			st = con.prepareStatement(sql);
			st.setString(1, user_name);
			st.setString(2, user_pass);
			ResultSet rs=st.executeQuery();

			while(rs.next()){
				dtd = new UserDTD();
				dtd.setId(rs.getInt("id"));
				dtd.setUser_id(rs.getString("user_id"));
			}

			st.close();
			con.close();

			return dtd;

		}
		catch(SQLException e)
		{
            /*エラーメッセージ出力*/
            System.out.println( "Connection Failed. : " + e.toString() );
            return dtd;
		}
		catch(Exception e)
		{
			System.out.println("呼び出し失敗");
			return dtd;
		}
		finally
		{
			System.out.println("finaaly");
			try{
				if(st != null){
					st.close();
				}
				if(con != null){
					con.close();
				}
			}
			catch(SQLException e){
				System.out.println(e + "DB finally SQLException");
			}

		}
	}
}
