package Day4;

import java.util.Set;

public interface IGameService {
	void addGame(Game game,Set<Game> games);
	void deleteGame(Game game ,Set<Game> games);
	void updateGamePrice(Game game , int newGamePrice,Set<Game> games);

}
