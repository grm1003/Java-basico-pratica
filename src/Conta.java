public class Conta {
	double saldo;
	
	public boolean sacar(double valor) {
		if (this.saldo >= (valor*1.005)) {
			this.saldo -= (valor*1.005);
			return true;
		} else {
			return false;
		}
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public double pegaSaldo() {
		return this.saldo;
	}
}
