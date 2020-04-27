package Model;

import java.rmi.Remote;
import java.rmi.RemoteException;
// This is interface method between the client and server with all the functions present on the server side
public interface Model extends Remote{
	
	public String sName() throws RemoteException;
	public void gName(String cname) throws RemoteException;
	public String customerRegister() throws RemoteException;
	public String customerLogin() throws RemoteException;
	public String employerLogin() throws RemoteException;
	public String browseItems() throws RemoteException;
	public String addToShoppingCart() throws RemoteException;
	public String purchaseItems() throws RemoteException;
	
	
		
	
}