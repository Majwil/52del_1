package DataSystem;

public class OperatoerDTO {
	
		int oprId;
		String oprNavn;
		String cpr;
		int initialPassword;
		String password;
		
		public OperatoerDTO(int pId, String pNavn, String pCpr, int d)
		{
			this.oprId = pId;
			this.oprNavn = pNavn;
			this.cpr = pCpr;
			this.initialPassword = d;
		}
				
		public double initialPassword(){
			
			return initialPassword;
		}

		public void setPassword(String pass){
			this.password = pass;
		}
				
		public int getInitialPassword(){
			return this.initialPassword;
		}
				
		public int getId(){
			return oprId;
		}

}
