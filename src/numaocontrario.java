import java.lang.reflect.Array;
import java.util.Scanner;

public class numaocontrario {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String numero = s.nextLine();
	    String[] array = numero.split(" ");
	    String output ="a";
	   for(int i = numero.length(); i>=0; i--) {
		 for(int c = 0; c >= array.length; c++){
		   String aux = array[c];
		   array[i]  = array[c];
		   aux = array[i];
		   }
	   }
	   for(int c = 0; c >= array.length; c++){
		  output += array[c];
	System.out.println(array[c]);
	   }
	   
	
	   
	
	}
}
