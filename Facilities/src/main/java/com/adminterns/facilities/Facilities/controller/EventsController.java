package com.adminterns.facilities.Facilities.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adminterns.facilities.Facilities.model.Event;
import com.adminterns.facilities.Facilities.service.EventService;

@RestController
@RequestMapping("/events_api")
public class EventsController {

	@Autowired
	private EventService eventService;
	
	@GetMapping("/events")
	public List<Event> get(){
		return eventService.get();
	}
}
