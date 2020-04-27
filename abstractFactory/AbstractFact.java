

package abstractFactory;

import server.Session;

public abstract class AbstractFact {

	// Abstract method which will create respective view object.
	public abstract void createView(Session session);
}// class AbstractFact
