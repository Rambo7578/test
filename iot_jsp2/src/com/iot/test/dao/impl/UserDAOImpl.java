package com.iot.test.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.iot.test.common.DBCon;
import com.iot.test.dao.UserDAO;
import com.iot.test.utils.DBUtil;
import com.iot.test.vo.UserClass;

public class UserDAOImpl implements UserDAO {

	@Override
	public ArrayList<UserClass> selectUserList() {
		ArrayList<UserClass> userList = new ArrayList<UserClass>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
		
			String sql = "select *, date_format(uiregdate,'%Y-%m-%d') as rdate from user_info ui, class_info ci where ui.cino = ci.cino ";
			con = DBCon.getCon();
			ps = con.prepareStatement(sql);

			rs = ps.executeQuery();

			while (rs.next()) {
				UserClass uc = new UserClass();
				uc.setAddress(rs.getString("address"));
				uc.setCiDesc(rs.getString("cidesc"));
				uc.setCiName(rs.getString("ciname"));
				uc.setCiNo(rs.getInt("cino"));
				uc.setUiAge(rs.getInt("uiage"));
				uc.setUiId(rs.getString("uiid"));
				uc.setUiName(rs.getString("uiname"));
				uc.setUiNo(rs.getInt("uino"));
				uc.setUiPwd(rs.getString("uipwd"));
				uc.setUiRegdate(rs.getString("rdate"));
				userList.add(uc);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.closeAll(rs,ps,con);
		}
		return userList;
	}

	@Override
	public UserClass selectUser(int uiNO) {
		return null;
	}

	@Override
	public UserClass selectUser(String uiId) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = DBCon.getCon();
			String sql = "select * from user_info ui, class_info ci where ui.cino = ci.cino and ui.uiid=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, uiId);
			rs = ps.executeQuery();
			while (rs.next()) {
				UserClass uc = new UserClass();
				uc.setAddress(rs.getString("address"));
				uc.setCiDesc(rs.getString("cidesc"));
				uc.setCiName(rs.getString("ciname"));
				uc.setCiNo(rs.getInt("cino"));
				uc.setUiAge(rs.getInt("uiage"));
				uc.setUiId(rs.getString("uiid"));
				uc.setUiName(rs.getString("uiname"));
				uc.setUiNo(rs.getInt("uino"));
				uc.setUiPwd(rs.getString("uipwd"));
				uc.setUiRegdate(rs.getString("uiRegdate"));
				return uc;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			DBUtil.closeAll(rs,ps,con);
		}
			
		return null;
	}

	@Override
	public int insertUser(UserClass uc) {

		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DBCon.getCon();
			String sql = "insert into user_info(uiname, uiage, uiid, uipwd, address, uiregdate, cino)\r\n" + 
					"values(?,?,?,?,?,now(),?);";
			ps = con.prepareStatement(sql);
			ps.setString(1, uc.getUiName());
			ps.setInt(2, uc.getUiAge());
			ps.setString(3, uc.getUiId());
			ps.setString(4, uc.getUiPwd());
			ps.setString(5, uc.getAddress());
			ps.setInt(6, uc.getCiNo());				
			
			return ps.executeUpdate();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}finally {			
			DBUtil.closeAll(null,ps,con);			
		}
		return 0;
	}

	@Override
	public int deleteUser(UserClass uc) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DBCon.getCon();
			String sql = "delete from user_info where uiNo=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, uc.getUiNo());
			return ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.closeAll(null,ps,con);	
		
			
			
		}
		return 0;
		
	}

	@Override
	public int updateUser(UserClass uc) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DBCon.getCon();
			String sql = "update user_info set uiName=?,uiAge=?, address=? where uiNo=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, uc.getUiName());
			ps.setInt(2, uc.getUiAge());
			ps.setString(3, uc.getAddress());
			ps.setInt(4, uc.getUiNo());
			
			
			return ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.closeAll(null,ps,con);	
		
			
			
		}
		return 0;
	}

}
