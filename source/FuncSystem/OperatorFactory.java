package FuncSystem;
import java.util.*;
import DataSystem.*;
import java.lang.Math;

public class OperatorFactory {
	
	
	protected static List<OperatoerDTO> personList = new ArrayList<OperatoerDTO>();
		
	
	OperatorFactory(int amount){
		for(int i = 0; i < amount; i++)
		{
			personList.add(new OperatoerDTO(i+11,FunctionalityController.TUI.printEnterData("name"),FunctionalityController.TUI.printEnterData("cpr"), Math.random()*10));	
		}
	}
}

// CS:JOE, Doto
