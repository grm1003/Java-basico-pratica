
public class Imovelnovo extends Imovel {

	double adicional = 1.05;
	
	public double pegaAdicional() {
		return (super.preco*this.adicional - super.preco) ;
	}	
	
}
