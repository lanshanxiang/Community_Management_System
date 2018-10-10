package com.feiyue.entiy;


public class Payment {
	   
	 //自动编号
      private  int fareId;
     
	 //户主姓名
      private  String yzName = "";
     
	 //业主地址
      private  String houseAddress;
     
	 //抄表人
      private  String writerPeople;
     
	 //水吨数
      private  Double writeMete;
     
	 //水费
      private  Double writerFare;
     
	 //度数
      private  Double degree;
     
	 //电费
      private  Double powerRate;
     
	 //煤气立方
      private  Double gasMete;
     
	 //煤气费
      private  Double gasFare;
     
	 // 是否有车(1表示有，0表示没有)
      private  int isCar;
     
	 //停车费
      private  int parkFare;
     
	 //管理费
      private  Double managerFare;
     
	 //缴费时间
      private  String fareTime;
     
	 //本月小计
      private  String monthcount;
     
	 //有无往期欠费(0无欠费，1欠费)
      private  Long isPass;
     
	 //往期欠费金额
      private  Double pass;
     
	 //本月总金额
      private  Double countFare;
     
	 //通知时间
      private  String noticeTime;
     
	 //缴费状态（0表示未缴费，1表示已缴费）
      private  int status;
     
	 //收费人
      private  String toller;
     
	 //备注
      private  String paymentRemark;
      
      
     
      
      public Payment() {
		super();
	}
	public Payment(int fareId, String yzName, String houseAddress, String writerPeople, Double writeMete,
			Double writerFare, Double degree, Double powerRate, Double gasMete, Double gasFare, int isCar, int parkFare,
			Double managerFare, String fareTime, String monthcount, Long isPass, Double pass, Double countFare,
			String noticeTime, int status, String toller, String paymentRemark) {
		super();
		this.fareId = fareId;
		this.yzName = yzName;
		this.houseAddress = houseAddress;
		this.writerPeople = writerPeople;
		this.writeMete = writeMete;
		this.writerFare = writerFare;
		this.degree = degree;
		this.powerRate = powerRate;
		this.gasMete = gasMete;
		this.gasFare = gasFare;
		this.isCar = isCar;
		this.parkFare = parkFare;
		this.managerFare = managerFare;
		this.fareTime = fareTime;
		this.monthcount = monthcount;
		this.isPass = isPass;
		this.pass = pass;
		this.countFare = countFare;
		this.noticeTime = noticeTime;
		this.status = status;
		this.toller = toller;
		this.paymentRemark = paymentRemark;
	}
	public  int  getFareId(){
      		return  this.fareId;
      };
      public  void  setFareId(int fareId){
      	this.fareId=fareId;
      }  
     
      public  String  getYzName(){
      		return  this.yzName;
      };
      public  void  setYzName(String yzName){
      	this.yzName=yzName;
      }  
     
      public  String  getHouseAddress(){
      		return  this.houseAddress;
      };
      public  void  setHouseAddress(String houseAddress){
      	this.houseAddress=houseAddress;
      }  
     
      public  String  getWriterPeople(){
      		return  this.writerPeople;
      };
      public  void  setWriterPeople(String writerPeople){
      	this.writerPeople=writerPeople;
      }  
     
      public  Double  getWriteMete(){
      		return  this.writeMete;
      };
      public  void  setWriteMete(Double writeMete){
      	this.writeMete=writeMete;
      }  
     
      public  Double  getWriterFare(){
      		return  this.writerFare;
      };
      public  void  setWriterFare(Double writerFare){
      	this.writerFare=writerFare;
      }  
     
      public  Double  getDegree(){
      		return  this.degree;
      };
      public  void  setDegree(Double degree){
      	this.degree=degree;
      }  
     
      public  Double  getPowerRate(){
      		return  this.powerRate;
      };
      public  void  setPowerRate(Double powerRate){
      	this.powerRate=powerRate;
      }  
     
      public  Double  getGasMete(){
      		return  this.gasMete;
      };
      public  void  setGasMete(Double gasMete){
      	this.gasMete=gasMete;
      }  
     
      public  Double  getGasFare(){
      		return  this.gasFare;
      };
      public  void  setGasFare(Double gasFare){
      	this.gasFare=gasFare;
      }  
     
      public  int  getIsCar(){
      		return  this.isCar;
      };
      public  void  setIsCar(int isCar){
      	this.isCar=isCar;
      }  
     
      public  int  getParkFare(){
      		return  this.parkFare;
      };
      public  void  setParkFare(int parkFare){
      	this.parkFare=parkFare;
      }  
     
      public  Double  getManagerFare(){
      		return  this.managerFare;
      };
      public  void  setManagerFare(Double managerFare){
      	this.managerFare=managerFare;
      }  
     
      public  String  getFareTime(){
      		return  this.fareTime;
      };
      public  void  setFareTime(String fareTime){
      	this.fareTime=fareTime;
      }  
     
      public  String  getMonthcount(){
      		return  this.monthcount;
      };
      public  void  setMonthcount(String monthcount){
      	this.monthcount=monthcount;
      }  
     
      public  Long  getIsPass(){
      		return  this.isPass;
      };
      public  void  setIsPass(Long isPass){
      	this.isPass=isPass;
      }  
     
      public  Double  getPass(){
      		return  this.pass;
      };
      public  void  setPass(Double pass){
      	this.pass=pass;
      }  
     
      public  Double  getCountFare(){
      		return  this.countFare;
      };
      public  void  setCountFare(Double countFare){
      	this.countFare=countFare;
      }  
     
      public  String  getNoticeTime(){
      		return  this.noticeTime;
      };
      public  void  setNoticeTime(String noticeTime){
      	this.noticeTime=noticeTime;
      }  
     
      public  int  getStatus(){
      		return  this.status;
      };
      public  void  setStatus(int status){
      	this.status=status;
      }  
     
      public  String  getToller(){
      		return  this.toller;
      };
      public  void  setToller(String toller){
      	this.toller=toller;
      }  
     
      public  String  getPaymentRemark(){
      		return  this.paymentRemark;
      };
      public  void  setPaymentRemark(String paymentRemark){
      	this.paymentRemark=paymentRemark;
      }
	@Override
	public String toString() {
		return "Payment [fareId=" + fareId + ", yzName=" + yzName + ", houseAddress=" + houseAddress + ", writerPeople="
				+ writerPeople + ", writeMete=" + writeMete + ", writerFare=" + writerFare + ", degree=" + degree
				+ ", powerRate=" + powerRate + ", gasMete=" + gasMete + ", gasFare=" + gasFare + ", isCar=" + isCar
				+ ", parkFare=" + parkFare + ", managerFare=" + managerFare + ", fareTime=" + fareTime + ", monthcount="
				+ monthcount + ", isPass=" + isPass + ", pass=" + pass + ", countFare=" + countFare + ", noticeTime="
				+ noticeTime + ", status=" + status + ", toller=" + toller + ", paymentRemark=" + paymentRemark + "]";
	}  
     
    
}
