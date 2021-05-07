package homework4_3.Abstract;

import homework4_3.Entities.Campaign;

public interface CampaignService {
	void add(Campaign campaign);
	void delete(Campaign campaign);
	void update(Campaign campaign);
	boolean IsThereCampaign();
}
