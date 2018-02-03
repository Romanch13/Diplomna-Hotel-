package com.honchar.springmvc.model;

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


@Entity
@Table(name="GUESTS", catalog = "springmvc")
public class Guests{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "GUEST_ID")
	private long guestsId;
	
	@Column(name = "SURNAME")
	private String surname;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "TYPE_ROOMS")
	private String type_rooms;
	
	@Column(name = "NUMBER_ROOM")
	private int number_room;
	
	@Column(name = "ADDITIONAL_SERVICES")
	private String additionalServices;
	
	@Column(name = "SPENDING_TYPES")
	private String spendingTypes;
	
	@Column(name = "NUMBER_PHONE")
	private int number_phone;
	
	@Column(name = "PAYMENT")
	private String payment;
	
	@Column(name = "TYPE_CARDS")
	private String type_cards;
	
	@Column(name = "NUMBER_CARDS")
	private int number_cards;
	
	@NotNull
	@Digits(integer=8, fraction=2)
	@Column(name = "AMOUNT_PAYMENT", nullable = false)
	private BigDecimal amount_payment;
	
	@Temporal(TemporalType.DATE)
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
	
	public Guests(String surname, String name, String type_rooms, int number_room, String additionalServices, 
			String spendingTypes, int number_phone,String payment,String type_cards,
			int number_cards, BigDecimal amount_payment, Date date) {
		this.surname = surname;
		this.name = name;
		this.type_rooms = type_rooms;
		this.number_room = number_room;
		this.additionalServices = additionalServices; 
		this.spendingTypes = spendingTypes;
		this.number_phone = number_phone;
		this.payment = payment;
		this.type_cards = type_cards;
		this.number_cards = number_cards;
		this.amount_payment = amount_payment;
		this.date = date;
	}
	
	public long getGuestsId() {
		return guestsId;
	}
	public void setGuestsId(long guestsId) {
		this.guestsId = guestsId;
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
	
	public int getNumber_phone() {
		return number_phone;
	}
	public void setNumber_phone(int number_phone) {
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
	
	public int getNumber_cards() {
		return number_cards;
	}
	public void setNumber_cards(int number_cards) {
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
	public void setAdd_services(List<additional_services> add_services) {
		this.add_services = add_services;	
	}
	
	
	@Override
	public String toString(){
		return "Guests [guestsId=" + guestsId +", surname=" + surname + ", name=" + name + 
				", type_rooms=" + type_rooms + ",additionalServices=" + additionalServices + 
				", spendingTypes=" + spendingTypes+ ", number_phone=" + number_phone +",payment=" 
				+ payment + ",type_cards=" + type_cards+ ",number_cards=" + number_cards +",amount_payment=" + amount_payment +", date=" + date + "]";
	}
	
}
