
package command;

import java.util.List;

import interfaces.ICommand;
import rmi.RmiClient;
import server.Session;
import server.itemList;

public class CommandUpdate implements ICommand {

	private RmiClient rmi;
	private Session session = null;
	private List<itemList> items;

	CommandUpdate(Session session) {
		rmi = new RmiClient();
		this.session = session;
	}

	@Override
	public List<itemList> execute(String info) {
		// Execute update command for Admin user to update the product
		// information
		items = rmi.sendAdminRequest("update", session, info);
		
		return items;
	}// execute

} // class CommandUpdate
