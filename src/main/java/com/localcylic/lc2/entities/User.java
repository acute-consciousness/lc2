package com.localcylic.lc2.entities;

import java.util.HashMap;
import java.util.Map;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*so, it just like how we did it for linked list, the problem is that i thought that 
 * the whole syntax was attributed to the linked list structure
 * so i need a phonenumber, email - can be used later, password, location - later...
 * nitoka uko chini and i wrote, mmh, and, mmh, and i'm in the process of writing
 * of 'implementing, much like 'using' mmh, more, more, more, more mmh, 
 * more like using a database
 * nimecheki fist we what, anotate..@Entity*/
@Entity
//then what?, mmh, can i remember? i really can't remember
//ni the table, nimeangalia
@Table(name = "users")

public class User {//yea, a class, in our case, a User class was still created much after...
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String verifyKey;// that if i want the database column to be called 'key', that just add @Column, nimejua what the thing is for. The @Column and how it works, meaning that @GeneratedValue...takes the long iD when generated. We know, mmh, we know how it comes back when the object, mmh, when the object is retrieved

	private String userName;

	private String phoneNumber; //can't really remember why it was advised that it should be a string

	private String email;
	private String password; // should be hashed, and i didn't check how this is done. The comment is never store them as plain text. So hashing in the storage

	private String lattitude; // don't really know why they, why they are seperated as so. Double as... decimals

	private String longitude;
	
	//that, nakumbuka nikiona jina reflection, bpp says, but i have tried to conceptualize, // required by Hibernate/JPA for entity instantiation via reflection
	protected User() {
	}
	
	public User (Long id, String verifyKey,String userName,String phoneNumber, String email, String password, String lattitude, String longitude){ //and what did the constructor do, or what was my interpretation of it, so it can be accessed outside a scope. This is how i interpretated it
		this.id=id;
		this.verifyKey=verifyKey;
		this.userName=userName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
		this.lattitude = lattitude;
		this.longitude = longitude;
	}
	//getters
	public Long getId() {
		return id;
	}
	public String getKey() {
		return verifyKey;
	}
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
				"iD: "+iD + '\n' +
				"user name: "+userName + '\n' +
				 "phone number: "+phoneNumber + '\n' +
				 "email: "+email+ '\n' +
				 "location: "+ lattitude + " , " +longitude;
	}
	
	//and this is just a model, but in saying just it's above just a 'bare' interface
	//but how do the later defined methods work if there isn't a data structure here. Na tumesema just a model.
	//a ll ingekuwa, UserModel identifier which will still be the 'first item'  then = new type ()...
	

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
	
	/*now, mmh, now things have changed, i'm introducing, mmh, i'm, mmh, i'm mmh,
	 * i'm introducting, mmh, i'm, mmmh, i'm mmh, i'm , mmmh, i'm introducing postgresql
	 * and in terms of code, this is my first edit
	 * juu, we did the what, creating a user and a passowrd, i actually don't know what that was
	 * alafu, alafu, mmh, alafu, i've, i've, i've what, i have what Eric, i have forgotten its thing
	 * somethingwhen, i actually, mmh, i'm actually annoyed because i wanted to, because, mmh
	 * because i wanted to bpp what it does, next day, mmh, next, mmh, next day
	 * just to engage with myself, i had even, mmh, i had even forgotten the entitie 'file' that i had
	 * not really forgotten it but, but, mmh, but i never thought i had created it for the repository
	 * but i remember that, that what, there was a difference between an abstract and an entity
	 * yeah, the whole... that an astract will not be enough, lakini hapa naona tu functions
	 * not a class with, mmh, not a class with a constructor, mmh
	 * not, mmh, not a class with a constructor, mmh, not a class with a constructor and stuff, ooh,
	 * ziko uku juu then we had the repository layer where we implementesd the getter, oh the use of the
	 * word get..in the methods, but, mmh, but anyway, it has been, it, mmh, it has been long
	 * since, since what, it has been long since i was uku - yaani, yaani this package, mmh,
	 * yaani this package and stuff. Acha, acha turuke uko juu
	 * */

