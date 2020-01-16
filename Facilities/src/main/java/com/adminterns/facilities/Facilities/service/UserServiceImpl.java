package com.adminterns.facilities.Facilities.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adminterns.facilities.Facilities.dao.UserDAO;
import com.adminterns.facilities.Facilities.model.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDAO userDAO;

	@Transactional
	@Override
	public List<User> get() {
		// TODO Auto-generated method stub
		return userDAO.get();
	}

	@Override
	public Boolean verify(String user_email) {
		// TODO Auto-generated method stub
		return userDAO.verify(user_email);
	}

}
