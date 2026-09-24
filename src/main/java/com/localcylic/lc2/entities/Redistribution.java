package com.localcylic.lc2.entities;

import java.net.URI;
import java.time.Instant;
//JTS libraru that Hinernate uses to talk to Postgis
import java.time.LocalDate;

import enums.ConditionCategory;
import enums.TypeCategory;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



@Entity
@Table(name="Items")
public class Redistribution {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long iD;

	

	private  URI photo;
	private String description;

	private String price;
	
	@Enumerated(EnumType.STRING)
	private TypeCategory Type;
	
	
	
	@Enumerated(EnumType.STRING)
	private ConditionCategory Condition;

	@Column(name = "listing_date")
	private LocalDate createdAt;
	
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id", nullable= false)
	private User user;
	
	 //instantion via reflection
	protected Redistribution() {
		
	}
	
	
		public Redistribution( Long iD,URI photo, String description,String price, TypeCategory Type, ConditionCategory Condition,
			LocalDate createdAt, User user){
		this.photo=photo;
		this.description=description;
		this.price=price;
		this.Type= Type;
		this.Condition=Condition;
		this.createdAt=createdAt;
		this.user=user;
	}
	//Now to the getters
	public Long getiD() {
		return iD;
	}

	public URI getPhoto() {
		return photo;
	}
	public String getDescription() {
		return description;
	}
	public String getPrice() {
		return price;
	}
	public TypeCategory getType() {
		return Type;
	}
	public ConditionCategory getCategory() {
		return Condition;
	}
	public LocalDate getDate() {
		return createdAt;
	}
	
	
}
