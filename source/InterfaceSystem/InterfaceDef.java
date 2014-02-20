package InterfaceSystem;
import java.util.*;

public class InterfaceDef {
	
	Scanner scanData = new Scanner(System.in);
	
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
	
}
