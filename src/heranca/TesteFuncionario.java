package heranca;

import java.util.List;

import javax.swing.JOptionPane;

import java.util.ArrayList;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Engenheiro();
		Funcionario f2 = new Engenheiro();
		f1.setMatricula("1234");
		f2.setMatricula("1234");
		
		List<Funcionario> funcs = new ArrayList<Funcionario>();
		
		Contador c1 = new Contador();
		c1.setMatricula("5678");
		Contador c2 = new Contador();
		c2.setMatricula("7815");
		Contador c3 = new Contador();
		c3.setMatricula("8954");

		funcs.add(c1);
		funcs.add(c2);
		funcs.add(c3);

		Contador c4 = new Contador();

		c4.setMatricula("5678");

		JOptionPane.showMessageDialog(null, funcs.contains(c4));
	}
}
