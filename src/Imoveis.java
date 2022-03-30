
public class Imoveis {
	public static void main(String[] args) {
		Imovelnovo casacuritiba = new Imovelnovo();
		casacuritiba.endereco = "Rua Paris,100,Bacaxiri";
		casacuritiba.preco = 1500000;
	
		System.out.println(casacuritiba.pegaAdicional());
  
		ImovelVelho casasaopaulo = new ImovelVelho();
		casasaopaulo.endereco = "Rua Brasil,360, Maria Helena";
		casasaopaulo.preco = 3000000;
  
		System.out.println(casasaopaulo.pegadesconto());
	}
}
