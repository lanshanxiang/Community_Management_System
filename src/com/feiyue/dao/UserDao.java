package com.feiyue.dao;

import java.util.List;

import com.feiyue.entiy.User;

public interface UserDao {
	//增加
	public int add(User user);
    //修改
    public int update(User user);
    //删除
    public int delete(int userId);

}
