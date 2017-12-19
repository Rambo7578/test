package p19;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class UserDAO {

	Connector c;
	Connection con;

	UserDAO() throws ClassNotFoundException {
		c = new Connector();
		

	}
	public void openCon()throws SQLException {
		con=c.getConnection();
				
	}
	public void closeCon()throws SQLException {
		c.close();
	}
	public void commit()throws SQLException {
		con.commit();
	}
	public void rollback()throws SQLException {
		con.rollback();
	}

	public ArrayList<HashMap<String, Object>> getUserList() throws SQLException  {
		con = c.getConnection();
		String sql = "select*from user_info";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			HashMap<String, Object> hm = new HashMap<String, Object>();
			hm.put("uidd", rs.getString("uidd"));
			hm.put("uino", rs.getInt("uino"));
		}
		
		return null;

	}

	public int insertUser(HashMap<String, Object> hm) throws SQLException {
		String sql = "insert into user_info(uiname,riage,uiid," 
				+ "uipwd,address,cino,uiregdate)\r\n"
				+ "values(?,?,?,?,?,1,new())";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,(String)hm.get("uiname"));
		ps.setInt(2,(Integer)hm.get("uiage"));
		ps.setString(3,(String)hm.get("uiid"));
		ps.setString(4,(String)hm.get("uipwd"));
		ps.setString(5,(String)hm.get("address"));
		int result = ps.executeUpdate();

		return result;

	}

	public int updateUser(HashMap<String, Object> hm) {
		return 0;
	}

	public int deleteUser(int userNo) throws SQLException {
		String sql = "delete from user_info where uino=?";
		con = c.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, userNo);
		int result = ps.executeUpdate();

		return result;
	}
	

}
