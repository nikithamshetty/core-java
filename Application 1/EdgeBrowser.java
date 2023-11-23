public class EdgeBrowser extends Browser{
	
	
	EdgeBrowser(String[] downloads,String[] browsingHistorySites,int size,String compatiblewith,Os os,int id,String name,ApplicationType type,
	double version,String developer,String date){
		super(downloads,browsingHistorySites,size,compatiblewith,os,id,name,type,version,developer,date);
	}
	
	 void run(){
	 System.out.println("application running ON");
 }
 void stop(){
	 System.out.println("stop running application OF");
	
 }
 void execute(){
	 System.out.println("application execute ON ");
	 
 }
 
 void consumeMemory(){
		System.out.println("application consumeMemory ");
	
	}
	void connectInternet(){
		System.out.println("application consumeInternet ");
	}
 void collectInfo(){
	 System.out.println("application collects the information");
 }
 void displayInfo(){
	 System.out.println("display info");
	 
	 
 }
	 void sendUsage(){
		 System.out.println("send usage ");
	 }
void settings(){
		System.out.println("application settings");
		
	}
	
	void displayHistory(){
		System.out.println("display history ");
	}
	


}
