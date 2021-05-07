package homework4_3.Concrete;

import homework4_3.Abstract.CampaignService;
import homework4_3.Abstract.SaleService;
import homework4_3.Entities.Campaign;
import homework4_3.Entities.Game;
import homework4_3.Entities.User;

public class SaleManager implements SaleService{

	private CampaignService campaignService;

	public SaleManager(CampaignService campaignService) {
		this.campaignService = campaignService;
	}
		
	
	@Override
	public void Sale(Game game, User user) {
		System.out.println(game.getName() + " oyunu satýn alýndý. Oyunu alan kiþi :" + user.getName() + ".");
		
	}

	@Override
	public void AfterCampaign(Game game, Campaign campaign) {
		if (this.campaignService.IsThereCampaign()) {
			System.out.println("Oyun adý: " + game.getName() + " olan oyun için þuan uygulanan kampanya : " + campaign.getCampaignName()+".");
		} else {
			System.out.println(game.getName() + " oyunu satýldý.");
		}
		
	}
	
}
