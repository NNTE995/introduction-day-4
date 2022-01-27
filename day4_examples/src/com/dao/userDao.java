package com.dao;

import java.util.*;
import com.customer.*;
import com.customService.*;

public class userDao implements dao<User> {
	private List<User> users = new ArrayList<>();
	
	public userDao() {
		users.add(new User("1", "Noe", "339293939", "noe@gmail.com"));
		users.add(new User("2", "Susana", "394892929", "susana@outlook.com"));
		users.add(new User("3","Diana", "339487444", "diana@gmail.com"));
		users.add(new User("4", "dgdd", "334848484", "dhddhd@ddj.com"));
	}
    
    @Override
    public Optional<User> get(long id) {
        return Optional.ofNullable(users.get((int) id));
    }
    
    @Override
    public List<User> getAll() {
        return users;
    }
    
    @Override
    public void save(User user) {
        users.add(user);
    }
    
    @Override
    public void update(User user, String[] params) {
    	user.setCustomeId(Objects.requireNonNull(params[0], "Id cannot be null"));
        user.setName(Objects.requireNonNull(params[1], "Name cannot be null"));
        user.setMobileNumber(Objects.requireNonNull(params[2], "Mobile Number cannot be null"));
        user.setEmailId(Objects.requireNonNull(params[3], "Email cannot be null"));
        users.add(user);
    }
    
    @Override
    public void delete(User user) {
        users.remove(user);
    }
}