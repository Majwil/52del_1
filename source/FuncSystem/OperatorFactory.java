package FuncSystem;
import java.util.*;
import DataSystem.*;

public class OperatorFactory {
		List personList = new ArrayList();
		
	OperatorFactory()
	{
		
		
	}
	
	
	OperatorFactory(int amount){
		
		for(int i = 0; i < amount; i++)
		{
			personList.add(new Operatoer(i+11,FunctionalityController.interfaceLayer.));
		}
	}
	
}
