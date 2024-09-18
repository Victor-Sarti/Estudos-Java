package pi;

public class Conta {
	
	private int numero;
	private double saldo, limite;
	private String nome;
	

	public boolean sacar(double valor) {
		if(saldo+limite>valor) {
			saldo -= valor;
			return true;
		}
		else {
			System.out.print("Saldo Insuficiente! "
				+ "Saque não realizado!");			
			return false;
		}
	}
	
	public boolean transferir(Conta origem, Conta destino, double valor) {
		if((origem.saldo+origem.limite) > valor) {
			origem.saldo -= valor;
			destino.depositar(valor);
			return true;
		}
		else 
			return false;
	}
	
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public void depositar(double valor) {
		saldo += valor;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public String toString() {
		return "Conta [numero= " + numero + ", saldo= " + saldo + ", limite= " + limite + ", nome= " + nome + "]";
	}


	
	
	
	
	
}
