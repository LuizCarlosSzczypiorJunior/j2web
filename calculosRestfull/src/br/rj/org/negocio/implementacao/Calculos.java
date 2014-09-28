package br.rj.org.negocio.implementacao;

import br.rj.org.modelo.Imc;
import br.rj.org.modelo.Preco;
import br.rj.org.negocio.facade.IDesconto;
import br.rj.org.negocio.facade.Iimc;

public class Calculos implements Iimc, IDesconto {

	@Override
	public double calculaDesconto(double valor, double percentual) {
		Preco preco=new  Preco();
		
			preco.setValor(valor);
			preco.setPercentual(percentual);
			preco.setDesconto(   ( preco.getValor()/100 )*preco.getPercentual()    );
			preco.setValor_desconto( preco.getValor()-preco.getDesconto() );
		
		return preco.getValor_desconto();
	}

	@Override
	public double calculaImc(double peso, double altura) {
		 Imc imc =new Imc();
		 
			 imc.setPeso(peso);
			 imc.setAltura(altura);
			 imc.setImc( imc.getPeso()/(  imc.getAltura()*imc.getAltura()  )  );
		return imc.getImc();
	}

	
}
