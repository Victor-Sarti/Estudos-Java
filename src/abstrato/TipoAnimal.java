package abstrato;

public enum TipoAnimal {
	PEIXES ("Peixes", 1),
	REPTEIS("Repteis", 2),
	ANFIBIOS("Anfíbios", 3) ,
	AVES("Aves", 4),
	MAMIFEROS("Mamíferos", 5);
	
	String descricao;
	int ordem;

	
	TipoAnimal(String descricao, int ordem){
		this.descricao = descricao;
		this.ordem = ordem;
	}
	@Override
	public String toString() {

		return descricao;
	}
}
