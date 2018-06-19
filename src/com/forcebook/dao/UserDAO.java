package com.forcebook.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.forcebook.dto.UserDTO;



public class UserDAO {
	public UserDTO user_serch(String user_name, String user_pass)
	{

		UserDTO dto =null;
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
				dto = new UserDTO();
				dto.setId(rs.getInt("id"));
				dto.setUser_name(rs.getString("user_id"));
			}

			return dto;
		}
		catch(SQLException e)
		{
            /*エラーメッセージ出力*/
            System.out.println( "Connection Failed. : " + e.toString() );
            return dto;
		}
		catch(Exception e)
		{
			System.out.println("呼び出し失敗");
			return dto;
		}
		finally
		{
			System.out.println("finaaly");
			try{
				if(st != null){
					st.close();}
				if(con != null){
					con.close();}
			}
			catch(SQLException e){
				System.out.println(e + "DB finally SQLException");
			}
		}
	}

	public int user_insert(String user_name,  String user_pass, String user_mail)
	{
		Connection con = null;
		PreparedStatement st = null;
		int result = 0;
		try
		{
			Context ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup("java:/comp/env/jdbc/forcebook");

			con = ds.getConnection();
			System.out.println("DB Connected..");

			String sql = "insert into forcebook.user(user_id, user_pass,user_mail) values(?,?,?);";
			st = con.prepareStatement(sql);
			st.setString(1, user_name);
			st.setString(2, user_pass);
			st.setString(3, user_mail);
			result =st.executeUpdate();

			return result;

		}
		catch(SQLException e)
		{
            /*エラーメッセージ出力*/
            System.out.println( "Connection Failed. : " + e.toString() );
            return result;
		}
		catch(Exception e)
		{
			System.out.println("呼び出し失敗");
			return result;
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
