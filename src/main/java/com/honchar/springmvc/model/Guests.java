package com.honchar.springmvc.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="GUESTS")
public class Guests implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	@Size(min=3, max=50)
	@Column(name = "SURNAME")
	private String surname;
	
	@Size(min=3, max=50)
	@Column(name = "NAME")
	private String name;
	
	@NotNull
	@Column(name = "TYPE_ROOMS")
	private String type_rooms;
	
	@NotNull
	@Column(name = "NUMBER_ROOM")
	private int number_room;
	
	@NotNull
	@Column(name = "ADDITIONAL_SERVICE")
	private String additional_Service;
	
	@NotNull
	@Column(name = "SPENDING_TYPES")
	private String spending_Types;
	
	
	@Column(name = "NUMBER_PHONE")
	private String number_phone;
	
	@NotNull
	@Column(name = "PAYMENT")
	private String payment;
	
	@Column(name = "TYPE_CARDS")
	private String type_cards;
	
	@Column(name = "NUMBER_CARDS")
	private String number_cards;
	
	@NotNull
	@Digits(integer=8, fraction=2)
	@Column(name = "AMOUNT_PAYMENT", nullable = false)
	private BigDecimal amount_payment;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="dd/MM/yyyy") 
	@Column(name = "DATE" )
	private Date date;
	
	@OneToMany(mappedBy="guests", cascade = CascadeType.ALL)
	private List<types_of_rooms> type_of_rooms;
	
	@OneToMany(mappedBy="guests", cascade = CascadeType.ALL)
	private List<type_of_payment> type_payment;
	
	@OneToMany(mappedBy="guests", cascade = CascadeType.ALL)
	private List<type_of_cards> types_cards;
	
	@OneToMany(mappedBy="guests", cascade = CascadeType.ALL)
	private List<spending_types> types_spending;
	
	@OneToMany(mappedBy="guests", cascade = CascadeType.ALL)
	private List<additional_services> add_services;
	
	public Guests() {
		
	}
	
	public Guests(String surname, String name, String type_rooms, int number_room, String additional_Service, 
			String spending_Types, String number_phone,String payment,String type_cards,
			String number_cards, BigDecimal amount_payment, Date date) {
		this.surname = surname;
		this.name = name;
		this.type_rooms = type_rooms;
		this.number_room = number_room;
		this.additional_Service = additional_Service; 
		this.spending_Types = spending_Types;
		this.number_phone = number_phone;
		this.payment = payment;
		this.type_cards = type_cards;
		this.number_cards = number_cards;
		this.amount_payment = amount_payment;
		this.date = date;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	
	public String getType_rooms() {
		return type_rooms;
	}
	public void setType_rooms(String type_rooms) {
		this.type_rooms = type_rooms;
	}
	
	public int getNumber_room() {
		return number_room;
	}
	public void setNumber_room(int number_room) {
		this.number_room = number_room;
	}
	
	public String getAdditional_Service() {
		return additional_Service;
	}
	public void setAdditional_Service(String additional_Service) {
		this.additional_Service = additional_Service;
	}
		
	public String getSpending_Types() {
		return spending_Types;
	}
	public void setSpending_Types(String spending_Types) {
		this.spending_Types =  spending_Types;
	}
	
	public String getNumber_phone() {
		return number_phone;
	}
	public void setNumber_phone(String number_phone) {
		this.number_phone = number_phone;
	}
	
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	
	public String getType_cards() {
		return type_cards;
	}
	public void setType_cards(String type_cards) {
		this.type_cards = type_cards;
	}
	
	public String getNumber_cards() {
		return number_cards;
	}
	public void setNumber_cards(String number_cards) {
		this.number_cards = number_cards;
	}
	
	public BigDecimal getAmount_payment() {
		return amount_payment;
	}
	public void setAmount_payment(BigDecimal amount_payment) {
		this.amount_payment = amount_payment;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date =  date;
	}

	public List<types_of_rooms> getType_of_rooms() {
		return type_of_rooms;
	}
	public void setTypes_of_rooms(List<types_of_rooms> type_of_rooms) {
		this.type_of_rooms = type_of_rooms;	
	}
	
	public  List<type_of_payment> getType_payment() {
		return type_payment;
	}
	public void setType_payment(List<type_of_payment> type_payment) {
		this.type_payment = type_payment;	
	}
	
	public  List<type_of_cards> getTypes_cards() {
		return types_cards;
	}
	public void setTypes_cards(List<type_of_cards> types_cards) {
		this.types_cards = types_cards;	
	}
	
	public  List<spending_types> getTypes_spending() {
		return types_spending;
	}
	public void setTypes_spending(List<spending_types> types_spending) {
		this.types_spending = types_spending;	
	}
	public  List<additional_services> getAdd_services() {
		return add_services;
	}
	public void setAdd_service(List<additional_services> add_services) {
		this.add_services = add_services;	
	}
	
	
	@Override
	public String toString(){
		return "Guests [id=" + id +", surname=" + surname + ", name=" + name + 
				", type_rooms=" + type_rooms + ",additional_Service=" + additional_Service + 
				", spending_Types=" + spending_Types+ ", number_phone=" + number_phone +",payment=" 
				+ payment + ",type_cards=" + type_cards+ ",number_cards=" + number_cards +",amount_payment=" + amount_payment +", date=" + date + "]";
	}
	
}
