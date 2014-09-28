package br.rj.org.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.rj.org.factory.Factory;
import br.rj.org.negocio.facade.IDesconto;
import br.rj.org.validator.validador.String2DoubleValidator;

@Path("calculodesconto")
public class DescontoService {
   private IDesconto idesc;
    
    private  void getInstance(){
    		if(idesc==null)
    			setIdesc(Factory.getCalculos());	
    }
    
    
    
    
    
	public IDesconto getIdesc() {
		getInstance();
		return idesc;
		}
	public void setIdesc(IDesconto idesc) {
			this.idesc = idesc;
		}

	
	
	
	
 @GET
 @Path("/desconto/{valor}/{percentual}")
 @Produces(MediaType.TEXT_PLAIN)
 public String imc(@PathParam("valor") String valor ,@PathParam("percentual") String percentual) {
	String resposta="";
	if(!new String2DoubleValidator().validar(valor))
		resposta="valor informado invalido!";
	else
		if(!new String2DoubleValidator().validar(percentual))
			resposta="percentual informada invalida!";
		else
		   resposta=	new Double(getIdesc().calculaDesconto(Double.parseDouble(valor), Double.parseDouble(percentual))).toString();
	return resposta;
 }
  

}
