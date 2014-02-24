package InterfaceSystem;
import java.util.*;

public class InterfaceDef {
	
	Scanner scanData = new Scanner(System.in);
	
	public String loginMenu()
	{
		System.out.println("Please enter Username:");
		return scanData.nextLine();	
	}
	
	public String printEnterData(String pChoice)
	{
		switch(pChoice){
		case "name":
			System.out.println("Please enter name of user: ");
			break;
		case "cpr":
			System.out.println("Please enter CPR: ");
			break;
		}
		
		return scanData.nextLine();
	}
	
	public void printAdminWelcome(int Id)
	{
		System.out.println("Welcome, SuperAdmin!\nYour ID is: "+Id+"...");
	}
	
	public int printAdminChoice()
	{
		System.out.println("What would you like to do?");
		System.out.println("1.Show Members \n2. Manipulate");
		
		return scanData.nextInt();
	}
	
	public int printMenuChoice() // make a choice considering the login options
	{
		System.out.println("Choose which type of menu you'd like.");
		System.out.println("1. SuperAdmin Login\n2. User Login\n3. Test Shit\n4. Quit");
		
		return scanData.nextInt();
	}
	
	public void printErrorChoice()
	{
		System.out.println("");
	}
	
	
}
