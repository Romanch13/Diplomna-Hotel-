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
@Table(name = "TYPE_OF_CARDS",catalog = "springmvc")
public class type_of_cards {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "CARDS_ID")
	private int cardsId;
	
	@Column(name ="TYPE_CARDS")
	private String type_cards;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "TYPE_CARDS")
	private Guests guests;
	
	public Guests getGuests () {
		return guests;
	}
	public void setGuests(Guests guests) {
		this.guests = guests;
	}
	
	public int geCcardsId() {
		return cardsId;
	}
	
	public void setCardsId (int cardsId) {
		this.cardsId = cardsId;
	}
	
	public String getType_cards() {
		return type_cards;
	}
	
	public void setType_cards(String type_cards) {
		this.type_cards = type_cards;
	}

	@Override
	public String toString() {
		return "type_of_cards [cardsId=" + cardsId + ", type_cards = " + type_cards +"]";
	}
}