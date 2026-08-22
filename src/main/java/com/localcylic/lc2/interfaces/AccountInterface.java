package com.localcylic.lc2.interfaces;

import com.localcylic.lc2.entities.User;
public interface AccountInterface {
	 void addUser(String key,String userName, String phoneNumber, String email, String password, String lattitude, String longitude));
	User getUser(String key);
}
