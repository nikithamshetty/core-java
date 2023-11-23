public class MediaPlayer extends StandaloneApplication{
	
	String[] favourites;
	
	MediaPlayer(String[] favourites,int size,String compatiblewith,Os os,int id,String name,ApplicationType type,double version,String developer,String date){
		super(size,compatiblewith,os,id,name,type,version,developer,date);
		this.favourites=favourites;
	}
	
	void play(){
		System.out.println("playing the method");
	}
	
	void delete(){
		System.out.println("delete the method");
	}
	void download(){
		System.out.println("download the method");
	
	}
	
	}
