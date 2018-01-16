package com.honchar.springmvc.model;

import java.util.Date;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.AUTO;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name="Vidviduvachi", catalog = "springmvc", uniqueConstraints = {
		@UniqueConstraint(columnNames = "Surname"),
		@UniqueConstraint(columnNames = "Name")})
public class Vidviduvachi{
	private int idVisitors;
	private String Surname;
	private String Name;
	private String Type_room;
	private int Number_room;
	private String Dodatkovi_poslugi;
	private String Type_vutrat;
	private int Number_phone;
	private Date date;
	
	public Vidviduvachi() {
		
	}
	public Vidviduvachi(String Type_room) {
		this.Type_room = Type_room;
	}	
	
@Id
@GeneratedValue (strategy = GenerationType.AUTO)
@Column(name = "idVisitors",unique = true, nullable = false )
	public int getId() {
		return idVisitors;
	}
	public void setId(int idVisitors) {
		this.idVisitors = idVisitors;
	}
@Column(name = "Surname", nullable = false, length = 30 )	
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String Surname) {
		this.Surname = Surname;
	}
@Column(name = "Name", nullable = false, length = 30 )	
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name= Name;
	}
@Column(name = "Number_room", nullable = false, length = 20 )	
	public int getNumber_room() {
		return Number_room;
	}
	public void setNumber_room(int Number_room) {
		this.Number_room = Number_room;
	}
@Column(name = "Dodatkovi_poslugi", nullable = false, length = 30 )
	public String getDodatkovi_poslugi() {
		return Dodatkovi_poslugi;
	}
	public void setDodatkovi_poslugi(String Dodatkovi_poslugi) {
		this.Dodatkovi_poslugi = Dodatkovi_poslugi;
	}
@Column(name = "Type_vutrat", nullable = false, length = 30 )
	public String getType_vutrat() {
		return Type_vutrat;
	}
	public void setType_vutrat(String Type_vutrat) {
		this.Type_vutrat = Type_vutrat;
	}
@Column(name = "Number_phone", nullable = false, length = 13 )
	public int getNumber_phone() {
		return Number_phone;
	}
	public void Number_phone(int Number_phone) {
		this.Number_phone = Number_phone;
	}
@Temporal(TemporalType.DATE)
@Column(name = "date", unique = true, nullable = false, length = 10 )
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
@ManyToOne
@JoinColumn(name = "type_rooms")
	public String getType_room() {
		return Type_room;
	}
	public void setType_room(String Type_room) {
		this.Type_room = Type_room;
	}	
}