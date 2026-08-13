package com.localcylic.repository;

import java.util.HashMap;
import java.util.Map;

import com.localcylic.lc2.entities.User;


/*now what are we doing here*/
public class StatichashMap {
	public static void tempStorage() {
		Map<String ,User>ds = new HashMap<>();
		User eric = new User("eric","eric","test@email.com", "thisisapassword", 56.823,21.68);
		User maureen = new User("maureen","0711111111","test2@email.com", "thisisapassword", 92.233,32.29);
		User william= new User("william","07222222222","test3@email.com", "thisisapassword", 34.893,65.88);
		ds.put("eric", eric);
		ds.put("maureen", maureen);
		ds.put("willaim", william);
	}

}
