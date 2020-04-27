package View;

import java.rmi.Naming;
//import View.ModelImpl;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

// This class is used for connecting the server with the client with the respective connection port on which the server is present
public class Server {
	public static void main(String args[]) { 
		// This try block is used to etablish the server part of the program with the RMI with the respective port
		try {
			
			String host = args[0];
			int port = Integer.parseInt(args[1]);
			
			ModelImpl store = new ModelImpl();
			String name = "//"+host+":"+port+"/Server";
			
			
			Registry registry = LocateRegistry.getRegistry(port);
			registry.rebind(name,store);
			
			 
			System.out.println("Server is Deployed");
			} 
		catch (Exception e) { 
			e.printStackTrace(); 
	
		}
	}

}
