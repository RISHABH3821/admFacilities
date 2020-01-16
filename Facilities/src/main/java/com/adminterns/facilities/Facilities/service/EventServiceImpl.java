package com.adminterns.facilities.Facilities.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.adminterns.facilities.Facilities.dao.EventsDAO;
import com.adminterns.facilities.Facilities.model.Event;

@Service
public class EventServiceImpl implements EventService {
	
	@Autowired
	EventsDAO eventsDAO;

	@Transactional
	@Override
	public List<Event> get() {
		// TODO Auto-generated method stub
		return eventsDAO.get();
	}

}
