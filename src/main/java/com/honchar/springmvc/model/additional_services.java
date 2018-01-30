package com.honchar.springmvc.model;

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
@Table(name = "ADDITIONAL_SERVICES",catalog = "springmvc")
public class additional_services{
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "SERVICES_ID")
	private int servicesId;
	
	@Column(name ="ADDITIONAL_SERVICES")
	private String additionalServices;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "ADDITIONAL_SERVICES")
	private Guests guests;
	
	public Guests getGuests () {
		return guests;
	}
	public void setGuests(Guests guests) {
		this.guests = guests;
	}
	
	public int getServicesId() {
		return servicesId;
	}
	
	public void setServicesIdd (int servicesId) {
		this.servicesId = servicesId;
	}
	
	public String getAdditionalServices() {
		return additionalServices;
	}
	
	public void setSpendingTypes(String additionalServices) {
		this.additionalServices = additionalServices;
	}

	@Override
	public String toString() {
		return "additional_services [servicesId=" + servicesId + ", additionalServices = " + additionalServices +"]";
	}
}