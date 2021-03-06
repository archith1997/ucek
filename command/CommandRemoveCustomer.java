
package command;

import java.util.List;

import interfaces.ICommand;
import rmi.RmiClient;
import server.Session;
import server.itemList;

public class CommandRemoveCustomer implements ICommand {
	
	private RmiClient rmi;
	private Session session = null;
	private List<itemList> items;

	CommandRemoveCustomer(Session session) {
		rmi = new RmiClient();
		this.session = session;
	}

	@Override
	public List<itemList> execute(String info) {
		// Execute remove customer command for Admin user to remove a Customer
		items = rmi.sendAdminRequest("removecustomer", session, info);
		
		return items;
	}// execute
	
}// class CommandRemoveCustomer
