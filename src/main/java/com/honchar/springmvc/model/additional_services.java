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
@Table(name = "ADDITIONAL_SERVICES",catalog = "springmvc")
public class additional_services implements Serializable{
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "SERVICES_ID")
	private int servicesId;
	
	@Column(name ="ADDITIONAL_SERVICE")
	private String additional_Service;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "ADDITIONAL_SERVICE", referencedColumnName = "ADDITIONAL_SERVICE", insertable = false, updatable = false)
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
	
	public void setServicesId (int servicesId) {
		this.servicesId = servicesId;
	}
	
	public String getAdditional_Service() {
		return additional_Service;
	}
	
	public void AdditionalService(String additional_Service) {
		this.additional_Service = additional_Service;
	}

	@Override
	public String toString() {
		return "additional_service [servicesId=" + servicesId + ", additionalService = " + additional_Service +"]";
	}
}