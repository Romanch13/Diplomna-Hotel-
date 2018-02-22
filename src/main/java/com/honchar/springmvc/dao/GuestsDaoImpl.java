package com.honchar.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import com.honchar.springmvc.model.*;

@Repository("guestsDao")
public class  GuestsDaoImpl extends AbstractDao<Integer, Guests> implements GuestsDao {
	public Guests findById (int id) {
		return getByKey(id);
	}
	
	public void saveGuests(Guests guests) {
		persist(guests);
	}
	
	public void deleteGuestsByPayment(String payment) {
		Query query = getSession().createSQLQuery("delete from Guests where payment = :payment");
		query.setString("payment", payment);
		query.executeUpdate();
	}
	
	@SuppressWarnings("unchecked")
	public List<Guests> findAllGuests() {
		Criteria criteria = createEntityCriteria();
		return (List<Guests>) criteria.list();
	}
	
	public Guests findGuestsByPayment(String payment) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("payment", payment));
		return (Guests) criteria.uniqueResult();
	}
}