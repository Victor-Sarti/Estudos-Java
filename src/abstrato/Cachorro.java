package abstrato;

public class Cachorro extends Animal{

	public Cachorro() {
		this.setTipoanimal(TipoAnimal.MAMIFEROS);
	}
	
	@Override
	public void falar() {
		System.out.println("Au Au");
	}
	
}

