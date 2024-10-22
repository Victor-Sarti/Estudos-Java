package grafos;

import java.util.ArrayList;

public class Vertice <TIPO> {

	private TIPO dado;
	private ArrayList<Aresta<TIPO>> arestasEntrada;
	private ArrayList<Aresta<TIPO>> arestasSaida;


	public Vertice (TIPO valor) {
		this.dado = valor;
		this.arestasEntrada = new ArrayList<Aresta<TIPO>>();
		this.arestasSaida = new ArrayList<Aresta<TIPO>>();
	}
	
}