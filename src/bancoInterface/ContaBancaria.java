package bancoInterface;

public class ContaBancaria implements OperacoesBancarias {
	public double saldo;
	
	@Override
	public void sacar (double valor) {
		this.saldo -= valor;
	}
	
	

}
