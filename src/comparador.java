// Escreva um programa que leia dois números e exiba mensagem informando
//o valor do maior número e o valor do menor número. Se os dois números forem iguais
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
			System.out.println("o primeiro numero é maior, o maior numero é " + prim + " e do menor " + seg );
		}
		if (prim < seg) {
			System.out.println("o segundo numero é maior, o maior numero é " + seg + " e do menor " + prim);
		}
		if (prim == seg) {
			System.out.println("os números tem o mesmo valor, " + prim + " = " + seg);
		}
	}
}