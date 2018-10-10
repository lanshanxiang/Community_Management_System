package com.feiyue.entiy;


public class User {
	   
	 //编号
      private  int userId;
     
	 //昵称
      private  String userName;
     
	 //密码
      private  String userPwd;
     
	 //真实姓名
      private  String userTrueName;
     
	 //性别
      private  String userSex;
     
	 //联系电话
      private  String userTelephone;
     
	 //邮箱
      private  String userEmail;
     
	 //地址
      private  String userAddress;
     
	 //照片
      private  String userPhoto;
     
	 //权限类型(0管理员 1 保安 2 保洁）
      private  int userType;
     
	 //备注
      private  String userRemark;
      
      
     
      
      public User() {
		super();
	}
	public User(int userId, String userName, String userPwd, String userTrueName, String userSex, String userTelephone,
			String userEmail, String userAddress, String userPhoto, int userType, String userRemark) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
		this.userTrueName = userTrueName;
		this.userSex = userSex;
		this.userTelephone = userTelephone;
		this.userEmail = userEmail;
		this.userAddress = userAddress;
		this.userPhoto = userPhoto;
		this.userType = userType;
		this.userRemark = userRemark;
	}
	public  int  getUserId(){
      		return  this.userId;
      };
      public  void  setUserId(int userId){
      	this.userId=userId;
      }  
     
      public  String  getUserName(){
      		return  this.userName;
      };
      public  void  setUserName(String userName){
      	this.userName=userName;
      }  
     
      public  String  getUserPwd(){
      		return  this.userPwd;
      };
      public  void  setUserPwd(String userPwd){
      	this.userPwd=userPwd;
      }  
     
      public  String  getUserTrueName(){
      		return  this.userTrueName;
      };
      public  void  setUserTrueName(String userTrueName){
      	this.userTrueName=userTrueName;
      }  
     
      public  String  getUserSex(){
      		return  this.userSex;
      };
      public  void  setUserSex(String userSex){
      	this.userSex=userSex;
      }  
     
      public  String  getUserTelephone(){
      		return  this.userTelephone;
      };
      public  void  setUserTelephone(String userTelephone){
      	this.userTelephone=userTelephone;
      }  
     
      public  String  getUserEmail(){
      		return  this.userEmail;
      };
      public  void  setUserEmail(String userEmail){
      	this.userEmail=userEmail;
      }  
     
      public  String  getUserAddress(){
      		return  this.userAddress;
      };
      public  void  setUserAddress(String userAddress){
      	this.userAddress=userAddress;
      }  
     
      public  String  getUserPhoto(){
      		return  this.userPhoto;
      };
      public  void  setUserPhoto(String userPhoto){
      	this.userPhoto=userPhoto;
      }  
     
      public  int  getUserType(){
      		return  this.userType;
      };
      public  void  setUserType(int userType){
      	this.userType=userType;
      }  
     
      public  String  getUserRemark(){
      		return  this.userRemark;
      };
      public  void  setUserRemark(String userRemark){
      	this.userRemark=userRemark;
      }
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPwd=" + userPwd + ", userTrueName="
				+ userTrueName + ", userSex=" + userSex + ", userTelephone=" + userTelephone + ", userEmail="
				+ userEmail + ", userAddress=" + userAddress + ", userPhoto=" + userPhoto + ", userType=" + userType
				+ ", userRemark=" + userRemark + "]";
	}  
     
    
}
