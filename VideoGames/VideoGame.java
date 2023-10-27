public class VideoGame{
String name;
int noOfPlayers;
int noOfLevels;
GameType type;
boolean isFree;
String[] characters;

 VideoGame(String name, int noOfPlayers, int noOfLevels, GameType type, boolean isFree, String[] characters){
	this.name=name;
	this.noOfPlayers=noOfPlayers;
	this.noOfLevels=noOfLevels;
	this.type=type;
	this.isFree=isFree;
	this.characters=characters;
   }
    String getGameName(){
	return this.name;
    }
    int getNoOfPlayers(){
    return this.noOfPlayers;
     }
     int getNoOfLevels(){
      return this.noOfLevels;
    }
	GameType getType(){
		return this.type;
	}
	boolean getIsFree(){
		return this.isFree;
	}
	String[] getCharaterName(){
		return this.characters;
	}
	void printAllValues(){
		System.out.println("Name of the Vgame: "+this.name);
		System.out.println("Number of players in game: "+this.noOfPlayers);
		System.out.println("Number of levels in game: "+this.noOfLevels);
		System.out.println("Game type: "+this.type);
		System.out.println("Game is free or not: "+this.isFree);
		for(int i=0;i<characters.length;i++){
		System.out.println("Characters are: "+characters[i]);
		}
		System.out.println("......................");
	}
	
}
