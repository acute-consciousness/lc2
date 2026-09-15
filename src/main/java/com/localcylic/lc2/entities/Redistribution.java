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

//what else, mmh, what, mmh, what, mmh, what, mmh, what, mmh, what else, what, mmh, what else was the
//i know i have to ...a foreign key but that is in the fields.. when creating a new field
//anyway, anyway, let us create fields for the listings, iyo jina, mmh, iyo jina listing eeew




@Entity
@Table(name="Items")
public class Redistribution {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long iD;

	
//image, url, mmh, cause..to my head they are stored, to, to, to, to my head they are stored somewhere, mmh, somewhere, mmh, somewhere else
	//so for a url, uri, caps  or not tpye is URI sawa
	private  URI photo;//add*, will be a butch so array, we will ask bpp leter if its, if, mmh, if it is efficientmmh UR I letter i, as a type - ok to that interpretation
	private String description;
	//sasa hapa, mmh, kwa type..juu i want it to be, to be like beds mmh, tables no sub-categorization for, mmh, for right now
	//another array, so Enum...i added unto the type wil be selected from, mmh, from, mmh, from, mmh, from the frontend and it is 'either' Enum or ..another Entity- but another entities is not as 'complicated' or another as it sounds
	
	private String price;
	
	@Enumerated(EnumType.STRING)//that stores "bed" not o. well it has also said i.e MaterialCategory bed '=only' MaterialCategory.anyofthevalue, but that meaning here is different, Ati, Enumerater(ENUMType.S....A
	private TypeCategory Type;//type that we defined of type enum...you know what i a speaking about
	
	
	
	@Enumerated(EnumType.STRING)//so meaning that stores, but i peeped "monetary" ama, ama, ama free, continue Eric, you have got, mmh, you, you, you have got the 'ginst' of it
	private ConditionCategory Condition;

	@Column(name = "listing_date")
	private LocalDate createdAt;
	
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id", nullable= false)
	private User user;//alo, mmh, also a field, mmh, also, also, also, also, also a field
	
	
	 //instantion via reflection
	protected Redistribution() {
		
	}
	
	
	//if i was to set my own columnDefination as bpp directs, check this out  "geometry(Point, 4326)", ni, ni, ni so i can get different, mmh, ni so i can get different column for different location i wanted to say radius but, mmh, bt we don't have that..continuing with my sentence or what
	//lazima it's own location pia, i wanted to borrow from user but i had the utachukua ya user and i wanted to think about na kama user ako hapo but i won't just have it
	//that later.. de/serializationt the json will look as so { "type": "Point", "coordinates": [36.82, -1.29] }   type...Point and the lon and latt..oh just a type, so really this is for the .. to know what, mmh they, they, mmh, they are dealing with
	// I think izo, mmh, i think izo field are, mmh, are enough, we will ...obviously we you have left it any out...yaani eric lazima uandike hadi ii
	public Redistribution( Long iD,URI photo, String description,String price, TypeCategory Type, ConditionCategory Condition,
			LocalDate createdAt, User user){//mmh, endelea tu i feel that i'm getting the interpretation of this
		this.photo=photo;
		this.description=description;
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
