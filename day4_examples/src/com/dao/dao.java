package com.dao;

import java.util.Optional;
import java.util.*;
import com.customer.*;
import com.customService.*;


public interface dao <T> {
	Optional<T> get(long id);
	List<T> getAll();
    
    void save(T t);
    void update(T t, String[] params);
    void delete(T t);
}