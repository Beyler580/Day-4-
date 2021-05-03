package Day4;

import java.util.Set;

public interface ICampaignService {
	void add(Campaign campaign,Set<Game> games);
	void delete(Campaign campaign,Set<Game> games);
}
