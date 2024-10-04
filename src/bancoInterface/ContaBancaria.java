package bancoInterface;

public class ContaBancaria implements OperacoesBancarias, ValidacaoDeSaldo{
	public double saldo;
	String a;
	@Override
	public boolean validar (double valor) {
		return saldo >=  valor;
	}
	
	@Override
	public void sacar (double valor) {
		this.saldo -= valor;
	}
	
	@Override
	public void depositar (double valor) {
		this.saldo += valor;
	}
	
	@Override
	public double consultarSaldo () {
		return saldo;
	}
	
	@Override
	public void transferir (double saldo, OperacoesBancarias destino) {
	this.sacar(saldo);
	destino.depositar(saldo);
	}

}
