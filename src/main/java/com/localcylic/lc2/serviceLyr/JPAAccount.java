package com.localcylic.lc2.serviceLyr;

import java.net.URI;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.localcylic.lc2.entities.User;
import com.localcylic.lc2.interfaces.JPAAccountInterface;

import enums.ConditionCategory;
import enums.TypeCategory;

@Service
public class JPAAccount {//that do not extend the interface, but looking up what should be extended i found that it is interfaces that, mmh, that it is interfaces that should be extended
	//i'll also have this as, i am not extednding because, mmh, because of the autowiring and stuff. that will be it hapa
	private final JPAAccountInterface repository;//but, mmh, but remember, we had no like the initial interpretation of repository
	@Autowired
	public JPAAccount(JPAAccountInterface repository) {
		this.repository=repository;
	}
	
	
//	@Override, no overide, juu hata haziko in the interface...
//	key,userName,phoneNumber,email,password,lattitude,longitude
	public void addUser(String verifyKey, String userName, String phoneNumber,
            String email, String password, String latt, String longit) {
		//the, the, mmh, the User in the entities, prev, it the user was defined in the hashmap repository, but we don't have/ use that no more. Also we are not using any repository layer
		User u = new User(null, verifyKey,userName, phoneNumber,//and, and, and, mmh, and on a second, and on a second look, i, i, i, i know why null is there, the whole...then the postresql generates or bring back, or, mmh, or brings back the object with, with, mmh, with the key
//				that, that, mmh, that is why null is there.
//				,that iD, should it be, should mmh, si, mmh, si it is the one, si, si, 
				//si it is the one being generated,iyo, iyo, mmh,iyo null unaona hapo
	            email, password, latt, longit); //we will see, juu this was User Eric so nikuwa nashanga kwa wengi or is u  just a better naming convention
		//izi ni setters, mmh, or getters are they the same, do they work the same? we will ask tomorrow
		//bpp was reduntant with recommending, mmh, with, mmh, with recommending the, what, with recommending the setter hapa
		//it work in my own logic without...getting the it works on my computer vibes but anyway
	        repository.save(u); //dot save? is this a JPA thing?
	       
		
		
	}

	public User verifyUser(String verifyKey) {
		User queriedPhoneNumberObj = repository.findByverifyKey(verifyKey);//waah, that key is a 'JPQL' reserved word, so use another, mmh, so use another identifier, not it say we should define these in the interface, well if i don't come back it worked
		if(queriedPhoneNumberObj==null) return null;
		else return queriedPhoneNumberObj;
	}
		
	

	public User getUser(String Key) {
		// TODO Auto-generated method stub
		return null;

	
}
	
	public List<User> getAllUsers() {
		List<User>  query = repository.findAll();
		return query;
	}


	public User getUserById(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}


