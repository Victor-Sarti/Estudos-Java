package estruturaDados;

public class VetorTarefasObject {

	public Object [] tarefa;
	public int qnt;
	
	public VetorTarefasObject(int capacidade) {
		this.tarefa = new Object[capacidade];
		this.qnt = 0;
	}
	
	public void adiciona (Object tarefa) throws Exception {
		this.aumentaCapacidade();
		this.tarefa[this.qnt] = tarefa;
		this.qnt++ ;
	}
	
	
	public Object busca (int posicao) throws Exception{
		if (posicao >= 0 && posicao < qnt) {
			return tarefa[posicao];
		}else {
			throw new Exception("Posição Inválida");
		}
	}
	
	
	private void aumentaCapacidade() {
		if( this.qnt == this.tarefa.length) {
			Object[] tarefaNova = new Object[this.tarefa.length * 2];
			for (int i = 0; i < this.tarefa.length; i ++) {
				tarefaNova[i] = this.tarefa[i];
				
			}
			this.tarefa = tarefaNova;
		}
	}
	
	public boolean adiconaInicio (int posicao, Object tarefa) throws Exception{
		this.aumentaCapacidade();
		if (posicao >= 0 && posicao < qnt) {
			for (int i = this.qnt - 1; i >= posicao; i--) {
				this.tarefa[i + 1 ] = this.tarefa[i];
			}
			this.tarefa[posicao] = tarefa;
			this.qnt ++;
		}
		return true;
	}
	
	public void remove (int posicao) throws Exception{
		if (posicao >= 0 && posicao < qnt) {
			for (int i = posicao; i < this.qnt -1; i++) {
				this.tarefa[i] = this.tarefa[i+1];
			}
			this.tarefa [qnt] = null;
			this.qnt--;
		}else {
			throw new Exception("Posição Inválida");
		}
	}
	
	public String listar() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.qnt; i++) {
            sb.append(tarefa[i]).append("\n");
        }
        return sb.toString();
    }
	
	public enum Acao {
	    ADICIONAR,
	    ADICIONAR_INICIO,
	    BUSCAR,
	    REMOVER,
	    LISTAR
	}
}
	

