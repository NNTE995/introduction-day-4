package com.dao;

import java.util.*;
import com.customer.*;
import com.customService.*;

public class userApp {
	private static dao<User> userDao;
	
	public static void main(String[] args) {
		userDao = new userDao();
		
		User user1 = getUser(2);
		System.out.println(user1);
		userDao.update(user1, new String[]{"3","Regina", "38484848", "regine@hotmail.com"});
		
		User user2 = getUser(3);
		userDao.delete(user2);
		userDao.save(new User("4","Julia", "39495093","julia@gmail.com"));
		
		userDao.getAll().forEach(user -> System.out.println(user.getCustomeId()+" - "+user.getName()+" - "+user.getMobileNumber()+" - "+user.getEmailId()));
	}
	
	private static User getUser(long id) {
		Optional<User> user = userDao.get(id);
		return user.orElseGet(() -> new User("no-id", "non-name user", "no-mobile number","no-email"));
	}
}