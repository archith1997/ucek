

package abstractFactory;

import server.Session;
import view.Customer;



public class ConcreteCustFact extends AbstractFact {

	private Customer cust;

	// Create an object of customer view and display the customer view
	@Override
	public void createView(Session session) {
		cust = new Customer(session);
		cust.displayView();

	}// createView

} // class ConcreteCustFact
