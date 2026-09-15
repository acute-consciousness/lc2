package com.localcylic.lc2.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.localcylic.lc2.entities.Redistribution;

public interface JPAItemsInterface extends JpaRepository<Redistribution, Long> {//so a long, i wonder if its for, mmh, i wonder if it is from the user 
	
}

