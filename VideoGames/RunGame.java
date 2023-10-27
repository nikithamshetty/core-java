public class RunGame{
	
	public static void main(String[] args){
		
		CheckGame check=new CheckGame();
		
		String[] characters1 = {"Lara Croft","Link","Luigi","Ryu Hayabusa","The Horned Reaper"};
		String[] characters2 = {"Donkey Kong"," Vault Boy","Leon Kennedy","Sam & Max","Pyramid Head"};
		String[] characters3 = {"Dirk The Daring","Marcus Fenix","Dr Fred Eddison","Mr. X","Dante"};
		
		VideoGame game1=new VideoGame("Riptide",4,25,GameType.ADVENTUROUS,true,characters1);
		VideoGame game2=new VideoGame("OutLaws",5,30,GameType.HORROR,false,characters2);
		VideoGame game3=new VideoGame("Kendal",8,100,GameType.TRILLER,true,characters3);
		VideoGame game4=new VideoGame("Delvina",5,25,GameType.ADVENTUROUS,false,characters1);
		VideoGame game5=new VideoGame("Raptors",5,40,GameType.HORROR,true,characters3);
	
		check.saveVideoGame(game1);
		check.saveVideoGame(game2);
		check.saveVideoGame(game3);
		check.saveVideoGame(game4);
		check.saveVideoGame(game5);
		System.out.println("........................");
		game1.printAllValues();
		game2.printAllValues();
		game3.printAllValues();
		game4.printAllValues();
		game5.printAllValues();
		
	}
}