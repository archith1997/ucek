
package abstractFactory;

import server.Session;
import view.Administrator;



public class ConcreteAdminFact extends AbstractFact {

	private Administrator admin;

	// Create an object of administrator view and display the admin view
	@Override
	public void createView(Session session) {

		admin = new Administrator(session);
		admin.displayView();

	}// createView

}// class ConcreteAdminFact
