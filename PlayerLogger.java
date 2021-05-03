package Day4;

import java.util.HashSet;
import java.util.Set;

public class PlayerLogger implements ILoggerService {
	static Set<Player> playerList = new HashSet<Player>();

	@Override
	public void addPlayer(Player player) {
		playerList.add(player);
		System.out.println("Player added");
	}

	@Override
	public void deletePlayer(String tcno) {
		for (Player player : playerList) {
			if(player.getTcNo().equals(tcno)) {
				playerList.remove(player);
				System.out.println(player.getName()+" deleted from database");
			}
			
		}
		
	}

	@Override
	public void updateEmail (String newEmail,Player player) {
		if(playerList.contains(player)) {
			player.setEmail(newEmail);
			System.out.println("Email changed.");
		}
		

	}

	@Override
	public void showPlayers() {
		for (Player player : playerList) {
			System.out.println(player.getName()+"\n"+player.getSurname()+"\n"+player.getTcNo()+"\n"+player.getBirthYear()+"\n"+player.getPassword()+"\n"+player.getEmail()+"\n"+player.getWallet());
			System.out.println("--------------------------------------------------------------------------------------");
			
		}
		
	}
	

}
