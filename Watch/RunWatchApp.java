public class RunWatchApp{
	
	public static void main(String[] args){
		
		WatchApp watchapp = new WatchApp();
		
		
		Watch watch1 = new Watch("Sonata","Casual Wear watch",2000,false,"Sonata Fibre");
		Watch watch2 = new Watch("FastTrack","Sports Watch",4500,true,"FastTrack Core Series");
		Watch watch3 = new Watch("","",0,false,"");
		
		watchapp.saveWatch(watch1);
		System.out.println(".........................");
		
		watchapp.saveWatch(watch2);
		watchapp.saveWatch(watch3);
		
	Watch[] fetchedValues = watchapp.fetchWatchList();
	
		for(int i=0;i<fetchedValues.length;i++){
			if(fetchedValues[i]!=null)
			fetchedValues[i].printValues();
		
	}
		

		
	}
}
