package homework4_3.Concrete;

import homework4_3.Abstract.UserCheckService;
import homework4_3.Abstract.UserService;
import homework4_3.Entities.User;

public class UserManager implements UserService{
	
	private UserCheckService userCheckService;
	public UserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}
	
	
	@Override
	public void add(User user) {
		if (this.userCheckService.CheckIfRealPerson(user)) {
			System.out.println("Kullan�c� eklendi : " + user.getName());
		} else {
			System.out.println("B�yle bir kullan�c� yok.");
		}
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullan�c� silindi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullan�c� g�ncellendi.");
		
	}
	
}
