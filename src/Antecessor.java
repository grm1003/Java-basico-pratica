import java.util.Scanner;

public class Antecessor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int antecessor = (Integer.parseInt(str)- 1);
		int sucessor = (Integer.parseInt(str)+ 1);
		System.out.println(antecessor);
		System.out.println(sucessor);
	}
}
