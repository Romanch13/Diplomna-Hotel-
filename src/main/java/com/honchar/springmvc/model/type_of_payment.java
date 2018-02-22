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
@Table(name = "TYPE_OF_PAYMENT",catalog = "springmvc")
public class type_of_payment  implements Serializable{
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "PAYMENT_ID")
	private int paymentId;
	
	@Column(name ="PAYMENT")
	private String payment;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "PAYMENT", referencedColumnName = "PAYMENT", insertable = false, updatable = false)
	private Guests guests;
	
	public Guests getGuests () {
		return guests;
	}
	public void setGuests(Guests guests) {
		this.guests = guests;
	}
	
	public int getPaymentId() {
		return paymentId;
	}
	
	public void setPaymentId (int paymentId) {
		this.paymentId = paymentId;
	}
	
	public String getPayment() {
		return payment;
	}
	
	public void setPayment(String payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "type_of_payment [paymentId=" + paymentId + ", payment = " + payment +"]";
	}
}