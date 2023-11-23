public class Browser extends StandaloneApplication{
	String[] downloads;
	String[] browsingHistorySites;
	
	
	Browser(String[] downloads,String[] browsingHistorySites,int size,String compatiblewith,Os os,int id,String name,ApplicationType type,
	double version,String developer,String date){
		super(size,compatiblewith,os,id,name,type,version,developer,date);
		this.downloads=downloads;
		this.browsingHistorySites=browsingHistorySites;
	}
	void settings(){
		System.out.println("application set settings");
		
	}
	
	void displayHistory(){
		System.out.println("display all history");
	}
	
	
}
