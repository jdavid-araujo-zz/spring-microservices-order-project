package com.david.appstore.store.resource;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.david.appstore.store.domain.Store;
import com.david.appstore.store.service.StoreService;

@RestController
@RequestMapping(value = "/stores")
public class StoreResource implements Serializable {

	private static final long serialVersionUID = -2675571550820731241L;
	
	private StoreService storeService;
	
	@Autowired
	public StoreResource(StoreService storeService) {
		this.storeService = storeService;
	}
	
	@ResponseStatus(value = HttpStatus.OK)
	@GetMapping(value = "/{id}")
	public Store findById(@PathVariable(value = "id") Long id) {
		return this.storeService.findById(id);
		
	}
	
	@ResponseStatus(value = HttpStatus.OK)
	@GetMapping()
	public List<Store> findAll() {
		return this.storeService.findAll();
	}
	
	@ResponseStatus(value = HttpStatus.CREATED)
	@PostMapping()
	public void save(@RequestBody Store entity) {
		this.storeService.save(entity);
	}
	
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	@DeleteMapping(value = "{id}")
	public void deleteById(@PathVariable(value = "id") Long id) {
		this.storeService.deleteById(id);
	}
}
