package com.localcylic.lc2.serviceLyr;

import java.net.URI;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.localcylic.lc2.entities.Redistribution;
import com.localcylic.lc2.entities.User;
import com.localcylic.lc2.interfaces.JPAItemsInterface;

import enums.ConditionCategory;
import enums.TypeCategory;


@Service
public class JPAItems {
	private final JPAItemsInterface repository;
	@Autowired
	public JPAItems( JPAItemsInterface repository) {
		this.repository=repository;
	}
	
	public void addItem(URI photo, String description,String price, TypeCategory Type, ConditionCategory Condition,
			LocalDate createdAt, User user) {
		Redistribution u  = new Redistribution (null,photo, description, price, Type, Condition, createdAt, user );
		repository.save(u);
		
	}
	public List<Redistribution> getItems() {
		return repository.findAll();
	}
	public Optional<Redistribution> getItemsByUser(Long userId) {// \o/??
		return repository.findById(userId);
	}



}
