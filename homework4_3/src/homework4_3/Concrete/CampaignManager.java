package homework4_3.Concrete;

import homework4_3.Abstract.CampaignService;
import homework4_3.Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya Eklendi : " + campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi : " + campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi : " + campaign.getCampaignName());
		
	}

	@Override
	public boolean IsThereCampaign() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
