import java.util.Scanner;

public class Leitor {
	
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
    String[] array = str.split(" ");
    int a = Integer.parseInt(array[0]);
    int b = Integer.parseInt(array[1]);
    int soma = a + b;
    int subtracao = a - b;
    System.out.println("a soma desses n�mero � "+ soma);
    System.out.println("a subtra��o desses n�mero � "+ subtracao);
    
    
    
    // public  int soma() {
	//	  int soma = a + b;
	//	  return soma;
	//  }
     
    // public int subtracao(){
	//	  int subtracao = a - b;
	//	  return subtracao;
	// }
		
	}
}

