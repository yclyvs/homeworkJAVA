package homework4_3.Abstract;

import homework4_3.Entities.Campaign;
import homework4_3.Entities.Game;
import homework4_3.Entities.User;

public interface SaleService {
	void Sale(Game game, User user);
	void AfterCampaign(Game game,Campaign campaign);
}
