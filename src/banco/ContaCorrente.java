package banco;

public class ContaCorrente {
	public double saldo = 0.00;
	public double chequeEspecial = 1000;
	public String titular;
	public String agencia;
	public String nrConta;
	public String banco;

	public void depositar(double valor) {
		this.saldo += valor;

	}

	public String exibirSaldo() {
		String saldoFormat;
		saldoFormat = String.format("R$ %7.2f", this.saldo);
		return saldoFormat;
	}

	private boolean verificarSaldo(double valor) {
		return valor <= (this.saldo + this.chequeEspecial);
	}

	public boolean sacar(double ValorSaque) {
		if (verificarSaldo(ValorSaque)) {
			this.saldo -= ValorSaque;
			return true;
		}
		return false;
	}
	
	public boolean transferir(double valor, ContaCorrente destino) {
		if (verificarSaldo(valor)) {
			this.saldo -= valor;
			destino.saldo += valor;
			return true;
		}
		return false;
	}

}
