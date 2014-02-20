package FuncSystem;

import java.util.*;

import DataSystem.OperatoerDTO;

public class FunctionalityController implements IOperatoerDAO{


	public void globalLogin() {
		
		
		Scanner lol = new Scanner(System.in);
		int userType = 0;
		System.out.println("Enter Username: ");
		
		switch(lol.nextLine()){
		case "0232it!": 
			System.out.println(":D");
			// run sysadmin
			break;
		default:
			
			break;
		}
		

		// run recognition function and return 0-1-2 for the different types of users (0 = superadmin, 1 = admin, 2 = user)

	}

	public void superAdminMenu() {
		
		
	}
	
	public void adminMenu() {
		
	}
	
	public void UserMenu() {
		
	}
	
	public OperatoerDTO getOperatoer(int oprId) throws DALException {
		// antager at den henter alt operatør data for et vist ID
		
		return null;
	}

	public List<OperatoerDTO> getOperatoerList() throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	public void createOperatoer(OperatoerDTO opr) throws DALException {
		// TODO Auto-generated method stub
		
	}

	public void updateOperatoer(OperatoerDTO opr) throws DALException {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
