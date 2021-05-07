package homework4_3;

import homework4_3.Concrete.CampaignManager;
import homework4_3.Concrete.GameManager;
import homework4_3.Concrete.SaleManager;
import homework4_3.Concrete.UserManager;
import homework4_3.Entities.Campaign;
import homework4_3.Entities.Game;
import homework4_3.Entities.User;
import homework4_3.Validation.MernisServiceValidator;

public class Main {

	public static void main(String[] args) {
		User user = new User(1,"12345678901","yücel","yavaþ",1986);
		Game game=new Game(1, "Total War", 1000	, 2000);
		Campaign campaign = new Campaign(1, "Yeni Yýl Kampanyasý", 20);
		UserManager userManager = new UserManager(new MernisServiceValidator());
		
		userManager.add(user);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		
		SaleManager saleManager = new SaleManager(new CampaignManager());
		saleManager.AfterCampaign(game, campaign);
		saleManager.Sale(game, user);
	}

}
