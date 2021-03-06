
package command;

import java.util.List;

import interfaces.ICommand;
import rmi.RmiClient;
import server.Session;
import server.itemList;

public class CommandCShoppingCart implements ICommand {

	private RmiClient rmi;
	private Session session = null;
	private List<itemList> items;

	CommandCShoppingCart(Session session) {
		rmi = new RmiClient();
		this.session = session;
	}

	@Override
	public List<itemList> execute(String info) {
		// Execute shopping cart command for Customer user to add a product to
		// shopping cart
		items = rmi.sendCustomerRequest("shoppingCart", session, info);
		
		return items;
	}// execute

} // class CommandCShoppingCart
