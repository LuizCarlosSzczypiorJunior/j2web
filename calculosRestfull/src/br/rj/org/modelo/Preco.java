package br.rj.org.modelo;

public class Preco {
    private double valor;
    private double valor_desconto;
    private double desconto;
    private double percentual;

    
    public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getValor_desconto() {
		return valor_desconto;
	}
	public void setValor_desconto(double valor_desconto) {
		this.valor_desconto = valor_desconto;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public double getPercentual() {
		return percentual;
	}
	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}
}
