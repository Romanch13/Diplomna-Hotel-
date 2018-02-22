package com.honchar.springmvc.service;

import java.util.List;
import com.honchar.springmvc.model.Guests;

public interface GuestsService {
	Guests findById (int id);
	void saveGuests(Guests guests);
	void updateGuests(Guests guests);
	void deleteGuestsByPayment(String payment);
	List<Guests> findAllGuests();
	Guests findGuestsByPayment(String payment);
	boolean isGuestsPaymentUinque(Integer id, String payment);
}