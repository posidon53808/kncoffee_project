package Dao;

import java.util.List;

public interface implPorDao {
	//c
	void add(Object o);
	//r
	List<Object> queryAll();
	Object queryId(int id);
	List<Object> querySum(int start,int end);
	
	//u
	void update(Object o);
	
	//d
	void deleteId(int id);
}
