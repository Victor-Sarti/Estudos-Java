package banco;

public class TesteConta {
	public static void main(String[] args) {

		// Criando conta
		ContaCorrente c1 = new ContaCorrente();
		c1.banco = "Bradesco";
		c1.agencia = "0120";
		c1.nrConta = "1548-5";
		c1.titular = "Sarti";
		c1.depositar(500);
		System.out.println(c1.exibirSaldo());
		if(c1.sacar(80)) {
			System.out.println("Saque realizado com sucesso");
		}else {
			System.err.println("NÃO FOI POSSIVEL REALIZAR O SAQUE");
		}
		System.out.println(c1.exibirSaldo());
	
	ContaCorrente c2 = new ContaCorrente();
	c2.banco = "Bradesco";
	c2.agencia = "0120";
	c2.nrConta = "1548-5";
	c2.titular = "Victor";
	
	System.out.println(c1.exibirSaldo());
	System.out.println(c2.exibirSaldo());
	c1.transferir(100, c2);
	System.out.println(c1.exibirSaldo());
	System.out.println(c2.exibirSaldo());
	}
}
