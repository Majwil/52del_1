package LoginSystem;

import java.util.*;

public class LoginController implements IMenu{


	public void globalLogin() {
		
		Scanner lol = new Scanner(System.in);
		int userType = 0;
		System.out.println("Enter Username: ");
		// run recognition function and return 0-1-2 for the different types of users (0 = superadmin, 1 = admin, 2 = user)
		switch(userType){
		case 0:
			//super admin
			break;
		case 1:
			//admin
			break;
		case 2:
			//user
			break;
		}
		// sausages
		lol.close();
	}

	public void superAdminMenu() {
		
	}

	public void adminMenu() {
		
	}

	public void UserMenu() {
		
	}

	
	
	
}
