package FuncSystem;

import java.util.List;

import DataSystem.OperatoerDTO;

public interface IOperatoerDAO {
	
		OperatoerDTO getOperatoer(int oprId) throws DALException;
		List<OperatoerDTO> getOperatoerList() throws DALException;
		void createOperatoer(OperatoerDTO opr) throws DALException;
		void updateOperatoer(OperatoerDTO opr) throws DALException;
		
// todo : Express DALException
}
