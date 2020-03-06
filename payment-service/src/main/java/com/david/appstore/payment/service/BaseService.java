package com.david.appstore.payment.service;

import java.util.List;

public interface BaseService <T, ID> {
	
	T findById(ID id);
	
	List<T> findAll();
	
	void save(T entity);
	
	void deleteById(ID id);
}
