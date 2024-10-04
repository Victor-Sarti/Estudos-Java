package bancoInterface;

public class Teste {
public static void main(String[] args) {
	OperacoesBancarias conta = new ContaBancaria();
	conta.depositar(150);
	conta.sacar(50);
	System.out.println(conta.consultarSaldo());
}
}
