package com.honchar.springmvc.dao;

import java.util.List;
import com.honchar.springmvc.model.Guests;

public interface GuestsDao1 {
	Guests findById (int id);
	void saveGuests(Guests guests);
	void deleteGuestsById(int id);
	List<Guests> findAllGuests();
	Guests findGuestsById(int id);
	
}