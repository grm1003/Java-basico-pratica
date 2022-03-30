import java.util.Scanner;

public class tabuada {
	public static void main(String[] args) {
		Scanner tabuada = new Scanner(System.in);
		String str = tabuada.nextLine();
		int numero = Integer.parseInt(str);
		for (int i = 1;i<11;i++){
			System.out.println(numero*i);
		}
	}
}
