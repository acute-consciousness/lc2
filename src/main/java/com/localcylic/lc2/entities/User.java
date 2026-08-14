package com.localcylic.lc2.entities;

import java.util.HashMap;
import java.util.Map;

import com.localcylic.repository.User;

/*so, it just like how we did it for linked list, the problem is that i thought that 
 * the whole syntax was attributed to the linked list structure
 * so i need a phonenumber, email - can be used later, password, location - later...*/
public class User {
	private String userName;
	private String phoneNumber; //can't really remember why it was advised that it should be a string
	private String email;
	private String password; // should be hashed, and i didn't check how this is done. The comment is never store them as plain text. So hashing in the storage
	private String lattitude; // don't really know why they, why they are seperated as so. Double as... decimals
	private String longitude;
	public User (String userName,String phoneNumber, String email, String password, String lattitude, String longitude){ //and what did the constructor do, or what was my interpretation of it, so it can be accessed outside a scope. This is how i interpretated it
		this.userName=userName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
		this.lattitude = lattitude;
		this.longitude = longitude;
	}
	public String returnUsername() {
		return userName;
	}
	public String returnPhonenumber() {
		return phoneNumber;
	}
	public String returnEmail() {
		return email;
	}
	public String returnLatitude() {
		return lattitude;
	}
	public String returnLongititude() {
		return longitude;
	}

	
	
	//and this is just a model, but in saying just it's above just a 'bare' interface
	//but how do the later defined methods work if there isn't a data structure here. Na tumesema just a model.
	//a ll ingekuwa, UserModel identifier which will still be the 'first item'  then = new type ()...
	

}
