package com.localcylic.lc2.repositoryLyr;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

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
   	repository layer, first tutengeneze the methods, yeah, yeah, yeah, yeah, the methods			
   	now what, to the service layer, with, with, with the initialization, with the, with the, with the initialization of the records										
   */
@Repository
public class HardcodedHashMap {
	private Map<String ,User>ds = new HashMap<>();//new never in the

	public void save(String key, User identifier) {
		ds.put(key,identifier);		
	}
	
    public User retrieve(String key) {
		return ds.get(key);
	}
	
	 public void delete() { //ssss..does it really delete
		User removed = ds.remove("eric");
		System.out.println(removed+"was removed!");
	}
	
	public void noObjects() { //not implemented
		ds.isEmpty();
		
	}
	
	public  void edit() {//not implemented
//		ds.replace();
	}
	
	public void howMany() {//not implemented
		ds.size();
	}
}
