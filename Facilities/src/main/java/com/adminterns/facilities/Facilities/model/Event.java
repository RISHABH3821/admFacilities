package com.adminterns.facilities.Facilities.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "events_table", schema= "dbo")
public class Event {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer event_id;
	
	@Column
	private String event_title;
	
	@Column
	private String event_desc;
	
	@Column
	private String event_type;
	
	@Column
	private Double event_rating;
	
	@Column
	private String event_address;

	public Integer getEvent_id() {
		return event_id;
	}

	public void setEvent_id(Integer event_id) {
		this.event_id = event_id;
	}

	public String getEvent_title() {
		return event_title;
	}

	public void setEvent_title(String event_title) {
		this.event_title = event_title;
	}

	public String getEvent_desc() {
		return event_desc;
	}

	public void setEvent_desc(String event_desc) {
		this.event_desc = event_desc;
	}

	public String getEvent_type() {
		return event_type;
	}

	public void setEvent_type(String event_type) {
		this.event_type = event_type;
	}

	public Double getEvent_rating() {
		return event_rating;
	}

	public void setEvent_rating(Double event_rating) {
		this.event_rating = event_rating;
	}

	public String getEvent_address() {
		return event_address;
	}

	public void setEvent_address(String event_address) {
		this.event_address = event_address;
	}

	@Override
	public String toString() {
		return "Event [event_id=" + event_id + ", event_title=" + event_title + ", event_desc=" + event_desc
				+ ", event_type=" + event_type + ", event_rating=" + event_rating + ", event_address=" + event_address
				+ "]";
	}
	
}
