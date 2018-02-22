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
@Table(name = "SPENDING_TYPES",catalog = "springmvc")
public class spending_types implements Serializable{
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "SPENDING_ID")
	private int spendingId;
	
	@Column(name ="SPENDING_TYPES")
	private String spending_Types;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "SPENDING_TYPES", referencedColumnName = "SPENDING_TYPES", insertable = false, updatable = false)
	private Guests guests;
	
	public Guests getGuests () {
		return guests;
	}
	public void setGuests(Guests guests) {
		this.guests = guests;
	}
	
	public int getSpendingId() {
		return spendingId;
	}
	
	public void setSpendingId (int spendingId) {
		this.spendingId = spendingId;
	}
	
	public String getSpending_Types() {
		return spending_Types;
	}
	
	public void setSpending_Types(String spending_Types) {
		this.spending_Types = spending_Types;
	}

	@Override
	public String toString() {
		return "spendingtypes [spendingId=" + spendingId + ", spendingTypes = " + spending_Types +"]";
	}
}