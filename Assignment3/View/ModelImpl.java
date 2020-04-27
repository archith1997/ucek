package View;

import java.rmi.RemoteException;

import java.rmi.server.UnicastRemoteObject;

import java.util.Scanner;

import Model.Model;
// This is class carries the basic functions of the program when the client is connected to the server and request particular action
public class ModelImpl extends UnicastRemoteObject implements Model {

	Scanner scanObj = new Scanner(System.in);
	
	private static final long serialVersionUID = 1L;
	String name="";
	String items = "1.Shoes 2.Clothes 3. Electronics 4.Processed Food 5.Movies"; 
	String register = "Registration would be Available in only Next Module ";
	String arch = "You are logged in as Customer";
	String jith = "The Cart is Under Construction";
	String nik = "Using Java RMI Using MVC Pattern Connected Globally";
	String abhi = "You are logged in as Administrator";

	public ModelImpl() throws RemoteException {
		super();
	}
	public String sName() throws RemoteException{ 
		
		return name;
	}
	public void gName(String cname) throws RemoteException{ 
		
		this.name = cname;
	}
	
	public String customerRegister() throws RemoteException {
		return register;
	}

	// This function is used to obtain the login details from the user to identify the type of user
	public String customerLogin() throws RemoteException{
		System.out.println("\nAuthentication Required");
		System.out.println("\nPlease Enter Username");
		String user = scanObj.next();
		System.out.println("\nPlease Enter Password");
			String pass = scanObj.next();
		if ((user.equals("Archith") || user.equals("Jitesh")) && (pass.equals("arch")|| pass.equals("jith"))){
			System.out.println("Logged In Sucessfully");
		}
		else {
			System.out.println("Incorrect Username or Password");
			throw new IllegalArgumentException("Invalid Choice");
				
		}
		return arch;
	}

	// This function is used for authenicating the credentials provided by the user.

	public String employerLogin() throws RemoteException {
		System.out.println("\nAuthentication Required");
		System.out.println("\nPlease Enter Username");
		String user = scanObj.next();
		System.out.println("\nPlease Enter Password");
			String pass = scanObj.next();
		if ((user.equals("Archith") || user.equals("Jitesh")) && (pass.equals("arch")|| pass.equals("jith"))) {
			System.out.println("Logged In Sucessfully");
		}
		else {
			System.out.println("Incorrect Username or Password");
			throw new IllegalArgumentException("Invalid Choice");
				
		}
		return abhi;
	}

	// This function is used to browse items present in the server
	public String browseItems() throws RemoteException{
		System.out.println("\n The Items which are available are \n");
		return items;
	}

	// This function is used to view the items in the shopping cart
	public String addToShoppingCart() throws RemoteException{
		return jith;
	}

	// This function is used to view the purchased items 
	public String purchaseItems() throws RemoteException{
		return jith;
	}
	
	


}
