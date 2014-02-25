package FuncSystem;

import java.util.*;

import DataSystem.OperatoerDTO;
import InterfaceSystem.InterfaceDef;

public class FunctionalityController implements IOperatoerDAO{

	public static InterfaceDef interfaceLayer = new InterfaceDef();
	
public FunctionalityController(){
	
	new OperatorFactory(interfaceLayer.printAmountOfUsers());
	
}
	public void run(){
		
	int choice = 0;
	
	while(choice != 4){
	choice = interfaceLayer.printMenuChoice();
	
		switch(choice){
		case 1:
			superAdminLogin();
			break;
		case 2:
			UserLogin();
			break;
		case 3:
			// Test Shit 
			break;
		case 4:
			interfaceLayer.printEscape();
			break;
		default:
			interfaceLayer.printErrorChoice();
			break;
		}
	}
}

	public void superAdminLogin() {
//TODO Login 
		
		switch(interfaceLayer.loginMenu()){
		case "admin": 
			superAdminMenu();
			break;
		default:
			
			break;
		}
		

		// run recognition function and return 0-1-2 for the different types of users (0 = superadmin, 1 = admin, 2 = user)

	}

	public void superAdminMenu() {
		interfaceLayer.printAdminWelcome(10); // print a welcome message
		
			switch(interfaceLayer.printAdminChoice())
			{
			case 1:
				//TODO show members
				break;
			case 2:
				//TODO Manipulate function 
				break;
			}
		
	}
	
	public void adminMenu() {
		
	}
	
	public void UserLogin() {

		
		double tryLogin = interfaceLayer.printGetInitPassword();
		
		for(int i = 0; i < OperatorFactory.personList.size(); i++){ //TODO, get a user amount
			if(tryLogin == OperatorFactory.personList.get(i).getInitialPassword())
			{
				UserMenu(OperatorFactory.personList.get(i));
			}
			else
			{
				interfaceLayer.printWrongPassword(); // GET THE FUCK TO INTERFACEDEF NIGGA
				UserLogin();
			}
		}
		
		// hente hans brugernavn
		// spørger om password
		// hvis password er korrekt i forhold til brugernavn -> kør usermenu
	}
	
	public void UserMenu(OperatoerDTO bruger) {
		
		//this is the proces of changing your password as a user.
			while(interfaceLayer.printEnterId() != bruger.getId()){ 
				System.out.println("Wrong ID. Please try again..");
			}
			
			while(interfaceLayer.printChangeOldPassword() != bruger.getInitialPassword())
			{
				System.out.println("Try again..");
			}
			
			String pw = interfaceLayer.printChangePassword();
			
			if(pw == interfaceLayer.printChangePassword())
			{
				bruger.setPassword(pw);
			}
			
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
