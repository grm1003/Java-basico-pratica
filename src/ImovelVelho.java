
public class ImovelVelho extends Imovel {
	
	double desconto = 0.97;
	
	public double pegadesconto() {
		return(super.preco - super.preco*desconto);
		
	}
}