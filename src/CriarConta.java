
public class CriarConta {

	public static void main(String[] args) {
		
		Conta brianConta = new Conta();
		brianConta.deposita(200);
		System.out.println(brianConta.pegaSaldo());
		System.out.println(brianConta.sacar(100));
		System.out.println(brianConta.sacar(100));
		System.out.println(brianConta.pegaSaldo());
	}
}
