package com.localcylic.lc2.interfaces;


import org.springframework.data.jpa.repository.JpaRepository;

import com.localcylic.lc2.entities.User;
// That, mmh, that even though this is an interface and i can't ran away from this fact, public **interface** ... extends ... <- this is what, this is what 'replaced', took over our hashmap repository in, mmh, in the repository
public interface JPAAccountInterface extends JpaRepository <User, Long> {

	User findByverifyKey(String verifyKey);//NOTE: that yes - Spring Data JPA generates a dynamic proxy at startup that implements your entire interface
// what i'm about to do will mean that this will act as an abstract. Walahi, we have, walahi, mmh, walahi we have so much understandind to do. Alafu ndio pia it does recommend the JPA methods which will confuse me with the naming, mmh, with the namings and stuff
/*	void addUser(String key, String userName, String phoneNumber,
            String email, String password, String latt, String longit);

	User verifyUser(String Key);//kubuka zilikuwanga na mashida ya, mmh, mashid ya static and the public keyword being here. I can't, i, mmh, i can't recall how we resolved this. Was it with the annotations like Autowired and stuff, i don't recall
	User getUser(String Key);*/ //THE DO NOT EXTEND THIS INTERFACE IN THE SERVICE LAYER BUT JUST USE IT, WITHI THE IMPORT...NOT IT CONFORMS TO THE NOTHING, NO METHOD 'DEFINATIONS, MMH, NO METHOD DEFINATIONS HERE
// the types ni gani
//	there is a suggestion  bpp is suggesting, but, but will look, but, mmh, but, mmh, but, mmh, but will look at it later
// explanation, mmh, explanation from, mmh, from bpp is that i get save(), find..., delete(), count().. for free, ni for free ama right out the box
	//continuing, plus the custom findByKey that i've been asking for. From my remembrance/ out the top of my head what? ni juu i generated some 'JPA' iD, in the entity? - i think this is still my first layer of misconception, just, mmh, just as it was

	
//JpaRepository from, mmh, JpaRepository in the extends, in, mmh, in the extends is an imported, mmh, is, is, is, is, is an imported thingy
//												for the map examples        izi hapa juu zilikuwa parameter, and we import our entities class, just checked, ju hatukuwa tunaannotate, juu
	// juu hatukuwa tumeannotate the entities 'file' ni basi hutukuwa tunaitumia ama, ama did we, mmh, import the User class, surely, mmh, surely we must have
//	well i can't see the import User and stuff, anyway we continue
	//ok, after extending...
//	so just like that, but it is just the interface, looking at the other AccountInterface, what, what was in there, i guess, definations for the service controller, is, is, mmh, is that it, i had addUser and getUser
	
}
