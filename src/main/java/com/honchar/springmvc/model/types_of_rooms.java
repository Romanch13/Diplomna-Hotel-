package com.honchar.springmvc.model;

import java.util.List;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "TYPES_OF_ROOMS",catalog = "springmvc")
public class types_of_rooms {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "ROOMS_ID")
	private long id;
	
	@Column(name = "TYPE_ROOMS")
	private String type_rooms;

	@OneToMany(mappedBy = "types_of_rooms", cascade = CascadeType.ALL)
	private List<Guests> guests;

	public types_of_rooms() {
		
	}
	
	public types_of_rooms(String type_rooms) {
		this.type_rooms = type_rooms;
	}
	
	public long getId() {
		return id;
	}
	
	public void setID (long id) {
		this.id =  id;
	}
	
	public String getType_rooms() {
		return type_rooms;
	}
	
	public void setType_rooms(String type_rooms) {
		this.type_rooms = type_rooms;
	}

	public List<Guests> getGuests(){
		return guests;
	}
	public void setGuests(List<Guests> guests) {
	       this.guests = guests;
	    }
	
	@Override
	public String toString() {
		return "types_of_rooms [id=" + id + ", type_rooms = " + type_rooms +"]";
	}
}
