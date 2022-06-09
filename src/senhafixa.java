import java.io.IOException;
import java.util.Scanner;

public class senhafixa {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int input;
		int senha = 2002;
		input = sc.nextInt();
		
		while (input != senha){
			System.out.println("Senha Invalida");
			input = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");

	}
}



