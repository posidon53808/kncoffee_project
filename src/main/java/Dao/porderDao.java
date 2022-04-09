package Dao;

import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.query.Query;

import Model.porder;

import org.hibernate.Session;

public class porderDao implements implPorDao {

	public void add(Object o) {
		Session se=connDatabase.getDb();
		Transaction t=se.beginTransaction();
		
		t.commit();
		se.save(o);
		se.close();
		
		
	}

	public List<Object> queryAll() {
		Session se=connDatabase.getDb();
		String HQL="form customer";
		Query q=se.createQuery(HQL);
		List<Object> l=q.list();
		
		return l;
	}

	public Object queryId(int id) {
		Session se=connDatabase.getDb();
		porder p=se.get(porder.class, id);
		return p;
	}

	public List<Object> querySum(int start, int end) {
		Session se=connDatabase.getDb();
		String HQL="from porder as p where p.Sum>=?1 and p.Sum<=?2";
		Query q=se.createQuery(HQL);
		q.setParameter(1, start);
		q.setParameter(2, end);
		List<Object> l=q.list();
		
		return l;
	}

	public void update(Object o) {
		Session se=connDatabase.getDb();
		Transaction t=se.beginTransaction();
		
		t.commit();
		se.update(o);
		se.close();
		
	}

	public void deleteId(int id) {
		Session se=connDatabase.getDb();
		porder p=se.get(porder.class, id);
		Transaction t=se.beginTransaction();
		
		t.commit();
		se.delete(p);
		se.close();
		
	}

}
