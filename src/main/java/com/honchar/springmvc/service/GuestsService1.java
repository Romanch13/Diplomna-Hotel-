package com.honchar.springmvc.service;

import java.util.List;
import com.honchar.springmvc.model.Guests;

public interface GuestsService1 {
	Guests findById (int id);
	void saveGuests(Guests guests);
	void updateGuests(Guests guests);
	void deleteGuestsById(int id);
	List<Guests> findAllGuests();
	Guests findGuestsById(int id);
	boolean isGuestsIdUinque(Integer id);
}