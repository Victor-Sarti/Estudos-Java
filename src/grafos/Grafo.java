package grafos;

import java.util.ArrayList;

public class Grafo <TIPO> {
	
	private ArrayList<Vertice<TIPO>>vertices;
	private ArrayList<Aresta<TIPO>> arestas;
	
	
	public Grafo() {
		this.vertices = vertices;
		this.arestas = arestas;
	}
	
	public void adicionarVertice( TIPO dado) {
		Vertice<TIPO> novoVertice = new Vertice<TIPO>(dado);
		this.vertices.add(novoVertice);
	}
	

	
	
	
}
