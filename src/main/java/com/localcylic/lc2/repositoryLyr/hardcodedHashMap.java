package com.localcylic.lc2.repositoryLyr;

import java.util.HashMap;
import java.util.Map;

import com.localcylic.lc2.entities.User;
/* so, try and print it out
 * what should the serive layer do
 * remember we are moving from backwards
   Repository layer  <- Service layer  <- Controller layer  <- client app
   							bpp says								api end points	. phonenumber
   							authentication														. passoword
   							but here for
   							now it adding the
   							things
   							that will 
   							be pushed to the
   							repository layer		
   	so no
   	hard coding 
   	hapa for now
   	let us push 
   	this data
   	to the service layer
   	let us start 
   	by the .put thing															
   */
public class hardcodedHashMap {
	public static void tempStorage() {
		Map<String ,User>ds = new HashMap<>();
		 User eric = new User("eric","0700000000", "eric@email.com", "pass1", "56.823", "21.68");
	     User maureen = new User("maureen","0711111111", "maureen@email.com", "pass2", "57.000", "22.000");
	     User william = new User("william","0722222222", "william@email.com", "pass3", "58.123", "23.456");
	     //should be in functions that do 'return' something. I guess that is what is mean't by don't ds.get directly
		ds.put("eric", eric);
		ds.put("maureen", maureen);
		ds.put("william", william);
		ds.get("eric");
		ds.remove("eric");
		ds.isEmpty();
		ds.replace(null, william);
		ds.size();
	}
}
