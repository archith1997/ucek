package Controller;


import Model.Model;


import java.rmi.RemoteException;
import java.util.Scanner;


public class FrontController {

	private Model cat;
	
    private View dog;

    public FrontController(Model cat, View dog){
       this.cat = cat;
       this.dog = dog;
       this.dog.userModel(new User());
    }
    //This class is used to get inputs from the user and identity the type of the user
    class User{
    	
    	public void performAction() throws RemoteException {
    		
    try {
    	Scanner readObj = new Scanner(System.in);
    	
    	String uname = dog.getUserName();
    	cat.gName(uname);
    	String username = cat.sName();
    	
    	
    	double usertype = dog.checkUserType();
		
		if (usertype ==1) {
			char newuser = dog.checkNewUser();
			if (newuser == 'y') {
				dog.displayMessage(uname,cat.customerRegister());
				dog.displayMessage(username,cat.customerLogin());
			}
			else if (newuser == 'n'){
				dog.displayMessage(username,cat.customerLogin());
			}
			
			else {
			throw new IllegalArgumentException("Invalid Choice: Please enter 'y' or 'n'");
			}
			int copt = dog.customerOptions();	
			switch(copt) {
			case 1:
	        	dog.outputMessage(cat.browseItems());
	          break;
	        case 2:
	        	dog.outputMessage(cat.addToShoppingCart());
	          break;
	        case 3:
	        	dog.outputMessage(cat.purchaseItems());
	          break;
	        
	}
		}
		else if (usertype==2) {
			char newuser = dog.checkNewUser();
			System.out.println("Welcome Administrator");
			if (newuser == 'y') {
				dog.displayMessage(uname,cat.customerRegister());
				dog.displayMessage(username,cat.employerLogin());
			}
			else if (newuser == 'n'){
				dog.displayMessage(username,cat.employerLogin());
			}
			
			else {
			throw new IllegalArgumentException("Invalid Choice: Please enter 'y' or 'n'");
			}
			int copt = dog.employerOptions();
			switch(copt) {
				case 1:
					dog.outputMessage(cat.browseItems());
				  break;
				case 2:
					dog.outputMessage(cat.addToShoppingCart());
				  break;
				case 3:
					dog.outputMessage(cat.purchaseItems());
				  break;

			}
			
	        	
	        
		}

    }
    catch(NumberFormatException ex){
		
		System.out.println(ex);
    	
    }
    }
    }
}
