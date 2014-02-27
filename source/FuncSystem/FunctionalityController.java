package FuncSystem;

import java.util.*;

import DataSystem.OperatoerDTO;
import InterfaceSystem.InterfaceDef;

public class FunctionalityController implements IOperatoerDAO{

	public static InterfaceDef TUI = new InterfaceDef();
	
public FunctionalityController(){
	
	new OperatorFactory(TUI.printAmountOfUsers());
	
}
	public void run(){
		
	int choice = 0;
	
	while(choice != 4){
	choice = TUI.printMenuChoice();
	
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
			TUI.printEscape();
			break;
		default:
			TUI.printErrorChoice();
			break;
		}
	}
}

	public void superAdminLogin() {
//TODO Login 
		
		switch(TUI.printGetUsername()){
		case "admin": 
			superAdminMenu();
			break;
		default:
			TUI.printWrongPassword();
			break;
		}
		
	}

	public void superAdminMenu() {
		TUI.printAdminWelcome(10); // print a welcome message
		
			switch(TUI.printAdminChoice())
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

		
		double tryLogin = TUI.printGetInitPassword();
		
		for(int i = 0; i < OperatorFactory.personList.size(); i++){ //TODO, get a user amount
			if(tryLogin == OperatorFactory.personList.get(i).getInitialPassword())
			{
				UserMenu(OperatorFactory.personList.get(i));
			}
			else
			{
				TUI.printWrongPassword(); // GET THE FUCK TO INTERFACEDEF NIGGA
				UserLogin();
			}
		}
		
		// hente hans brugernavn
		// spørger om password
		// hvis password er korrekt i forhold til brugernavn -> kør usermenu
	}
	
	public void UserMenu(OperatoerDTO bruger) {
		
		//this is the proces of changing your password as a user.
			while(TUI.printEnterId() != bruger.getId()){ 
				System.out.println("Wrong ID. Please try again..");
			}
			
			while(TUI.printChangeOldPassword() != bruger.getInitialPassword())
			{
				System.out.println("Try again..");
			}
			
			String pw = TUI.printChangePassword();
			
			if(pw == TUI.printChangePassword())
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
