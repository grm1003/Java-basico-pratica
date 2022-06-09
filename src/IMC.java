import java.util.Scanner;

public class IMC {
	
	public static void main(String[] args) {
	System.out.println("Digite seu peso");
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	String[] array = str.split(" ");
	double peso = Double.parseDouble(array[0]);
	
	
	System.out.println("Digite sua altura");
	Scanner h = new Scanner(System.in);
	String d = h.nextLine();
	String[] lista = d.split(" ");
	double altura = Double.parseDouble(lista[0]);
	
	double imc = (peso/(altura*altura));
	
	System.out.println("Seu IMC é de " + imc);
	}
	

}
