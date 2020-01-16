package com.adminterns.facilities.Facilities.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.adminterns.facilities.Facilities.model.Event;

@Repository
public class EventDAOImpl implements EventsDAO {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Event> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Event> query = currentSession.createQuery("from Event", Event.class);
		return query.getResultList(); //list of users
	}

}
