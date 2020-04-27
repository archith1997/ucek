package Controller;

import java.rmi.RemoteException;
import java.util.Scanner;

import Controller.FrontController.User;
// The following class is used for different types of views 
public class View {

	Scanner scanObj = new Scanner(System.in);
// The following function is used identity whether is user is new or not
	public char checkNewUser() {
		System.out.println("\nNew User... y or n");
		char n = scanObj.next().charAt(0);
		if (n == 'y') {
			System.out.println("You are new User");
		}
		return n;
	}
// The following function is used for displaying the message 
	public void displayMessage(String usrname, String msg) {
		System.out.println("\n" + msg + " " + usrname);
	}
// The following function is used for identifing the type of user 
	public double checkUserType() {
		System.out.println("\nChoose Between Two Options 1.Customer 2.Administrator");
		double u = scanObj.nextDouble();
		return u;
	}
// This function is used getting the username 
	public String getUserName() {

		System.out.println("\nWhat is your Name ");
		String uname = scanObj.next();
		return uname;
	}
//This fuction is used to provide the desired type of model as per the type of the user
	public void userModel(User user) {
		try {
			user.performAction();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}
	// This function is used for providing view options if the user is a customer 

	public int customerOptions() {
		
		System.out.println("\nChoose the functions of Customer 1-Browse Items or 2-Purchase Items 0r 3-View Cart");
		int o = scanObj.nextInt();
		return o;
		
	}
		// This function is used for providing view options if the user is an employer  

	public int employerOptions() {
		System.out.println("\nChoose the functions for Administrator 1-Browse Items 2-Add Items 3-Remove Items 4-Temp ");
		int o = scanObj.nextInt();
		return o;
		
	}
	// This function displays an output message when called within the scope of the class
	public void outputMessage(String msg) {
		System.out.println("\n" + msg);
	}

	
}
