package com.honchar.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import com.honchar.springmvc.model.*;

@Repository("guestsDao1")
public class  GuestsDaoImpl1 extends AbstractDao<Integer, Guests> implements GuestsDao1 {
	public Guests findById (int id) {
		return getByKey(id);
	}
	public void saveGuests(Guests guests) {
		persist(guests);
	}
	public void deleteGuestsById(int id) {
		Query query = getSession().createSQLQuery("delete from Guests where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}
	@SuppressWarnings("unchecked")
	public List<Guests> findAllGuests() {
		Criteria criteria = createEntityCriteria();
		return (List<Guests>) criteria.list();
	}
	
	public Guests findGuestsById(int id) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("id", id));
		return (Guests) criteria.uniqueResult();
	}
}