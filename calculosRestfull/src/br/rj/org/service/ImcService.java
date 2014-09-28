package br.rj.org.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.rj.org.factory.Factory;
import br.rj.org.negocio.facade.Iimc;
import br.rj.org.validator.validador.String2DoubleValidator;


@Path("calculoimc")
public class ImcService {
	private Iimc      iimc ;
    
    private  void getInstance(){
    	if(iimc==null)
    		setIimc(Factory.getCalculos());
    }
    
	 public Iimc getIimc() {
		 getInstance();
		 return iimc;
		}
	 public void setIimc(Iimc iimc) {
			this.iimc = iimc;
		}
	
 @GET
 @Path("/imc/{peso}/{altura}")
 @Produces(MediaType.TEXT_PLAIN)
 public String imc(@PathParam("peso") String peso ,@PathParam("altura") String altura) {
	String resposta="";
	if(!new String2DoubleValidator().validar(peso))
		resposta="peso informado invalido!";
	else
		if(!new String2DoubleValidator().validar(altura))
			resposta="altura informada invalida!";
		else
		   resposta=	new Double(getIimc().calculaImc(Double.parseDouble(peso), Double.parseDouble(altura))).toString();
	return resposta;
 }
}
