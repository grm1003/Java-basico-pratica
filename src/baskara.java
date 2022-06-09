
import java.util.Scanner;
import java.lang.Math;

public class baskara {
	public static void main(String[] args) {
	    double a,b,c;
		Scanner sc = new Scanner(System.in);
	    a = sc.nextDouble();
	    b = sc.nextDouble();
	    c = sc.nextDouble();
	    double delta2 = Math.pow(b, 2) - 4*a*c;
	    double delta = Math.sqrt(delta2);
	    double R1 = (-b + delta)/(2*a);
	    double R2 = (-b - delta)/(2*a);
	    
	    if(delta2 < 0 || (2*a) == 0) {
	    	System.out.printf("Impossivel calcular\n");
	    }else {
	    	System.out.printf("R1 = %.5f\n",R1);
	    	System.out.printf("R2 = %.5f\n",R2);
	    }
	}  
}
