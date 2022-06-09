import java.util.Scanner;

public class Numeroprimo {
	public static void main(String[] args) {
		System.out.println("Digite seu numero aqui");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] array = str.split(" ");
		// pega sempre o primeiro numero inteiro digitado
		int number = Integer.parseInt(array[0]);
		
		//para saber se o numero e primo ou nao
		if(number%2 == 0|number%3 ==0|number%5 ==0|number%7 ==0) {
			System.out.println("Seu numero nao e primo");
		}
		else {
		System.out.println("Esse numero e um numero primo");
		}
		
		
		//para saber de que o numero e multiplo
		if(number%2 == 0) {
			System.out.println(" ele e par");
		}
		
		if(number%3 ==0) {
			System.out.println(" ele e multiplo de 3");
		}
		
		if(number%5 ==0) {
			System.out.println(" ele e multiplo de 5");
		}
		
		if(number%7 ==0) {
			System.out.println(" ele e multiplo de 7");
		}
		

	}
}