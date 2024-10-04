package bancoInterface;

public class Teste {
public static void main(String[] args) {
	OperacoesBancarias conta = new ContaBancaria();
	conta.sacar(50);
	System.out.println(conta);
}
}
