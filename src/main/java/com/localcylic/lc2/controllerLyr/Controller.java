package com.localcylic.lc2.controllerLyr;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

	@GetMapping("/verifyuser")//what do i want to do, what do i want to do, what, mmh, what, what, what, what do i want to do?,// what i'm i to get, the users stuff, so there will be more logic to be placed in the serviceLayer, ama we just establish a connection and say found, and, AND RETURN THE OBJECT
	public ResponseEntity<User> getObject() {// major error - this should not be static, get to understand why this was the reason
		User result = serviceLyrReference.getUser("eric");
		try {
			//ok, should return what?, shouldyea return an object ans so on and so forth, but we, but we, but we, but we also checked out strings, mmh, string and so on, so 
			//it can also do that but what do we actually want
			if(result==null) {
				return ResponseEntity.notFound().build();
			}
			return ResponseEntity.ok(result);// what this does is just return the user's, returns the user's object
			// and this should be by, should be by phone number, mmh?
			//so just for tesing, to return the whole, to return the whole object to the client side - sawa
		} 
		finally {
			System.out.println("??,  but the address is there but not doing as intended");
		}
		
	}
	

}
