import java.util.Scanner;

public class ABCD{
	public static void main(String[] args) {
		int A,B,C,D;
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
			if( B > C && D > A && C + D > A + B && C > 0 && D > 0 && A%2==0) {
		        System.out.printf("Valores aceitos\n");
			}else {
			 	System.out.printf("Valores nao aceitos\n");
			}
	
	}
}
