package com.edu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.edu.model.User;

public class UserDaoImplementation implements UserDao {
	public ArrayList<User> viewUser() throws ClassNotFoundException, SQLException {
	    ArrayList<User> list = new ArrayList<User>();
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "root");
	    PreparedStatement st = con.prepareStatement("select * from user1");
	    ResultSet rs = st.executeQuery();
	    while (rs.next()) {
	        User u = new User();
	        u.setuserName(rs.getString("userName"));
	        u.setuserId(rs.getInt("userId"));
	        u.setpassword(rs.getString("password"));

	        list.add(u);
	        System.out.println(list);
	    }
		return list;
	}
	public void insertUser(User u) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "root");
		PreparedStatement st = con.prepareStatement("insert into user1(username,userid,password) values(?,?,?);");
		st.setString(1, u.getuserName());
		st.setInt(2, u.getuserId());

		st.setString(3, u.getpassword());

		st.executeUpdate();
		System.out.println("inserted");
	}

//	public void updateUser(User u) throws ClassNotFoundException, SQLException {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "root");
//		PreparedStatement st = con.prepareStatement("update user1 set username=?,password=? where userid=?");
//		st.setString(1, u.getuserName());
//		st.setString(3, u.getpassword());
//		
//        
//        st.setInt(2, u.getuserId());
//        System.out.println("Before update: Username = " + u.getuserName());
//       
//		int rowsUpdated=st.executeUpdate();
//		
//		if (rowsUpdated > 0) {
//            System.out.println("Data updated successfully.");
//        } else {
//            System.out.println("No rows were updated.");
//        }
//
//	}

	public void updateUser(User u) throws ClassNotFoundException, SQLException {
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "root");
	    PreparedStatement st = con.prepareStatement("update user1 set username=?, password=? where userid=?");
	    st.setString(1, u.getuserName());
	    st.setString(2, u.getpassword());
	    st.setInt(3, u.getuserId());

	    int rowsUpdated = st.executeUpdate();

	    if (rowsUpdated > 0) {
	        System.out.println("Data updated successfully.");
	    } else {
	        System.out.println("No rows were updated.");
	    }
	}

	@Override
	public void deleteUser(int userid) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "root");
		PreparedStatement st = con.prepareStatement("delete from user1 where userid=?");

		st.setInt(1, userid);
		st.executeUpdate();
		System.out.println("deleted");

	}
}
