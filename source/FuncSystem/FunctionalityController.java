package FuncSystem;

import java.util.*;

import DataSystem.OperatoerDTO;
import InterfaceSystem.InterfaceDef;

public class FunctionalityController implements IOperatoerDAO{

	public static InterfaceDef interfaceLayer = new InterfaceDef();
	
	public void chooseType(){
		
		//TODO create a type menu
		
		switch(interfaceLayer.printMenuChoice()){
		case 1:
			//SuperAdmin Login menu
			break;
		case 2:
			// User login
			break;
		case 3:
			// Test Shit
			break;
		case 4:
			// Quit shit
			break;
		default:
			
	
		}
	}
	public void globalLogin() {
//TODO Login 
		
		switch(interfaceLayer.loginMenu()){
		case "0232it!": 
			superAdminMenu();
			break;
		default:
			
			break;
		}
		

		// run recognition function and return 0-1-2 for the different types of users (0 = superadmin, 1 = admin, 2 = user)

	}

	public void superAdminMenu() {
		interfaceLayer.printAdminWelcome(0);
		
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
