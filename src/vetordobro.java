import java.util.Scanner;

public class vetordobro {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int I = sc.nextInt();
		int N [] = new int[10];
		int c;
	
		if(I <=50 ){
			
			N[0] = I;
			
			for(c=1;c<10;c++){
				N[c]= N[c-1]*2;
			}
			
			for(c=0;c<10;c++) {
				System.out.println("N["+c+"] = " + N[c]);
			}
			
	}
}}
