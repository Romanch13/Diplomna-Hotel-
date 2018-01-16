package com.honchar.springmvc.model;


import java.util.Set;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Type_room",catalog = "springmvc")
public class Type_room{
	private int id;
	private String type_rooms;
	private Set<Vidviduvachi> vidviduvachi;
	
	public Type_room() {
		
	}
	public Type_room(String type_rooms) {
		this.type_rooms = type_rooms;
	}
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return id;
	}	
	public void setId(int id) {
		this.id = id;
	}
@Column(name = "type_rooms", nullable = false)	
	public String getType_rooms() {
		return type_rooms;
	}
	public void setType_rooms(String type_rooms) {
		this.type_rooms = type_rooms;
	}
	
@OneToMany(mappedBy = "Type_room", cascade = CascadeType.ALL)
    public Set<Vidviduvachi> getVidviduvachi() {
        return vidviduvachi;
    }
	public void setVidviduvachi(Set<Vidviduvachi> vidviduvachi) {
		this.vidviduvachi = vidviduvachi;
	}


}