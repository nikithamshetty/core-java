public class FireFox extends Browser{
	
	
	FireFox(String[] downloads,String[] browsingHistorySites,int size,String compatiblewith,Os os,int id,String name,ApplicationType type,
	double version,String developer,String date){
		super(downloads,browsingHistorySites,size,compatiblewith,os,id,name,type,version,developer,date);
	}
	
	@Override
 void run(){
	 System.out.println("application running..... ");
 }
 @Override
 void stop(){
	 System.out.println("stop running application.... ");
	
 }
 @Override
 void execute(){
	 System.out.println("application execute..... ");
	 
 }
 @Override
 void consumeMemory(){
		System.out.println("application consumeMemory..... ");
	
	}
	@Override
	void connectInternet(){
		System.out.println("application consumeInternet...... ");
	}
	@Override
 void collectInfo(){
	 System.out.println("application collects the information.....");
 }
 @Override
 void displayInfo(){
	 System.out.println("display info.....");
	
	 }
	 
	 @Override
	 void sendUsage(){
		 System.out.println("send usage .....");
	 }
	 @Override
void settings(){
		System.out.println("application settings....");
		
	}
	@Override
	void displayHistory(){
		System.out.println("display history .....");
	}
	


}
