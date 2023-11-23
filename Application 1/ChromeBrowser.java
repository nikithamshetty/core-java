public class ChromeBrowser extends Browser{
	
	
	ChromeBrowser(String[] downloads,String[] browsingHistorySites,int size,String compatiblewith,Os os,int id,String name,ApplicationType type,
	double version,String developer,String date){
		super(downloads,browsingHistorySites,size,compatiblewith,os,id,name,type,version,developer,date);
	}
	
	 void run(){
	 System.out.println("application running in chrome browser");
 }
 void stop(){
	 System.out.println("stop running the application in chrome browser");
	
 }
 void execute(){
	 System.out.println("application execute in chrome browser");
	 
 }
 
 void consumeMemory(){
		System.out.println("application consumeMemory in chrome browser");
	
	}
	void connectInternet(){
		System.out.println("application consumeInternet in chrome browser");
	}
 void collectInfo(){
	 System.out.println("application collects the information from browser");
 }
 void displayInfo(){
	 System.out.println("display info of browser");
	 
 } 
	  
	 void sendUsage(){
		 System.out.println("send usage in chrome browser");
	 }

void settings(){
		System.out.println("application settings browser");
		
	}
	
	void displayHistory(){
		System.out.println("display history in chrome browser");
	}
	


}
