package Day4;

import java.util.Set;

public interface IPlayerService {
	void register(Player player) ;
    void deletePlayer(Player player);
	void updatePlayerEmail(String password, String newEmail,Player player);
	void buyGame(Set<Game> games,Game game,Player player);
	void showBuyedGames(Set<Game> games);

	

}
