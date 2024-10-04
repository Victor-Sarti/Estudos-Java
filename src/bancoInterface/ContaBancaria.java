package bancoInterface;

public class ContaBancaria implements OperacoesBancarias, ValidacaoDeSaldo{
	public double saldo;
	
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

}
