package biblioteca;

public class Livro {
	private String isbn;
	private String titulo;
	private String dataLancamento;
	private String edicao;
	private String numPaginas;
	
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDataLancamento() {
		return dataLancamento;
	}
	
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	
	public String getEdicao() {
		return edicao;
	}
	
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	
	public String getNumPaginas() {
		return numPaginas;
	}
	
	public void setNumPaginas(String numPaginas) {
		this.numPaginas = numPaginas;
	}
	
}
