package FuncSystem;

import java.util.*;

import DataSystem.OperatoerDTO;
import InterfaceSystem.InterfaceDef;

public class FunctionalityController implements IOperatoerDAO{

	public static InterfaceDef interfaceLayer = new InterfaceDef();
	List <OperatoerDTO> mainList;
	
public FunctionalityController(){
	
	OperatorFactory theList = new OperatorFactory(interfaceLayer.printAmountOfUsers());
	
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
			// User login Løjmand + Johnny
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
