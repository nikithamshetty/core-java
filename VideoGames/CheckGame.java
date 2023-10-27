public class CheckGame{
	
	VideoGame[] gameArray=new VideoGame[5];
	
	boolean saveVideoGame(VideoGame game){
		
		boolean validateGame=validateVideoGames(game);
		
		if(validateGame){
		
		    for(int index=0;index<gameArray.length;index++){
				
			    if(gameArray[index]==null){
				gameArray[index] = game;
				System.out.println("Data Successfully saved");
				return true;
			}
			
             else{
				System.out.println("Index is not empty,so checking the next index");
			    }	
		     }
		System.out.println("No space to save");
		return false;
	}
	return false;
}

boolean validateVideoGames(VideoGame game){
	
	if(game!=null){
		if(game.getGameName()!=null && game.getGameName().length()>3){
			if(game.getNoOfPlayers()>1){
				if(game.getNoOfLevels()>10){
					if(game.getCharaterName().length>4){
						return true;
					}
					else{
						System.out.println("Characters are invalid please re-enter valid characters");
						return false;
					}
				}
				else{
					System.out.println("Game levels are not valid");
					return false;
				}
			}
			else{
				System.out.println("Game number of players are not valid");
				return false;
			}
		}
		else{
			System.out.println("Game Name is not valid");
			return false;
		}
	}
	else{
		System.out.println("Video Game is not valid");
		return false;
	}
	}
}


				