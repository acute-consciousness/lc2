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

	/*so, so this is me much later - you know, you know, you know what i mean
	 * anyway the issue is, bpp, claude to be precise says that, says that ... a classic json problem being, being, being that
	 *  da, da, da, the a commandlinerunner test confirms the objects are there, but the same rest mapping.. methods don't show, in the endpoint
	 *  ...
	 *  the solution that has led me here is something to do with getters, that i n my accounts class, in here
	 *  that, that, that the fields, that, that the fields should be public or somthing. then i was like
	 *  but the toString method is public. Then now i remember that toString, mmh, doesn't work
	 *  in the whole compass of deserialization, Doesn't, mmmh, doesn't work in the whole deserialization 'encompasses/ing
	 *  that i need the fields to be somehow, to, to, to, to be somehow visible for the de/serialization, seriaalization stuff.
	 *  
	 *  and the solution is for that, i have seen is the individual, now i can call, now, mmh, now i can call them gettes
	 *  that i had, that i had,, that i had earlier done. By the way, why did i do them, why, mmh, why did i have them
	 *  for individual/ specific field, field, field, field, returns. Mimi, mimi, mimi, mimi, mimi nilikuwa nimezifanya aje?
	 *  just return username..., not casting, i asume ingeleta tu the @... but serialization, i think, i think, i think, i think, i think, 
	 *  i think can, can, can handle that. So checking this out, i think i, i, i, i will just, i, i will just coment these function out
	 *  it is still empty, or is it to do ith th naming
	 *  the, getters, getters must start with, with, with, with the 'prefix' get or fetch that i didn't, or fetc that i haven't tried out, alafu, alafu is for  booleans
	 *  alafu, alafu, alafu if, alafu if for booleans, sawa to the what, to the  textinput stuff
	 *  */
	//logic down here is that i can cast individual records(alone). the above long comment explain the usage of them now
	//
	public String getUsername() {
		return userName;
	}
	public String getPhonenumber() {
		return phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public String getLatitude() {
		return lattitude;
	}
	public String getLongititude() {
		return longitude;
	}
	
	// changed the position of the  method down below, because bpp had it that wa. i haven't yet thought hwow it would or not affect things
	public String toString() {
		return "\n"+
				"user name: "+userName + '\n' +
				 "phone number: "+phoneNumber + '\n' +
				 "email: "+email+ '\n' +
				 "location: "+ lattitude + " , " +longitude;
	}
	
	//and this is just a model, but in saying just it's above just a 'bare' interface
	//but how do the later defined methods work if there isn't a data structure here. Na tumesema just a model.
	//a ll ingekuwa, UserModel identifier which will still be the 'first item'  then = new type ()...
	

}
