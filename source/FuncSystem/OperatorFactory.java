package FuncSystem;
import java.util.*;

import DataSystem.*;

public class OperatorFactory {
		List<OperatoerDTO> personList = new ArrayList<OperatoerDTO>();
		
	OperatorFactory(int amount){
		
		for(int i = 0; i < amount; i++)
		{
			
			personList.add(new OperatoerDTO(i+11,FunctionalityController.interfaceLayer.printEnterData("name"),FunctionalityController.interfaceLayer.printEnterData("cpr"),"tempPW"));
		
			
		}
	}
	
}
