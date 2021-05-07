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
		System.out.println(game.getName() + " oyunu sat�n al�nd�. Oyunu alan ki�i :" + user.getName() + ".");
		
	}

	@Override
	public void AfterCampaign(Game game, Campaign campaign) {
		if (this.campaignService.IsThereCampaign()) {
			System.out.println("Oyun ad�: " + game.getName() + " olan oyun i�in �uan uygulanan kampanya : " + campaign.getCampaignName()+".");
		} else {
			System.out.println(game.getName() + " oyunu sat�ld�.");
		}
		
	}
	
}
