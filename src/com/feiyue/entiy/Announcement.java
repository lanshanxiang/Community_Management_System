package com.feiyue.entiy;

public class Announcement {
	   
	 //编号
     private  int annId;
    
	 //标题
     private  String annTitle;
    
	 //通知类型
     private  String annType;
    
	 //通知内容
     private  String annContent;
    
	 //发布日期
     private  String annDate;
    
	 //备注
     private  String remark;
    
     
     
     
     public Announcement() {
		super();
	}
	public Announcement(int annId, String annTitle, String annType, String annContent, String annDate, String remark) {
		super();
		this.annId = annId;
		this.annTitle = annTitle;
		this.annType = annType;
		this.annContent = annContent;
		this.annDate = annDate;
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Announcement [annId=" + annId + ", annTitle=" + annTitle + ", annType=" + annType + ", annContent="
				+ annContent + ", annDate=" + annDate + ", remark=" + remark + "]";
	}
	public  int  getAnnId(){
     		return  this.annId;
     };
     public  void  setAnnId(int annId){
     	this.annId=annId;
     }  
    
     public  String  getAnnTitle(){
     		return  this.annTitle;
     };
     public  void  setAnnTitle(String annTitle){
     	this.annTitle=annTitle;
     }  
    
     public  String  getAnnType(){
     		return  this.annType;
     };
     public  void  setAnnType(String annType){
     	this.annType=annType;
     }  
    
     public  String  getAnnContent(){
     		return  this.annContent;
     };
     public  void  setAnnContent(String annContent){
     	this.annContent=annContent;
     }  
    
     public  String  getAnnDate(){
     		return  this.annDate;
     };
     public  void  setAnnDate(String annDate){
     	this.annDate=annDate;
     }  
    
     public  String  getRemark(){
     		return  this.remark;
     };
     public  void  setRemark(String remark){
     	this.remark=remark;
     }  
    
   
}