package com.feiyue.dao.impl;

import com.feiyue.dao.UserDao;
import com.feiyue.entiy.User;
import com.feiyue.util.DBUtil;

public class UserDaoImpl implements UserDao{
    //增加
	@Override
	public int add(User user) {
		// TODO Auto-generated method stub
		return DBUtil.execute("insert into user  (userName,userPwd,userTrueName,userSex,userTelephone,userEmail,userAddress,userPhoto,userType,userRemark ) values (?,?,?,?,?,?,?,?,?,?,? )",
		        user.getUserName(),user.getUserPwd(),user.getUserTrueName(),user.getUserSex(),user.getUserTelephone(),user.getUserEmail(),user.getUserAddress(),user.getUserPhoto(),user.getUserType(),user.getUserRemark());
	}
    //修改
	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		return DBUtil.execute("UPDATE  user  SET userName=?,userPwd=?,userTrueName=?,userSex=?,userTelephone=?,userEmail=?,userAddress=?,userPhoto=?,userType=?,userRemark=?"
		        +" where userId=?",
		            user.getUserName(),user.getUserPwd(),user.getUserTrueName(),user.getUserSex(),user.getUserTelephone(),user.getUserEmail(),user.getUserAddress(),user.getUserPhoto(),user.getUserType(),user.getUserRemark(),
		            user.getUserId());
	}
    //删除
	@Override
	public int delete(int userId) {
		// TODO Auto-generated method stub
		return DBUtil.execute("DELETE from user where userId=?",userId);
	}

}
