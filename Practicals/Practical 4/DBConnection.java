package edu;
import java.sql.*;


public class DBConnection {
	static Connection cn=null;
	
	public static Connection getConnection() {
		try {
			cn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/db","root","");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cn;
	}
	
	public static void main(String[] args) {
		try {
			cn=getConnection();
			if(cn!=null) {
				System.out.println("Connected");
				PreparedStatement ps=cn.prepareStatement("select * from emp where eno=?");
				ps.setInt(1, 100);
				ResultSet rs=ps.executeQuery();
				
				while(rs.next()) {
					System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
				}
				
				CallableStatement cs = cn.prepareCall("{call getSal(?,?)}");
				cs.registerOutParameter(2, Types.INTEGER);
				cs.setInt(1, 100);
				cs.execute();
				int n=cs.getInt(2);
				System.out.println("Salary: "+n);
				cn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
