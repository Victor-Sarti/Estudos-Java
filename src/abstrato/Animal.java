package abstrato;

public abstract class Animal {

	private TipoAnimal tipoanimal;

	public TipoAnimal getTipoanimal() {
		return tipoanimal;
	}

	public void setTipoanimal(TipoAnimal tipoanimal) {
		this.tipoanimal = tipoanimal;
	}

	public abstract void falar();

	@Override
	public String toString() {
		return this.getTipoanimal() + " ";
	}
	
	
}
