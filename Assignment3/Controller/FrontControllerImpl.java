package Controller;



import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;


import View.ModelImpl;

import Model.Model;

//This class is used to connecet the client with the server with it's respective port
public class FrontControllerImpl {
	public static void main(String args[]) throws RemoteException {
		Scanner readObj = new Scanner(System.in);
		String host = args[0];
		int port = Integer.parseInt(args[1]);
		
		
		String name = "//"+host+":"+port+"/RemoteAccount";
		
		Registry registry = LocateRegistry.getRegistry(host, port);
		
		Model cmodel= new ModelImpl();
	
		View cview = new View();
		FrontController controller = new FrontController(cmodel, cview);
	
}
}
