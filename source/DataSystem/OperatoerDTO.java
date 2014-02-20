package DataSystem;

public class OperatoerDTO {
	
		int oprId;
		String oprNavn;
		String ini;
		String cpr;
		String password;
	
		
		public boolean IdCompare(int pId)
		{
			if(pId == this.oprId)
			{
				return true;
			}
			else{
				return false;
			}
		}
		
}
