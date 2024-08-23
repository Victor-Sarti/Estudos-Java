package banco;

public class TesteBanco {
public static void main(String[] args) {
	Cliente c1 = new Cliente();
	c1.nome = "Sarti";
	c1.cpf = "523.060.111-36";
	
	ContaCorrente cont1 = new ContaCorrente();
	cont1.nrConta = "0120-5";
	cont1.agencia = "777";
	cont1.titular = c1;
	
	ContaCorrente cont2 = new ContaCorrente();
	cont2.nrConta = "0499-5";
	cont2.agencia = "444";
	cont2.titular = c1;
	
	c1.nome = "Bruno";
	c1 = null;
	System.out.println(cont1.titular.nome);
	System.out.println(cont2.titular.nome);

	
	
}
}
