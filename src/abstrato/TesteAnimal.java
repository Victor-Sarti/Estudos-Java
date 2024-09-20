package abstrato;

import javax.swing.JOptionPane;

public class TesteAnimal {
	public static void main(String[] args) {
		Cachorro rex = new Cachorro();
		
		System.out.println(rex.getTipoanimal());
		JOptionPane.showInputDialog(null, "Escolha um tipo", null, 0, null, TipoAnimal.values(), null );
	}

}
