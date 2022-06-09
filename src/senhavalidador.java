import java.util.Scanner;

public class senhavalidador {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] array = str.split(" ");
		var  senha = "1";
		String validator = array[0];
		if( senha == validator.intern()){
			System.out.println("Acesso permitido");
		}else {
			System.out.println("Senha incorreta");
		}
	}}
		
	
	

