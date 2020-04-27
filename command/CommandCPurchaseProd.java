

package command;

import java.util.List;

import interfaces.ICommand;
import rmi.RmiClient;
import server.Session;
import server.itemList;

public class CommandCPurchaseProd implements ICommand {

	private RmiClient rmi;
	private Session session = null;
	private List<itemList> items;

	CommandCPurchaseProd(Session session) {
		rmi = new RmiClient();
		this.session = session;
	}

	@Override
	public List<itemList> execute(String info) {
		// Execute purchase product command for Customer user to purchase the product
		items = rmi.sendCustomerRequest("purchaseProduct", session, info);
		
		return items;
	}// execute

}// class CommandCPurchaseProd
