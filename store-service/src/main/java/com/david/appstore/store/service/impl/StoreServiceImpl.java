package com.david.appstore.store.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.david.appstore.store.domain.Store;
import com.david.appstore.store.repository.StoreRepository;
import com.david.appstore.store.service.StoreService;

@Service
public class StoreServiceImpl implements StoreService {

	private StoreRepository storeRepository;
	
	public StoreServiceImpl(StoreRepository storeRepository) {
		this.storeRepository = storeRepository;
	}
	
	@Override
	public Store findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Store> findAll() {
		return this.storeRepository.findAll();
	}

	@Override
	public void save(Store entity) {	
		this.storeRepository.save(entity);
	}

	@Override
	public void deleteById(Long id) {
		this.storeRepository.deleteById(id);
	}

}
