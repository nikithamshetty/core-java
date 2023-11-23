public class ApplicationRunner{
	
	
	
	public static void main(String[] args){
		
		
		System.out.println("main method starting");

        Application application=new Application(21,"React JS",ApplicationType.PRESENTATION,1.8,"Facebook","12-07-1994");
        System.out.println(application.id);
         System.out.println(application.name);
         System.out.println(application.type);
         System.out.println(application.version);
         System.out.println(application.developer);
         System.out.println(application.date);
         application.run();
          application.stop();
		  application.execute();
         application.collectInfo();
         application.displayInfo();


System.out.println(".............................");

StandaloneApplication stand=new StandaloneApplication(02,"windows10",Os.WINDOWS,23,"React",ApplicationType.SPREADSHEET,1.8,"Facebook","1-03-1995");
System.out.println(stand.size);
System.out.println(stand.compatiblewith);
System.out.println(stand.os);
stand.consumeMemory();
stand.consumeInternet();
stand.run();
stand.execute();

System.out.println(".............................");

String[] supportedBrowsers= {"UC browser","Safari"};
WebApplication webapp=new WebApplication(supportedBrowsers,true,21,"java",ApplicationType.PRESENTATION,1.8,"Facebook","14-11-2002");
System.out.println(webapp.supportBrowsers);
System.out.println(webapp.free);
webapp.connectInternet();
webapp.sendUsage();
webapp.run();
webapp.stop();
webapp.execute();

System.out.println(".............................");

String[] downloads={"Xampp","Notepad++"};
String[] browsingHistorySites={"google.com","youTube.com"};

Browser browser=new Browser(downloads,browsingHistorySites,23,"windows8",Os.UBUNTU,12,"Java",ApplicationType.SPREADSHEET,1.8,"sun microsystem","8-04-1994");
System.out.println(browser.downloads);
System.out.println(browser.browsingHistorySites);
System.out.println(browser.size);
System.out.println(browser.compatiblewith);
System.out.println(browser.os);
browser.settings();
browser.displayHistory();

System.out.println(".............................");
String[] fav={"jio","resso"};
MediaPlayer media=new MediaPlayer(fav,10,"windows8",Os.MAC,10,"windows7",ApplicationType.PRESENTATION,1.8,"sun microsystem","25-12-1967");
System.out.println(media.favourites);
System.out.println(media.size);
System.out.println(media.compatiblewith);
System.out.println(media.type);
System.out.println(media.os);
media.play();
media.delete();
media.download();

System.out.println(".............................");

ChromeBrowser chrome=new ChromeBrowser(downloads,browsingHistorySites,76,"MAC",Os.MAC,45,"IOS",ApplicationType.PRESENTATION,89,"Apple","4-06-1978");

chrome.run();
chrome.stop();
chrome.execute();
chrome.consumeMemory();
chrome.connectInternet();
chrome.collectInfo();
chrome.displayHistory();
chrome.displayInfo();
chrome.settings();
chrome.sendUsage();

System.out.println(".............................");

EdgeBrowser edge=new EdgeBrowser(downloads,browsingHistorySites,24,"Linux",Os.UBUNTU,28,"Unix",ApplicationType.PRESENTATION,1.8,"Ubuntu","4-08-1964");

edge.run();
edge.stop();
edge.execute();
edge.consumeMemory();
edge.connectInternet();
edge.collectInfo();
edge.displayHistory();
edge.displayInfo();
edge.settings();
edge.sendUsage();

System.out.println("..........................");

FireFox fire=new FireFox(downloads,browsingHistorySites,37,"windows7",Os.WINDOWS,163,"windows7",ApplicationType.SPREADSHEET,1.8,"sun microsystem","23-08-2001");
fire.run();
fire.stop();
fire.execute();
fire.consumeMemory();
fire.connectInternet();
fire.collectInfo();
fire.displayHistory();
fire.displayInfo();
fire.settings();
fire.sendUsage();


System.out.println("Ending of main method");




}

}
