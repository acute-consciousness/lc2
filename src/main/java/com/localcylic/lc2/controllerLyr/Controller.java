package com.localcylic.lc2.controllerLyr;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.ResponseCache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.localcylic.lc2.entities.User;
import com.localcylic.lc2.serviceLyr.Account;

@RestController
//so it is a combination of @Contoller  and @responseBody - the one responsible for to and from JSON/XML con, conversion, for now i have interpretated, i, i, i, i have interpretated that it does thins automatically
//@responseBody
//@,@,@,@reodyponseBody
@RequestMapping("/api/onlytests")//@, at,at, at RequestMapping, defines the base, defines the base URL path for, for, for, for, for, for the controller
//some /api/user...
public class Controller {
//what?, what?, what next from here, i don;t know but i know we at some point have to conect to the service, service, service, service layer
	public final  Account serviceLyrReference;//again, mi sifiriki bona this is a public or a final. This is, this, is a reference, so hold.. and should, and should, and should be the same type, type as, type as the service thing. Yeah, yeah, yeah and i remember you still have to import e.g., the serviceLyr even though you have the autowired thing
	@Autowired
	public Controller(Account serviceLyrReference)//yeah, yeah controller is against the class identifier
	{
		this.serviceLyrReference=serviceLyrReference;
	}
	//mmh, done, done with the Autowired and associates
	//the methods now i guess
	/*	public void addUser(){
//	save need a key of type, a, a, a key of type String, right and a user object, soo call the method,s in, in, in, in the repository
//		it will need to receive arguement
		String key = "eric";
	  User eric = new User("eric","0700000000", "eric@email.com", "pass1", "56.823", "21.68");
		// that use the injected instance, Not static calls
		repository.save(key, eric);
	} 
 */
	@PostMapping//what, what, what, what i need is for the label to only, for the labels to only go through
	public void addObject() {//kwanza withouth arguments, that will be later, i imagine when data comes, comes, mmh, comes, mmh for the client, but yeah we can as param, no, no i don;'t, i don't know what i'm saying
		//but yeah, like we wer procceding, moving the data 'up-top'. Moving, moving, moving, mmmh, moving the data up-top
		String key="0700000000",userName = "eric", phoneNumber = "0700000000", email = "eric@email.com", password = "pass1", lattitude = "56.823", longitude  = "21.68";
		serviceLyrReference.addUser(key,userName,phoneNumber,email,password,lattitude,longitude);
	}

	@GetMapping("/verifyuser")//what do i want to do, what do i want to do, what, mmh, what, what, what, what do i want to do?,// what i'm i to get, the users stuff, so there will be more logic to be placed in the serviceLayer, ama we just establish a connection and say found, and, AND RETURN THE OBJECT
	public ResponseEntity<User> getObject(@RequestParam String key) {// major error - this should not be static, get to understand why this was the reason
		User result = serviceLyrReference.getUser(key);

			return ResponseEntity.ok(result);// what this does is just return the user's, returns the user's object
			// and this should be by, should be by phone number, mmh?
			//so just for tesing, to return the whole, to return the whole object to the client side - sawa
				
	}
	/*
	@tetstet("/verifyuser/test")//what do i want to do, what do i want to do, what, mmh, what, what, what, what do i want to do?,// what i'm i to get, the users stuff, so there will be more logic to be placed in the serviceLayer, ama we just establish a connection and say found, and, AND RETURN THE OBJECT
	public ResponseEntity<User> getObjectTest() {// major error - this should not be static, get to understand why this was the reason
		User result = serviceLyrReference.getUser("0700000000");

			return ResponseEntity.ok(result);// what this does is just return the user's, returns the user's object
			// and this should be by, should be by phone number, mmh?
			//so just for tesing, to return the whole, to return the whole object to the client side - sawa
		 

		
	}
	*/
	

}
