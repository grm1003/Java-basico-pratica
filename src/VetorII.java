
import java.util.Scanner;

public class VetorII {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int I = sc.nextInt();
		int N [] = new int[1000];
		int c, v = 0;
		
		while(v < 999) {
			for(int g = 0; g < I; g++) {
				if (v > 999) break;
				N[v]= g;
				v++;
				
			}
			
		}
		
			for(c=0;c< N.length;c++) {
				System.out.println("N["+c+"] = " + N[c]);
			}
		
	}
}