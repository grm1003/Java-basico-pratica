// Escreva um programa que leia dois n�meros e exiba mensagem informando
//o valor do maior n�mero e o valor do menor n�mero. Se os dois n�meros forem iguais
//, o programa deve exibir mensagem informando este fato

import java.util.Scanner;
public class comparador {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] array = str.split(" ");
		int prim = Integer.parseInt(array[0]);
		int seg  = Integer.parseInt(array[1]);
		if (prim > seg) {
			System.out.println("o primeiro numero � maior, o maior numero � " + prim + " e do menor " + seg );
		}
		if (prim < seg) {
			System.out.println("o segundo numero � maior, o maior numero � " + seg + " e do menor " + prim);
		}
		if (prim == seg) {
			System.out.println("os n�meros tem o mesmo valor, " + prim + " = " + seg);
		}
	}
}