package com.honchar.springmvc.dao;

import java.util.List;
import com.honchar.springmvc.model.Guests;

public interface GuestsDao {
	Guests findById (int id);
	void saveGuests(Guests guests);
	void deleteGuestsByPayment(String payment);
	List<Guests> findAllGuests();
	Guests findGuestsByPayment(String payment);
	
}