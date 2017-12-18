package p19;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import p18.Connector;

public class UserDAO {

	Connector c;
	Connection con;

	UserDAO() throws ClassNotFoundException, SQLException {
		c = new Connector();
		con = c.getConnection();

	}

	public ArrayList<HashMap<String, Object>> getUserList()  {

		String sql = "select*from user_info";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			HashMap<String, Object> hm = new HashMap<String, Object>();
			hm.put("uidd", rs.getString("uidd"));
			hm.put("uino", rs.getInt("uino"));
		}
		con.close();
		return null;

	}

	public int insertUser(HashMap<String, Object> hm) throws SQLException {
		String sql = "insert into user_info(uiname,riage,uiid," 
				+ "uipwd,address,cino,uiregdate)\r\n"
				+ "values(?,?,?,?,?,1,new())";
		con = c.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,(String)hm.get("uiname"));
		ps.setInt(2,(int)hm.get("uiage"));
		ps.setString(3,(String)hm.get("uiid"));
		ps.setString(4,(String)hm.get("uipwd"));
		ps.setString(5,(String)hm.get("address"));
		int result = ps.executeUpdate();
		con.close();
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
		con.close();

		return result;
	}

}
