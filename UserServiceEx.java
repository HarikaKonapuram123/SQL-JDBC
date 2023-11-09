package com.edu.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.edu.dao.UserDao;
import com.edu.dao.UserDaoImplementation;
import com.edu.model.User;

public class UserServiceEx {
//	private static final String Password = null;

	public void view() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		List<User> userlist = new UserDaoImplementation().viewUser();
		for (User u : userlist) {
			System.out.println(u.getuserName());
			System.out.println(u.getuserId());
			System.out.println(u.getpassword());

		}
	}

	public void userInsert() throws ClassNotFoundException, SQLException {
		User u = new User();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the userid");
		int userid = sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter the username");
		String username = sc.nextLine();
		
		System.out.println("enter the password");
		String password = sc.nextLine();
		
		u.setuserId(userid);
		u.setuserName(username);
		u.setpassword(password);
		new UserDaoImplementation().insertUser(u);
	}

	public void userUpdate() throws ClassNotFoundException, SQLException {
		User u = new User();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the user id user wants to update");
		int userid = sc.nextInt();
		sc.nextLine();
		System.out.println("enter new name");
		String username = sc.nextLine();
		
		System.out.println("enter new password");
		String password = sc.nextLine();
		u.setuserId(userid);
		u.setuserName(username);
		u.setpassword(password);
		new UserDaoImplementation().updateUser(u);
	}

	public void userDelete() throws ClassNotFoundException, SQLException {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the userid");
		int userid = sc.nextInt();
//	    	 System.out.println("enter the username");
//	    	 String username=sc.nextLine();
//	    	 System.out.println("enter the userpassword");
//	    	 String password=sc.nextLine();

		new UserDaoImplementation().deleteUser(userid);
	}

}
