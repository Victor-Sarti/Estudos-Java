package EstruturaDados;
import java.util.Arrays;
public class Vetor {

	

		private String[] elementos;
		private int tamanho;

		public Vetor(int capacidade) {
			this.elementos = new String[capacidade];
			this.tamanho = 0;
		}

		public void adicionar(String elemento) throws Exception {
			if (this.tamanho < this.elementos.length) {
				this.elementos[this.tamanho] = elemento;
				this.tamanho++;
			} else {
				throw new Exception(" O valor já está cheio," + "não é possivel adicionar elementos");

			}

		}

		public int tamanho() {
			return this.tamanho;
		}

		@Override
		public String toString() {
			StringBuilder s = new StringBuilder();
			for (int i = 0; i < this.tamanho - 1; i ++) {
				s.append(this.elementos[i]);
				s.append(",");
			}
			if (this.tamanho >0) {
				s.append(this.elementos[this.tamanho -1 ]);
			}
			s.append("]");
			return s.toString();
		}
		
		public String busca (int posicao) throws Exception{
			if (posicao >= 0 && posicao < tamanho) {
				return elementos[posicao];
			}else {
				throw new Exception("Posição Inválida");
			}
		}

		public int busca1(String elemento) {
			for (int i=0; i<tamanho; i++) {
				if (elementos[i].equals(elemento)) {
					return i;
				}
			}
			return -1;
		}
	}

