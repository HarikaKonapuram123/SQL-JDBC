package com.edu.dao;

import java.sql.SQLException;
import java.util.List;

import com.edu.model.User;

public interface UserDao
{
	public List<User>viewUser() throws ClassNotFoundException, SQLException;
	public void insertUser(User u) throws ClassNotFoundException, SQLException;
	public void updateUser(User u) throws ClassNotFoundException, SQLException;
	public void deleteUser(int  userid) throws ClassNotFoundException, SQLException;

}
