package com.david.appstore.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.david.appstore.store.domain.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {

}
