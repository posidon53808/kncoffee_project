package Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import Model.customer;

public class customerDao implements implDao {

	public void add(Object o) {
		Session se=connDatabase.getDb();
		Transaction t= se.beginTransaction();
		t.commit();
		se.save(o);
		se.close();
		
	}

	public List<Object> queryAll() {
		Session se=connDatabase.getDb();
		String HQL="from customer";
		Query q=se.createQuery(HQL);
		List<Object> l=q.list();
		return l;
	}

	public Object queryId(int id) {
		Session se=connDatabase.getDb();
		customer c=se.get(customer.class,id);
		return c;
		
	}

	public List<Object> queryUser(String username, String password) {
		Session se=connDatabase.getDb();
		String HQL="from customer where username=?1 and password=?2";
		Query q=se.createQuery(HQL);
		q.setParameter(1, username);
		q.setParameter(2, password);
		List<Object> l=q.list();
		return l;
	}

	public List<Object> queryUsername(String username) {
		Session se=connDatabase.getDb();
		String HQL="from customer where username=?1";
		Query q=se.createQuery(HQL);
		q.setParameter(1, username);
		List<Object> l=q.list();
		return l;
	}

	public void update(Object o) {
		Session se=connDatabase.getDb();
		Transaction t= se.beginTransaction();
	
		se.merge(o);
		t.commit();
		se.close();
		
	}

	public void deleteObject(Object o) {
		Session se=connDatabase.getDb();
		Transaction t= se.beginTransaction();
		
		se.delete(o);
		t.commit();
		se.close();
		
		
	}

}
