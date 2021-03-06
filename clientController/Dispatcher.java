

package clientController;

import abstractFactory.AbstractFact;
import abstractFactory.ConcreteAdminFact;
import abstractFactory.ConcreteCustFact;
import server.Session;

public class Dispatcher {

	private AbstractFact fact;

	Dispatcher() {

	}

	public void showView(Session session) {
		// Admin credentials

		if (session.getUserRole().equals("ADMIN")) {
			System.out.println("Administrator Login Successful");

			// Create concrete class object to display the admin view
			fact = new ConcreteAdminFact();
			fact.createView(session);
		}

		// Customer credentials
		else if (session.getUserRole().equals("CUSTOMER")) {
			System.out.println("Customer Login Successful");

			// Create concrete class object to display the customer view
			fact = new ConcreteCustFact();
			fact.createView(session);
		}

	}// showview

} // class dispatcher
