package Agosto2024;

public class vetor {

		private String[] elementos;
		private int tamanho;
		
		public vetor(int capacidade) {
		 this.elementos = new String[capacidade];
		 this.tamanho = 0 ;
		 }
		public void adicionar(String elemento) throws Exception{
			if(this.tamanho < this.elementos.length) {
				this.elementos[this.tamanho] = elemento;
				this.tamanho++;
			}else {
				throw new Exception(" O valor já está cheio," +"não é possivel adicionar elementos");
				
			}
			
		}
		
		public int tamanho() {
			return this.tamanho;
		}
		
}
