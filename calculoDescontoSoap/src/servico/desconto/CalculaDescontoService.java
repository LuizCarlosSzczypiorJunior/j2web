package servico.desconto;

import servico.factory.DescontoFactory;
import servico.model.desconto.IDesconto;

public class CalculaDescontoService {

 private IDesconto desconto;

 private IDesconto getDesconto() {
	return getInstance();
}

	
private  IDesconto getInstance(){
	if(desconto==null)
		return  (desconto=DescontoFactory.getDesconto()); 
	  else 
		  return desconto;
}	

public double calculaDesconto(double preco,double percentual){
	return getDesconto().calcularDesconto(preco, percentual);
	
}
}
