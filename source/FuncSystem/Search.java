package FuncSystem;
import java.util.*;
public class Search {


public int IdSearch()
{
//	int id = FunctionalityController.TUI.searchId();
	int id = 2;
//	int [] tempIdList = new int [OperatorFactory.personList.size()];
	int [] tempIdList = new int [10];
	
	for (int i = 0; i<tempIdList.length; i++)	{
		
		tempIdList[i] = i;
		
//		tempIdList[i] = OperatorFactory.personList.get(i).getId();
	}
	
	int	p = tempIdList.length/2, k = 0;
	
	try{
		while(true){
			
			k = p;
			if(tempIdList[p]==id){
				
				break;
			}
			
			else if(tempIdList[p]<id){
				p = p + ((tempIdList.length-p)/2); 
				if(k==p) {
					FunctionalityController.TUI.printNotExist();
					break;
					
				}
			}
			
			else{
				p = (p-k)/2+k;
				if(k==p){
					FunctionalityController.TUI.printNotExist();
					break;
				}
			}
			
		}
		System.out.println(p);
		return p;
	}
	
	catch (Exception e)	{
		FunctionalityController.TUI.printNotExist();
	}
		return 0;
	}

	
}