package com.neuedu.bm.dao;

import java.util.List;

public class DaoAdapter<T> implements BaseDao<T> {

	@Override
	public T findOne(T condition) {
		return null;
	}

	@Override
	public List<T> findList(T condition) {
		return null;
	}

	@Override
	public List<T> findAll() {
		return null;
	}

	@Override
	public Integer count() {
		return null;
	}

	@Override
	public void insert(T t) {
	}

	@Override
	public void update(T t) {
	}

	@Override
	public void delete(T t) {
	}

	@Override
	public void delete(Integer id) {
	}

	@Override
	public T findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
