package gameMarketting.adapter;

import java.rmi.RemoteException;
import gameMarketting.abstracts.CheckRealPlayerService;
import gameMarketting.entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CheckRealPlayerService {
	
	@Override
	public boolean checkIfRealPlayer(Player player) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = client.TCKimlikNoDogrula(
					Long.parseLong(player.getNationalityId()), 
					player.getFirstName(),
					player.getLastName(), 
					player.getDateOfBirth().getYear());
		} 
		catch (NumberFormatException | RemoteException e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
