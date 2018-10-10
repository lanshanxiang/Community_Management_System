package com.feiyue.entiy;

public class Houseinfo {
	   
	 //自动编号
     private  int houseId;
    
	 //楼号
     private  int houseLhao;
    
	 //房号
     private  int houseFhao;
    
	 //房屋面积
     private  Double houseAreas;
    
	 //房屋类型
     private  String houseType;
    
	 //状态（0为未售出、1已售出）
     private  int houseStatus;
    
	 //房主
     private  String houseHold;
    
	 //出售时间
     private  String houseSoldTime;
    
	 //备注
     private  String houseRemark;
    
     
     
     
     public Houseinfo() {
		super();
	}
	public Houseinfo(int houseId, int houseLhao, int houseFhao, Double houseAreas, String houseType, int houseStatus,
			String houseHold, String houseSoldTime, String houseRemark) {
		super();
		this.houseId = houseId;
		this.houseLhao = houseLhao;
		this.houseFhao = houseFhao;
		this.houseAreas = houseAreas;
		this.houseType = houseType;
		this.houseStatus = houseStatus;
		this.houseHold = houseHold;
		this.houseSoldTime = houseSoldTime;
		this.houseRemark = houseRemark;
	}
	public  int  getHouseId(){
     		return  this.houseId;
     };
     public  void  setHouseId(int houseId){
     	this.houseId=houseId;
     }  
    
     public  int  getHouseLhao(){
     		return  this.houseLhao;
     };
     public  void  setHouseLhao(int houseLhao){
     	this.houseLhao=houseLhao;
     }  
    
     public  int  getHouseFhao(){
     		return  this.houseFhao;
     };
     public  void  setHouseFhao(int houseFhao){
     	this.houseFhao=houseFhao;
     }  
    
     public  Double  getHouseAreas(){
     		return  this.houseAreas;
     };
     public  void  setHouseAreas(Double houseAreas){
     	this.houseAreas=houseAreas;
     }  
    
     public  String  getHouseType(){
     		return  this.houseType;
     };
     public  void  setHouseType(String houseType){
     	this.houseType=houseType;
     }  
    
     public  int  getHouseStatus(){
     		return  this.houseStatus;
     };
     public  void  setHouseStatus(int houseStatus){
     	this.houseStatus=houseStatus;
     }  
    
     public  String  getHouseHold(){
     		return  this.houseHold;
     };
     public  void  setHouseHold(String houseHold){
     	this.houseHold=houseHold;
     }  
    
     public  String  getHouseSoldTime(){
     		return  this.houseSoldTime;
     };
     public  void  setHouseSoldTime(String houseSoldTime){
     	this.houseSoldTime=houseSoldTime;
     }  
    
     public  String  getHouseRemark(){
     		return  this.houseRemark;
     };
     public  void  setHouseRemark(String houseRemark){
     	this.houseRemark=houseRemark;
     }
	@Override
	public String toString() {
		return "Houseinfo [houseId=" + houseId + ", houseLhao=" + houseLhao + ", houseFhao=" + houseFhao
				+ ", houseAreas=" + houseAreas + ", houseType=" + houseType + ", houseStatus=" + houseStatus
				+ ", houseHold=" + houseHold + ", houseSoldTime=" + houseSoldTime + ", houseRemark=" + houseRemark
				+ "]";
	}  
    
   
}
