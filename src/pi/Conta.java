package pi;

public class Conta {
	
	private int numero;
	private double saldo, limite;
	private String nome;
	

	public boolean sacar(double valor) {
		if(saldo + limite > valor) {
			saldo -= valor;
			return true;
		}else {
			System.out.println("Saldo Insuficiente");
			return false;
		}
	}
	
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	
	
	
}
