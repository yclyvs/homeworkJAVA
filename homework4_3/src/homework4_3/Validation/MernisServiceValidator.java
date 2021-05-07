package homework4_3.Validation;

import java.rmi.RemoteException;
import java.util.Locale;

import homework4_3.Abstract.UserCheckService;
import homework4_3.Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceValidator implements UserCheckService{

	@Override
	public boolean CheckIfRealPerson(User user) {
		KPSPublicSoapProxy customer = new KPSPublicSoapProxy();
		boolean result=true;
		try {		
			result = customer.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()),
					user.getName().toUpperCase(new Locale("tr")),
				user.getLastName().toUpperCase(new Locale("tr")),user.getDateOfBirth());
		}catch (RemoteException e) {
		
			e.printStackTrace();
		}

	return result;
		
	}

}
