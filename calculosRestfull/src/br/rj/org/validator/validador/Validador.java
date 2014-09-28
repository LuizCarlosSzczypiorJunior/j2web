package br.rj.org.validator.validador;

import java.lang.reflect.Method;

public class Validador extends AbstractValidator {
	
	public static boolean valida(Object obj){
		 Class<?> classe = obj.getClass();
	        for (Method method : classe.getDeclaredMethods()){
	        	method.setAccessible(true);
	           // if (method.isAnnotationPresent(String2Integer.class))
	        }
		return true;
	}

	@Override
	public boolean validar(Object wrapper) {
		return false;
	}
	
	
	
}

  


