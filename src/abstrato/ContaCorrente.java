package abstrato;

public class ContaCorrente extends ContaBancaria {
	double limite;

	public void sacar(double valor) {
		if (this.getSaldo() + limite >= valor) {
			this.setSaldo(this.getSaldo() - valor);
		}
	}
}
