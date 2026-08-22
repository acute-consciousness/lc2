package com.localcylic.lc2.serviceLyr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.localcylic.lc2.entities.User;
import com.localcylic.lc2.interfaces.AccountInterface;
import com.localcylic.lc2.repositoryLyr.HardcodedHashMap;

@Service
public class Account implements AccountInterface{
	// and the individual fields concern, ama the casting of each individual field will help this?
//	static User eric = new User("eric","0700000000", "eric@email.com", "pass1", "56.823", "21.68");
//public static void save() {
//	ds.put("eric",eric);		
	
//}
	private final HardcodedHashMap repository;// That, that, that hold the reference
	// that ati, construcctor, that ati constructor injection: Spring automatically, sprin, sprin, spring automatically passes the Repository here
	
	@Autowired
	public Account(HardcodedHashMap repository) {
		this.repository=repository;
	}
	
	//		serviceLyrReference.addUser(key,username,email,password,lattitude,longitude);
	@Override
	public void addUser(String key,String userName, String phoneNumber, String email, String password, String lattitude, String longitude){
//	save need a key of type, a, a, a key of type String, right and a user object, soo call the method,s in, in, in, in the repository
//		it will need to receive arguement
//			serviceLyrReference.addUser(key,userName,phoneNumber,email,password,lattitude,longitude);
	  User eric = new User(userName,phoneNumber,email,password,lattitude,longitude);
		// that use the injected instance, Not static calls
		repository.save(key, eric);
	}
	

	@Override
	public  User getUser(String key) {
		User result = repository.retrieve(key);
		if(result==null) {
			return null;
		}else return result;
	}


}
