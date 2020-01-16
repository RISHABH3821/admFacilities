package com.adminterns.facilities.Facilities.service;

import java.util.List;

import com.adminterns.facilities.Facilities.model.User;

public interface UserService {
	List<User> get();
	
	Boolean verify(String user_email);
}
