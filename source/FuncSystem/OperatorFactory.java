package FuncSystem;
import java.util.*;
import DataSystem.*;
import java.lang.Math;

public class OperatorFactory {
	
	protected static List<OperatoerDTO> personList = new ArrayList<OperatoerDTO>();
		
	
	OperatorFactory(int amount){
		for(int i = 0; i < amount; i++)
		{
			String tempName = FunctionalityController.interfaceLayer.printEnterData("name");
			
			personList.add(new OperatoerDTO(i+11,tempName,FunctionalityController.interfaceLayer.printEnterData("cpr"), Math.random()*10));	
		}
		
	}

	
}
