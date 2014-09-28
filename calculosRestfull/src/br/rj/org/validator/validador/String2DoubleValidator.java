package br.rj.org.validator.validador;

public class String2DoubleValidator extends AbstractValidator {

	@Override
	public  boolean validar(Object object) {
		if(!(object instanceof String))
			return false;
		else
			return 	validar((String)object);
			
	}

	@SuppressWarnings("finally")
	private  boolean validar(final String param){
       boolean isValido =true;
		try {
			 new Double(param);
			} catch (NumberFormatException nfe) {
			    isValido=false;
			}
		    finally{
		          return isValido;
		    }
	}
	
}

