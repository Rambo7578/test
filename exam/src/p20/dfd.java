package p20;

import java.sql.SQLException;

public class dfd {

	DBCon dbcon;
	
	dfd(){
		dbcon=new DBCon();
	}
	
	public int updateClassInfo() {
		int result=0;
		String sql="update class_info\r\n" + 
				"set cidesc=?\r\n" + 
				"where cino=?";
		try {
			dbcon.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	
}
