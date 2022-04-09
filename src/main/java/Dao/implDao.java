package Dao;

import java.util.List;

public interface implDao {

	//c
	void add(Object o);
	
	//r
	List<Object> queryAll();
	Object queryId(int id);
	List<Object> queryUser(String username,String password);
	List<Object> queryUsername(String username);
	//u
	void update(Object o);
	
	//d
	void deleteObject(Object o);
}
