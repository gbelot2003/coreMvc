package com.dao;

import java.util.List;

import com.models.Users;

public interface UserDao {
	
	public List<Users> list();
	public boolean delete(Users users);
	public boolean saveOrUpdate(Users users);
	
}
