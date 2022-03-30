import java.util.Scanner;

public class contadordecrescente {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int numero =  Integer.parseInt(str);
		for ( int i = numero; i>=0; i--) {	
		System.out.println(i);
		}
	}
}
