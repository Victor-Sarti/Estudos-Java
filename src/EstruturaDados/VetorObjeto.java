package EstruturaDados;

public class VetorObjeto {
	// Listar Atributos
	
	public Object [] elementos;
	public int tamanho;
	
	//lista de metodos
	
	public VetorObjeto (int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
	}

	public void adiciona (Object elemento) throws Exception {
		this.aumentaCapacidade();
		this.elementos[this.tamanho] = elemento;
		this.tamanho++;
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i = 0; i < this.tamanho - 1; i ++) {
			s.append(this.elementos[i]);
			s.append(",");
		}
		
		if ( this.tamanho > 0) {
			s.append(this.elementos[this.tamanho -1]);
		}
		s.append("]");
		return s.toString();
	}
	
	public Object busca (int posicao) throws Exception{
		if (posicao >= 0 && posicao < tamanho) {
			return elementos[posicao];
		}else {
			throw new Exception("Posição Inválida");
		}
	}
	
	public int busca1(Object elemento) {
		for (int i=0; i<tamanho; i++) {
			if (elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean adiconaInicio (int posicao, Object elemento) throws Exception{
		this.aumentaCapacidade();
		if (posicao >= 0 && posicao < tamanho) {
			for (int i = this.tamanho - 1; i >= posicao; i--) {
				this.elementos[i + 1 ] = this.elementos[i];
			}
			this.elementos[posicao] = elementos;
			this.tamanho ++;
		}
		return true;
	}
	
	
	private void aumentaCapacidade() {
		if( this.tamanho == this.elementos.length) {
			Object[] elementosNovos = new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i ++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	public void remove (int posicao) throws Exception{
		if (posicao >= 0 && posicao < tamanho) {
			for (int i = posicao; i < this.tamanho -1; i++) {
				this.elementos[i] = this.elementos[i+1];
			}
			this.elementos [tamanho] = null;
			this.tamanho--;
		}else {
			throw new Exception("Posição Inválida");
		}
	}
	
}
