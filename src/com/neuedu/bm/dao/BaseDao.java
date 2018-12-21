package com.neuedu.bm.dao;

import java.util.List;

public interface BaseDao<T> {
	
	T findById(Integer id);
	
	T findOne (T condition);
	
	List<T> findList (T condition);
	
	List<T> findAll();
	
	Integer count();
	
	void insert(T t);
	
	void update(T t);
	
	void delete(T t);
	
	void delete(Integer id);
	
}
