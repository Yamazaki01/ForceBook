package com.forcebook.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.forcebook.dto.FindAllUserDTO;
import com.forcebook.dto.UserDTO;

public class FindUserDAO {

	public List<FindAllUserDTO> findAllUser(String targetText, int id){

		List<FindAllUserDTO> arrayDto = new ArrayList<FindAllUserDTO>();
		Connection con = null;
		PreparedStatement st = null;

		try{
			Context ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup("java:/comp/env/jdbc/forcebook");

			con = ds.getConnection();
			System.out.println("DB Connected..");

			targetText = "%" + targetText + "%";
			String sql = "select id, user_id from user where user_id Like ? and not id=?";
			st = con.prepareStatement(sql);
			st.setString(1, targetText);
			st.setInt(2, id);
			ResultSet rs=st.executeQuery();

			while(rs.next()){
				FindAllUserDTO dto = new FindAllUserDTO();
				dto.setId(rs.getInt("id"));
				dto.setUser_name(rs.getString("user_id"));
				arrayDto.add(dto);
			}
		}
		catch(SQLException e)
		{
            /*エラーメッセージ出力*/
            System.out.println( "Connection Failed. : " + e.toString() );
            return arrayDto;
		}
		catch(Exception e)
		{
			System.out.println("呼び出し失敗");
			return arrayDto;
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
		return arrayDto;
	}


	public UserDTO findUser(int id){

		UserDTO dto = null;
		Connection con = null;
		PreparedStatement st = null;

		try{
			Context ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup("java:/comp/env/jdbc/forcebook");

			con = ds.getConnection();
			System.out.println("DB Connected..");

			String sql = "select id, user_id from user where id=?";
			st = con.prepareStatement(sql);
			st.setInt(1, id);
			ResultSet rs=st.executeQuery();

			while(rs.next()){
				dto = new UserDTO();
				dto.setId(rs.getInt("id"));
				dto.setUser_name(rs.getString("user_id"));
				dto.setUser_open_nickname(rs.getString("user_open_nickname"));
				dto.setUser_mail(rs.getString("user_mail"));
			}
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
		return dto;
	}


}
