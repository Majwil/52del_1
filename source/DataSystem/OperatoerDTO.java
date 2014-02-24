package DataSystem;

public class OperatoerDTO {
	
		int oprId;
		String oprNavn;
		String cpr;
		String password;
		
		public OperatoerDTO(int pId, String pNavn, String pCpr, String pPassword)
		{
			this.oprId = pId;
			this.oprNavn = pNavn;
			this.cpr = pCpr;
			this.password = pPassword;
		}
		
		
		
}
