package Day4;

public class ValidationManager implements IValidation {

	@Override
	public  boolean validate(String tcno) {
		if(tcno.length() == 11 ) {
				return true;
				
			}
			return false;
	}
	
	

}
