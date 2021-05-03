package Day4;

public interface ILoggerService {
	void addPlayer(Player player);
	void deletePlayer(String tcno);
	void updateEmail(String newEmail,Player player);
	void showPlayers();
}
