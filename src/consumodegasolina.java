
import java.util.Scanner;

public class consumodegasolina {

	public static void main(String[] args) {
		System.out.println("Digite a quantidade de horas de viagem e a velocidade(Km/H):");
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int v = sc.nextInt();
		double deslocamento = t * v;

		double quantidadedelitros = deslocamento / 12;

		System.out.printf("%.3f\n", quantidadedelitros);

	}
}