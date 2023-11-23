public class Remote{
	
	RemoteUsed used;
	int totalButtons;
	boolean original;
	
	Remote(RemoteUsed used,int totalButtons,boolean original){
		this.used = used;
		this.totalButtons = totalButtons;
		this.original = original;
		System.out.println("Running the Used,totalButtons,original const of Remote");
	}
	
	void on(){
		System.out.println("Running ON method in Remote");
	}
	
	void off(){
		System.out.println("Running OFF method in remote");
	}
	
	void increaseVolume(){
		System.out.println("Running increase volume method in remote");
	}
	
	void decreaseVolume(){
		System.out.println("Running decrease volume method in remote");
	}
	
	void changeChannel(){
		System.out.println("Running change channel method in remote");
	}
}