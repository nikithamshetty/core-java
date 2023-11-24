public class ChromeBrowser extends Browser{
	
	
	ChromeBrowser(String[] downloads,String[] browsingHistorySites,int size,String compatiblewith,Os os,int id,String name,ApplicationType type,
	double version,String developer,String date){
		super(downloads,browsingHistorySites,size,compatiblewith,os,id,name,type,version,developer,date);
	}
	@Override
	 void run(){
	 System.out.println("application running in chrome browser");
 }
 @Override
     void stop(){
	 System.out.println("stop running the application in chrome browser");
	
 }
 @Override
 void execute(){
	 System.out.println("application execute in chrome browser");
	 
 }
 @Override
 void consumeMemory(){
		System.out.println("application consumeMemory in chrome browser");
	
	}
	@Override
	void connectInternet(){
		System.out.println("application consumeInternet in chrome browser");
	}
	@Override
 void collectInfo(){
	 System.out.println("application collects the information from browser");
 }
 @Override
 void displayInfo(){
	 System.out.println("display info of browser");
	 
 } 
 @Override
	  
	 void sendUsage(){
		 System.out.println("send usage in chrome browser");
	 }
	 @Override

void settings(){
		System.out.println("application settings browser");
		
	}
	@Override
	void displayHistory(){
		System.out.println("display history in chrome browser");
	}
	


}
