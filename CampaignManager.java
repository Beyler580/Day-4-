package Day4;

import java.util.Set;

public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign,Set<Game> games) {
		System.out.println(campaign.getName()+" Sales started.");
		for (Game game : games) {
			game.setPrice(game.getPrice()-(game.getPrice()*campaign.getDiscount()/100));
			System.out.println(game.getName()+" New price: "+ game.getPrice());
		}
		
	}

	@Override
	public void delete(Campaign campaign,Set<Game> games) {
		System.out.println(campaign.getName() + " sales has finished");
		for (Game game : games) {
			game.setPrice(game.getPrice()+(game.getPrice()-(game.getPrice()*campaign.getDiscount()/100)));
			System.out.println(game.getName()+" New price: "+ game.getPrice());
			//Bu kismi tam yapamadim :D
			
		}
		
		
		
	}


}
