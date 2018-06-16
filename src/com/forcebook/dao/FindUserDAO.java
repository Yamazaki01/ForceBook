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

import com.forcebook.dto.UserDTO;

public class FindUserDAO {



	public List<UserDTO> findUser(String targetText, int id){

		List<UserDTO> arrayDto = new ArrayList<UserDTO>();
		Connection con = null;
		PreparedStatement st = null;

		try{
			Context ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup("java:/comp/env/jdbc/forcebook");

			con = ds.getConnection();
			System.out.println("DB Connected..");

			String sql = "select id, user_id from user where not id=?";
			st = con.prepareStatement(sql);
			st.setInt(1, id);
			ResultSet rs=st.executeQuery();

			while(rs.next()){
				UserDTO dto = new UserDTO();
				dto.setId(rs.getInt("id"));
				dto.setUser_id(rs.getString("user_id"));
				arrayDto.add(dto);
				dto=null;
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

}
