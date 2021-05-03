package Day4;

import java.util.Set;

public class PlayerManager implements IPlayerService {
	 PlayerLogger logger ; 
	 ValidationManager validationManager;

	public PlayerManager(PlayerLogger logger,ValidationManager validationManager) {
		super();
		this.logger = logger;
		this.validationManager = validationManager;
	}

	@Override
	public void register(Player player) {
		if(this.validationManager.validate(player.getTcNo())) {
	
			 logger.addPlayer(player);
			 //logger.showPlayers();
		}
		else {
			System.out.println("Player could not add");
		}
	}

	@Override
	public void deletePlayer(Player player) {
		logger.deletePlayer(player.getTcNo());
		//logger.showPlayers();
		
		}
	

	@Override
	public void updatePlayerEmail(String password, String newEmail,Player player) {
		if(player.getPassword()==password) {
			logger.updateEmail(newEmail, player);
			
		}
		else {
			System.out.println("Wrong password");
		
		}
		
	}

	@Override
	public void buyGame(Set<Game> games,  Game game,Player player) {
		if(game.getPrice() <= player.getWallet()) {
			System.out.println(game.getName() + " purchased for "+game.getPrice()+"$");
			player.setWallet(player.getWallet()-game.getPrice());
			System.out.println("New Wallet "+player.getWallet());
			games.add(game);
			
		}else {
			System.out.println("Not enough balance");
					
		}

	
		
	}

	@Override
	public void showBuyedGames(Set<Game> games) {
		for (Game game : games) {
			System.out.println(game.getName()+"\n"+game.getId()+"\n"+game.getPrice()+"\n"+game.getYear());
			System.out.println("----------------------------------------------");
			
		}
		
	}
	

}
