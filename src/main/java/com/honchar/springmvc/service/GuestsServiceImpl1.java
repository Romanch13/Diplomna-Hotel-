package com.honchar.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.honchar.springmvc.dao.GuestsDao1;
import com.honchar.springmvc.model.Guests;
import com.honchar.springmvc.model.*;

@Service("guestsService1")
@Transactional
public class GuestsServiceImpl1 implements GuestsService1 {

	@Autowired
	private GuestsDao1 dao;
	
	public Guests findById(int id) {
		return dao.findById(id);
	}

	public void saveGuests(Guests guests) {
		dao.saveGuests(guests);
	}
	public void updateGuests(Guests guests) {
		Guests entity = dao.findById(guests.getId());
		if(entity!=null){
			entity.setSurname(guests.getSurname());
			entity.setName(guests.getName());
			entity.setType_rooms(guests.getType_rooms());
			entity.setNumber_room(guests.getNumber_room());
			entity.setAdditional_Service(guests.getAdditional_Service());
			entity.setSpending_Types(guests.getSpending_Types());
			entity.setNumber_phone(guests.getNumber_phone());
			entity.setPayment(guests.getPayment());
			entity.setType_cards(guests.getType_cards());
			entity.setNumber_cards(guests.getNumber_cards());
			entity.setAmount_payment(guests.getAmount_payment());
			entity.setDate(guests.getDate());
		}
	}

	public void deleteGuestsById(int id) {
		dao.deleteGuestsById(id);
	}
	
	public List<Guests> findAllGuests() {
		return dao.findAllGuests();
	}

	public Guests findGuestsById(int id) {
		return dao.findGuestsById(id);
	}

	public boolean isGuestsIdUinque(Integer id) {
		Guests guests = findGuestsById(id);
		return ( guests == null || ((id != null) && (guests.getId() == id)));
	}

}
	

