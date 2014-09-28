package servico.model.desconto;

public class Desconto implements IDesconto {

	@Override
	public double calcularDesconto(double preco, double percentual) {
		return ( preco - ( (preco/100) * percentual )  );
	}

}
