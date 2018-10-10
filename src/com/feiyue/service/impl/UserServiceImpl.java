package com.feiyue.service.impl;

import com.feiyue.dao.UserDao;
import com.feiyue.dao.impl.UserDaoImpl;
import com.feiyue.entiy.User;
import com.feiyue.service.UserService;

public class UserServiceImpl implements UserService{
	UserDao ud=new UserDaoImpl();

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return ud.add(user);
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return ud.update(user);
	}

	@Override
	public int deleteUser(int userId) {
		// TODO Auto-generated method stub
		return ud.delete(userId);
	}

}
