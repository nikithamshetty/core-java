public class Application
{
 int id;
 String name;
 ApplicationType type;
 double version;
 String developer;
 String date;
 
 Application(int id,String name,ApplicationType type,double version,String developer,String date){
	 this.id=id;
	 this.name=name;
	 this.type=type;
	 this.version=version;
	 this.developer=developer;
	 this.date=date;
 }
 void run(){
	 System.out.println("application is running");
 }
 void stop(){
	 System.out.println("stoping the  running application");
	
 }
 void execute(){
	 System.out.println("execute the application");
	 
 }
 void collectInfo(){
	 System.out.println("application collects all the information");
 }
 void displayInfo(){
	 System.out.println("display all the info");
 }
 
}