public class LgRemote extends Remote{
	
	int warranty;
	int totalBatteries;
	
	LgRemote(int warranty,int totalBatteries){
		super(RemoteUsed.FAN,30,true);
		this.warranty = warranty;
		this.totalBatteries = totalBatteries;
		System.out.println("Running int,int const of lg remote");
	}
	
	@Override
	void increaseVolume(){
		System.out.println("Running increase volume method in Lg remote");
	}
	
	@Override
	void decreaseVolume(){
		System.out.println("Running decrease volume method in Lg remote");
	}
	void voiceCommand(){
		System.out.println("Running voice command method in Lg remote");
	}
	
}
	