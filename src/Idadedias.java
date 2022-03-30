import java.util.*;

public class Idadedias {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] array = str.split(" ");
		int dias = 0;
		for (int i = 0; i < array.length;i++) {
			if(array[i].equals("meses")|| array[i].equals("mês")) {
				dias += (Integer.parseInt(array[i-1]))*30;
			}
			if(array[i].equals("anos")|| array[i].equals("ano")) {
				dias += (Integer.parseInt(array[i-1]))*365;
			}
		}
		System.out.println(dias);
	}
}
	