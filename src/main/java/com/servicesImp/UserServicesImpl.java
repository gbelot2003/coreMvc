package com.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.models.Users;
import com.services.UserServices;

@Service
public class UserServicesImpl implements UserServices {

	@Autowired
	UserDao userDao;
	
	public List<Users> list() {
		return userDao.list();
	}

	public boolean delete(Users users) {
		return userDao.delete(users);
	}

	public boolean saveOrUpdate(Users users) {
		return userDao.saveOrUpdate(users);	
	}
}
