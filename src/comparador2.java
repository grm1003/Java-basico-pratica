import java.util.Scanner;
public class comparador2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] array = str.split(" ");
		int prim = Integer.parseInt(array[0]);
		int seg  = Integer.parseInt(array[1]);
		if (prim > seg) {
			System.out.println("o primeiro numero � maior");
		}
		if (prim < seg) {
			System.out.println("o segundo numero � maior");
		}
		if (prim == seg) {
			System.out.println("os n�meros tem o mesmo valor");
		}
	}
}
