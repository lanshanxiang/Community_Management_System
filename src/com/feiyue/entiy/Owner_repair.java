package com.feiyue.entiy;


public class Owner_repair {
	   
	 //编号
      private  int oRId;
     
	 //报修人姓名
      private  String oRName;
     
	 //楼栋号房号
      private  int oRHouseId;
     
	 //报修问题
      private  String oRQuestion;
     
	 //报修时间
      private  String oRtime;
     
	 //业主期望维修时间
      private  String oROwnerHopeTime;
     
	 //维修状态（未处理0，处理中1，已处理2）
      private  int oRState;
     
	 //维修费用
      private  Double oRPrice;
     
	 //维修员
      private  String oRMaintenanceMan;
     
	 //报修人联系电话
      private  String oRTelePhone;
     
	 //备注
      private  String oRRemark;
      
      
      
     
      
      public Owner_repair() {
		super();
	}
	public Owner_repair(int oRId, String oRName, int oRHouseId, String oRQuestion, String oRtime,
			String oROwnerHopeTime, int oRState, Double oRPrice, String oRMaintenanceMan, String oRTelePhone,
			String oRRemark) {
		super();
		this.oRId = oRId;
		this.oRName = oRName;
		this.oRHouseId = oRHouseId;
		this.oRQuestion = oRQuestion;
		this.oRtime = oRtime;
		this.oROwnerHopeTime = oROwnerHopeTime;
		this.oRState = oRState;
		this.oRPrice = oRPrice;
		this.oRMaintenanceMan = oRMaintenanceMan;
		this.oRTelePhone = oRTelePhone;
		this.oRRemark = oRRemark;
	}
	public  int  getORId(){
      		return  this.oRId;
      };
      public  void  setORId(int oRId){
      	this.oRId=oRId;
      }  
     
      public  String  getORName(){
      		return  this.oRName;
      };
      public  void  setORName(String oRName){
      	this.oRName=oRName;
      }  
     
      public  int  getORHouseId(){
      		return  this.oRHouseId;
      };
      public  void  setORHouseId(int oRHouseId){
      	this.oRHouseId=oRHouseId;
      }  
     
      public  String  getORQuestion(){
      		return  this.oRQuestion;
      };
      public  void  setORQuestion(String oRQuestion){
      	this.oRQuestion=oRQuestion;
      }  
     
      public  String  getORtime(){
      		return  this.oRtime;
      };
      public  void  setORtime(String oRtime){
      	this.oRtime=oRtime;
      }  
     
      public  String  getOROwnerHopeTime(){
      		return  this.oROwnerHopeTime;
      };
      public  void  setOROwnerHopeTime(String oROwnerHopeTime){
      	this.oROwnerHopeTime=oROwnerHopeTime;
      }  
     
      public  int  getORState(){
      		return  this.oRState;
      };
      public  void  setORState(int oRState){
      	this.oRState=oRState;
      }  
     
      public  Double  getORPrice(){
      		return  this.oRPrice;
      };
      public  void  setORPrice(Double oRPrice){
      	this.oRPrice=oRPrice;
      }  
     
      public  String  getORMaintenanceMan(){
      		return  this.oRMaintenanceMan;
      };
      public  void  setORMaintenanceMan(String oRMaintenanceMan){
      	this.oRMaintenanceMan=oRMaintenanceMan;
      }  
     
      public  String  getORTelePhone(){
      		return  this.oRTelePhone;
      };
      public  void  setORTelePhone(String oRTelePhone){
      	this.oRTelePhone=oRTelePhone;
      }  
     
      public  String  getORRemark(){
      		return  this.oRRemark;
      };
      public  void  setORRemark(String oRRemark){
      	this.oRRemark=oRRemark;
      }
	@Override
	public String toString() {
		return "Owner_repair [oRId=" + oRId + ", oRName=" + oRName + ", oRHouseId=" + oRHouseId + ", oRQuestion="
				+ oRQuestion + ", oRtime=" + oRtime + ", oROwnerHopeTime=" + oROwnerHopeTime + ", oRState=" + oRState
				+ ", oRPrice=" + oRPrice + ", oRMaintenanceMan=" + oRMaintenanceMan + ", oRTelePhone=" + oRTelePhone
				+ ", oRRemark=" + oRRemark + "]";
	}  
     
      
}
