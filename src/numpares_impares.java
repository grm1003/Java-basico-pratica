
public class numpares_impares {
	public static void main(String[] args) {
		double multiplicacao = 1;
		double soma = 0;
		
		for (double i=1; i < 30; i++) {
			if(i%2 ==0) {
				multiplicacao *= i;
			}
			
			else {
				soma += i;
			}		
		}	
		System.out.println("SOMA "+soma);
		System.out.println("MULTIPLICAÇÂO "+ multiplicacao);
	}
} 
