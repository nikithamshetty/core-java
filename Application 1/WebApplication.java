public class WebApplication extends Application{
    String[] supportedBrowsers;
	boolean free;
	
	
	WebApplication(String[] supportedBrowsers,boolean free,int id,String name,ApplicationType type,double version,String developer,String date){
		super(id,name,type,version,developer,date);
		this.supportedBrowsers=supportedBrowsers;
		this.free=free;
	}
     void connectInternet(){
		 System.out.println("connect the Internet");
	 }
	 void sendUsage(){
		 System.out.println("send usage");
	 }

}
