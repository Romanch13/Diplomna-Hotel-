package com.honchar.springmvc.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "TYPES_OF_ROOMS",catalog = "springmvc")
public class types_of_rooms implements Serializable {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "ROOMS_ID")
	private long roomsId;
	
	@Column(name ="TYPE_ROOMS")
	private String type_rooms;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "TYPE_ROOMS", referencedColumnName = "TYPE_ROOMS", insertable = false, updatable = false)
	private Guests guests;
	
	public Guests getGuests () {
		return guests;
	}
	public void setGuests(Guests guests) {
		this.guests = guests;
	}
	
	public long getRoomsId() {
		return roomsId;
	}
	
	public void setRoomsId (long roomsId) {
		this.roomsId = roomsId;
	}
	
	public String getType_rooms() {
		return type_rooms;
	}
	
	public void setType_rooms(String type_rooms) {
		this.type_rooms = type_rooms;
	}

	@Override
	public String toString() {
		return "types_of_rooms [roomsId=" + roomsId + ", type_rooms = " + type_rooms +"]";
	}
}

