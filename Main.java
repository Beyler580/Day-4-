package Day4;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Game> games = new HashSet<Game>();
		Set<Game> soldGames = new HashSet<Game>();
 		Player beyler = new Player("Beyler", "Qurbanov", "01589674689", 2005, "11188188", "beyler232@gmail.com",30);
		Player ali = new Player("Ali", "Caliskan", "02349074689", 2001, "32324434", "alicaliskan@outlook.com",23);
		Player mesut = new Player("Mesut", "Caliskan", "02349036190", 2000, "323223232", "mesutcaliskan@outlook.com",50);
		ValidationManager validationManager = new ValidationManager();
		PlayerLogger logger = new PlayerLogger();
		PlayerManager playerManager = new PlayerManager(logger, validationManager);
		playerManager.register(mesut);
		playerManager.register(beyler);
		playerManager.deletePlayer(beyler);
		playerManager.register(ali);
		playerManager.updatePlayerEmail("32324434", "ali23@gmail.com", ali);
	//	System.out.println(ali.getEmail());
       
		
		GameManager gameManager = new GameManager();
		Game csgo = new Game("Counter Strike Global Offensive", 1, "2013", 10);
		Game pubg =  new Game("Player Unknowns Battle Ground", 2, "2018", 19);
		Game raft =  new Game("Raft", 6, "2017", 29);
		Game theforest =  new Game("The Forest", 4, "2019", 17);
		Game minecraft =  new Game("Minecraft", 5, "2009", 5);
		Game r6 = new Game("Rainbow 6 siege", 3, "2015", 30);
		gameManager.addGame(raft, games);
		gameManager.addGame(minecraft, games);
		gameManager.addGame(theforest, games);
		gameManager.addGame(csgo, games);
		gameManager.addGame(r6, games);
		gameManager.addGame(pubg, games);
		gameManager.deleteGame(r6, games);
		gameManager.updateGamePrice(r6, 40,games); 
		gameManager.updateGamePrice(pubg, 30, games); //Game couldnt find 
		
		
		
		
		
		playerManager.buyGame(soldGames, csgo, mesut);
		//playerManager.buyGame(boughtGames, raft, ali);  not enough balance
		gameManager.updateGamePrice(raft, 13, games);
		playerManager.buyGame(soldGames, raft, ali);
			
		
		Campaign springCampaign = new Campaign("Spring Sales", 30);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(springCampaign, games);
		playerManager.buyGame(soldGames, minecraft, ali);
		playerManager.buyGame(soldGames, theforest, mesut);
		campaignManager.delete(springCampaign, games);
		playerManager.buyGame(soldGames, raft, mesut);
		System.out.println("*****************************************************************\n");
		playerManager.showBuyedGames(soldGames);
		logger.showPlayers();

		

		
	
		

		
		

	}

}
