package servico.factory;

import servico.model.desconto.Desconto;

public class DescontoFactory {
public static Desconto getDesconto(){
return new Desconto();	
}
}
