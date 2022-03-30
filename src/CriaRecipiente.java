

public class CriaRecipiente {
	 public static void main(String[] args) {
		 recipiente piscina = new recipiente();
		    
		 	System.out.println("litros");
		    System.out.println(piscina.mparalitro(1890));
		    System.out.println(piscina.mparapescubicas(1890));
		    System.out.println(piscina.litroparacm(piscina.mparalitro(1890)));
		    
		    }
}



