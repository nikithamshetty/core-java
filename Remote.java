public class Remote{
public static void main(String[] args){
Tv tv=new Tv("Samsung",4,5,2,"LED");

if(tv!=null){
System.out.println(tv.brandName);
System.out.println(tv.ports);
System.out.println(tv.displaySize);
System.out.println(tv.maxVolume);
System.out.println(tv.isOn);
}
Tv.watchShows();
Tv.toPlayGames();
tv.selectShow("Netflix");
tv.selectMovie("Khufiya");
}
}



class Tv{
String brandName;
int ports;
static int maxVolume;
int displaySize;
static int electricSupplyWire;
static boolean isOn;
int speakers;
String displayType;

static{
 maxVolume=100;
 int electricSupplyWire=1;
isOn=true;
}

Tv(String brandName,int ports,int displaySize,int speakers,String displayType){
this.brandName=brandName;
this.ports=ports;
this.displaySize=displaySize;
this.speakers=speakers;
this.displayType=displayType;
}

public static void watchShows(){
System.out.println("TV can be used to watch any shows");
}

public static void toPlayGames(){
System.out.println("In TV we can setup playstation to play");
}

public void selectShow(String showName){
System.out.println("Showname is "+showName);
}

public void selectMovie(String movieName){
System.out.println("Moviename is "+movieName);
}

}