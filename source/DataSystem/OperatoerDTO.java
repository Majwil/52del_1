package DataSystem;

public class OperatoerDTO {
	
		int oprId;
		String oprNavn;
		String cpr;
		double initialPassword;
		String password;
		
		public OperatoerDTO(int pId, String pNavn, String pCpr, double d)
		{
			this.oprId = pId;
			this.oprNavn = pNavn;
			this.cpr = pCpr;
			this.initialPassword = d;
		}
		
		public void setPassword() // Rasmus + Johnny
		{
			
		}
		
		public double initialPassword(){
			
			return initialPassword;
		}
		
}
