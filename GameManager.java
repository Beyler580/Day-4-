package Day4;

import java.util.Set;

public class GameManager implements IGameService {
	

	@Override
	public void addGame(Game game,Set<Game> games) {
		games.add(game);
		System.out.println(game.getName()+" added to Games");
	}

	@Override
	public void deleteGame(Game game,Set<Game> games) {
		for (Game game2 : games) {
			if(game2.getId() == game.getId()) {
				System.out.println(game2.getName()+" has been deleted");
				games.remove(game2);
			
			}

		}	
	}

	@Override
	public void updateGamePrice(Game game, int newGamePrice,Set<Game> games) {
		if(games.contains(game)) {
			System.out.println(game.getName()+" "+game.getPrice() +"$ changed to "+newGamePrice+"$");
			game.setPrice(newGamePrice);
		}
		else {
			System.out.println("Game couldnt find");
		}
		
		
	}
	

}
