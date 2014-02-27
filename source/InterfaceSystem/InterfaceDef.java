package InterfaceSystem;
import java.util.*;

public class InterfaceDef {
	
	Scanner scanData;
	
	public InterfaceDef()
	{
		scanData = new Scanner(System.in);
	}

	public String printEnterData(String pChoice){
	
		switch(pChoice){
		case "cpr":
			System.out.println("Please enter CPR: ");
			break;
		case "name":
			System.out.println("Please enter name of user: ");
			break;
		}
		
		
		return scanData.nextLine();
	}
		
	public void printAdminWelcome(int Id){
	
		System.out.println("Welcome, SuperAdmin!\nYour ID is: "+Id+"...");
	}
	
	public int printAdminChoice(){
	
		System.out.println("What would you like to do?");
		System.out.println("1.Show Members \n2. Manipulate");
		
		return scanData.nextInt();
	}
	
	public int printMenuChoice(){ // make a choice considering the login options
		
		System.out.println("Choose which type of menu you'd like.");
		System.out.println("1. SuperAdmin Login\n2. User Login\n3. Test Shit\n4. Quit");
		
		
		return Integer.parseInt(scanData.nextLine());
	}
	
	public void printErrorChoice(){
		System.out.println("Choose again!");
	}
	
	public void printEscape(){
		System.out.println("Exiting...");
	}
	public int printAmountOfUsers(){
		System.out.println("Choose amount of users: ");
		
		return Integer.parseInt(scanData.nextLine());
	
	}
	public String printGetUsername(){
		
		System.out.println("Please enter your username: ");
		return scanData.nextLine();
	}
	
	public double printGetInitPassword(){
		System.out.println("Please enter your password: ");
		return Double.parseDouble(scanData.nextLine());
	}
	
	public String printChangePassword(String pChoice){
		
		switch(pChoice){
		case "new":
			System.out.println("Enter your new password: ");
			return scanData.nextLine();
		case "old":
			System.out.println("Enter your old password: ");
			return scanData.nextLine();
		}
		return "fug";
	}
	
	public int printInitialPassword(){
		System.out.println("Enter your old password: ");
		
		return Integer.parseInt(scanData.nextLine());
	}
	
	public void printWrongPassword(){
		System.out.println("Wrong password.. Try again!");
	
	}
	
	public int printEnterId(){
		System.out.println("Please enter your ID: ");
		return Integer.parseInt(scanData.nextLine());
	}
	public int searchId () 
	{
		System.out.println("Please enter the oprId to search for:");
		
		return scanData.nextInt();
	}
	
	public String searchName () 
	{
		System.out.println("Please enter the username to search for:");
		
		return scanData.nextLine();
	}
	
	public String searchCPR ()
	{
		System.out.println("Please enter the CPR to search for:");
		
		return scanData.nextLine();
	}
	
	public void printSearchResult (String searchResult)
	{
		// TODO få den til at udskrive vores søgeresultat
		
	}
	
	public void printNotExist ()
	{
		System.out.println("This does not exist");
		// TODO få den til at smide tilbage til en eller anden menu		
	}
}
