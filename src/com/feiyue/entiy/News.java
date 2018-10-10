package com.feiyue.entiy;

public class News {
	   
	 //新闻编号
     private  int newsId;
    
	 //标题
     private  String newsTitle;
    
	 //新闻类型
     private  String newType;
    
	 //新闻内容
     private  String newsContent;
    
	 //发布日期
     private  String newsDate;
    
	 //阅读次数
     private  int newsRead;
    
	 //创建者
     private  String newsCreater;
    
	 //备注
     private  String newsRemark;
    
     
     
     
     public News() {
		super();
	}
	public News(int newsId, String newsTitle, String newType, String newsContent, String newsDate, int newsRead,
			String newsCreater, String newsRemark) {
		super();
		this.newsId = newsId;
		this.newsTitle = newsTitle;
		this.newType = newType;
		this.newsContent = newsContent;
		this.newsDate = newsDate;
		this.newsRead = newsRead;
		this.newsCreater = newsCreater;
		this.newsRemark = newsRemark;
	}
	public  int  getNewsId(){
     		return  this.newsId;
     };
     public  void  setNewsId(int newsId){
     	this.newsId=newsId;
     }  
    
     public  String  getNewsTitle(){
     		return  this.newsTitle;
     };
     public  void  setNewsTitle(String newsTitle){
     	this.newsTitle=newsTitle;
     }  
    
     public  String  getNewType(){
     		return  this.newType;
     };
     public  void  setNewType(String newType){
     	this.newType=newType;
     }  
    
     public  String  getNewsContent(){
     		return  this.newsContent;
     };
     public  void  setNewsContent(String newsContent){
     	this.newsContent=newsContent;
     }  
    
     public  String  getNewsDate(){
     		return  this.newsDate;
     };
     public  void  setNewsDate(String newsDate){
     	this.newsDate=newsDate;
     }  
    
     public  int  getNewsRead(){
     		return  this.newsRead;
     };
     public  void  setNewsRead(int newsRead){
     	this.newsRead=newsRead;
     }  
    
     public  String  getNewsCreater(){
     		return  this.newsCreater;
     };
     public  void  setNewsCreater(String newsCreater){
     	this.newsCreater=newsCreater;
     }  
    
     public  String  getNewsRemark(){
     		return  this.newsRemark;
     };
     public  void  setNewsRemark(String newsRemark){
     	this.newsRemark=newsRemark;
     }
	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", newsTitle=" + newsTitle + ", newType=" + newType + ", newsContent="
				+ newsContent + ", newsDate=" + newsDate + ", newsRead=" + newsRead + ", newsCreater=" + newsCreater
				+ ", newsRemark=" + newsRemark + "]";
	}  
    
   
}