package com.adminterns.facilities.Facilities.dao;

import java.util.List;

import com.adminterns.facilities.Facilities.model.User;

public interface UserDAO {

	List<User> get();  
	
	Boolean verify(String user_email);
}
