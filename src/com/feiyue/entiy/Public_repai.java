package com.feiyue.entiy;


public class Public_repai {
	   
	 //编号
      private  int pRId;
     
	 //报修问题
      private  String pRQuestion;
     
	 //报修时间
      private  String pRtime;
     
	 //维修状态（未处理0，处理中1，已处理2）
      private  String pRState;
     
	 //处理人
      private  String pRMaintenanceMan;
     
	 //备注
      private  String pRRemark;
     
	 //维修费用
      private  Double pRPrice;
      
      
     
      
      public Public_repai() {
		super();
	}
	public Public_repai(int pRId, String pRQuestion, String pRtime, String pRState, String pRMaintenanceMan,
			String pRRemark, Double pRPrice) {
		super();
		this.pRId = pRId;
		this.pRQuestion = pRQuestion;
		this.pRtime = pRtime;
		this.pRState = pRState;
		this.pRMaintenanceMan = pRMaintenanceMan;
		this.pRRemark = pRRemark;
		this.pRPrice = pRPrice;
	}
	public  int  getPRId(){
      		return  this.pRId;
      };
      public  void  setPRId(int pRId){
      	this.pRId=pRId;
      }  
     
      public  String  getPRQuestion(){
      		return  this.pRQuestion;
      };
      public  void  setPRQuestion(String pRQuestion){
      	this.pRQuestion=pRQuestion;
      }  
     
      public  String  getPRtime(){
      		return  this.pRtime;
      };
      public  void  setPRtime(String pRtime){
      	this.pRtime=pRtime;
      }  
     
      public  String  getPRState(){
      		return  this.pRState;
      };
      public  void  setPRState(String pRState){
      	this.pRState=pRState;
      }  
     
      public  String  getPRMaintenanceMan(){
      		return  this.pRMaintenanceMan;
      };
      public  void  setPRMaintenanceMan(String pRMaintenanceMan){
      	this.pRMaintenanceMan=pRMaintenanceMan;
      }  
     
      public  String  getPRRemark(){
      		return  this.pRRemark;
      };
      public  void  setPRRemark(String pRRemark){
      	this.pRRemark=pRRemark;
      }  
     
      public  Double  getPRPrice(){
      		return  this.pRPrice;
      };
      public  void  setPRPrice(Double pRPrice){
      	this.pRPrice=pRPrice;
      }
	@Override
	public String toString() {
		return "Public_repai [pRId=" + pRId + ", pRQuestion=" + pRQuestion + ", pRtime=" + pRtime + ", pRState="
				+ pRState + ", pRMaintenanceMan=" + pRMaintenanceMan + ", pRRemark=" + pRRemark + ", pRPrice=" + pRPrice
				+ "]";
	}  
     
    
}
