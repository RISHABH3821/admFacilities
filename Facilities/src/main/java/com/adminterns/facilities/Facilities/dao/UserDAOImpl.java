package com.adminterns.facilities.Facilities.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.adminterns.facilities.Facilities.model.User;

@Repository
public class UserDAOImpl implements UserDAO{
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<User> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<User> query = currentSession.createQuery("from User", User.class);
		return query.getResultList(); //list of users
	}

	@Override
	public Boolean verify(String user_email) {
		Session currentSession = entityManager.unwrap(Session.class);
		TypedQuery<User> query = currentSession.createQuery("SELECT u from User u where LOWER(user_email)=LOWER(:email)", User.class);
		query.setParameter("email", user_email);
	
		if(query.getResultList().size()>0) {
			return true;
		}else {
			return false;
		}
	}

}
