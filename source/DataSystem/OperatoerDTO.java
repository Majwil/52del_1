package DataSystem;

public class OperatoerDTO {
	
		int oprId;
		String oprNavn;
		String ini;
		String cpr;
		String password;
	
		
		OperatoerDTO(int pId, String pNavn, String pIni, String pCpr, String pPassword)
		{
			this.oprId = pId;
			this.oprNavn = pNavn;
			this.ini = pIni;
			this.cpr = pCpr;
			this.password = pPassword;
		}
		
		

}
