package br.rj.org.factory;

import br.rj.org.negocio.implementacao.Calculos;

public class Factory {
   public static Calculos getCalculos(){
	   return new Calculos();
   }
}
