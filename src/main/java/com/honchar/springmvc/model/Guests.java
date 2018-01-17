package com.honchar.springmvc.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="GUESTS", catalog = "springmvc", uniqueConstraints = {
		@UniqueConstraint(columnNames = "Surname"),
		@UniqueConstraint(columnNames = "Name")})
public class Guests{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "GUEST_ID")
	private long id;
	
	@Column(name = "SURNAME")
	private String surname;
	
	@Column(name = "NAME")
	private String name;
	
	/*@Column(name = "TYPE_ROOM")
	private String type_rooms;*/
	
	@Column(name = "NUMBER_ROOM")
	private int number_room;
	
	@Column(name = "ADDITIONA_SERVICES")
	private String additionalServices;
	
	@Column(name = "SPENDING_TYPES")
	private String spendingTypes;
	
	@Column(name = "NUMBER_PHONE")
	private int number_phone;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE" )
	private Date date;
	
	@ManyToOne(optional = false)
	@JoinColumn(name ="TYPE_ROOMS")
	private types_of_rooms type_rooms;
	
	public Guests() {
		
	}
	
	public Guests(String surname, String name, int number_room, 
			String additionalServices, String spendingTypes, int number_phone, Date date) {
		this.surname = surname;
		this.name = name;
		this.number_room = number_room;
		this.additionalServices = additionalServices; 
		this.spendingTypes = spendingTypes;
		this.number_phone = number_phone;
		this.date = date;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name =  name;
	}
	
	public int getNumber_room() {
		return number_room;
	}
	public void setNumber_room(int number_room) {
		this.number_room = number_room;
	}
	
	public String getAdditionalServices() {
		return additionalServices;
	}
	public void setAdditionalServices(String additionalServices) {
		this.additionalServices = additionalServices;
	}
		
	public String getSpendingTypes() {
		return spendingTypes;
	}
	public void setSpendingType(String spendingTypes) {
		this.spendingTypes =  spendingTypes;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date =  date;
	}
	
	public types_of_rooms getType_rooms() {
		return type_rooms;
	}
	public void setType_rooms(types_of_rooms type_rooms) {
		this.type_rooms = type_rooms;
	}
	
	@Override
	public String toString(){
		return "Guests [id=" + id +", surname=" + surname + ", name=" + name + 
				", number_room=" + number_room + ",additionalServices=" + additionalServices + 
				", spendingTypes=" + spendingTypes+ ", date=" + date + "]";
	}
	
}
