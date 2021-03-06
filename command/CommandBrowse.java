

package command;

import java.util.List;

import interfaces.ICommand;
import rmi.RmiClient;
import server.Session;
import server.itemList;

public class CommandBrowse implements ICommand {

	private RmiClient rmi;
	private Session session = null;
	private List<itemList> items;

	CommandBrowse(Session session) {
		rmi = new RmiClient();
		this.session = session;
	}

	@Override
	public List<itemList> execute(String info) {
		// Execute browse command for Admin user to browse the product
		items = rmi.sendAdminRequest("browse", session, info);
		
		return items;
	}// execute

}// class CommandBrowse
