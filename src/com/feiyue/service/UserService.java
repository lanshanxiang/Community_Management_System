package com.feiyue.service;

import com.feiyue.entiy.User;

public interface UserService {
	   //增加
		public int addUser(User user);
	    //修改
	    public int updateUser(User user);
	    //删除
	    public int deleteUser(int userId);
}
