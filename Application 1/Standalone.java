public class StandaloneApplication extends Application{
	int size;
	String compatiblewith;
	Os os;
	
	StandaloneApplication(int size,String compatiblewith,Os os,int id,String name,ApplicationType type,double version,String developer,String date){
		super(id,name,type,version,developer,date);
		this.size=size;
		this.compatiblewith=compatiblewith;
		this.os=os;
		
	}
	void consumeMemory(){
		System.out.println("all application consumes Memory");
	
	}
	void consumeInternet(){
		System.out.println("all application consumes Internet");
	}
	
}
