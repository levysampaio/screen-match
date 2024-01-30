package br.com.alura.sreenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
	private int tempoTotal;

	public int getTempoTotal() {
		return tempoTotal;
	}
	
	public void incluir(Titulo t) {
		tempoTotal += t.getDuracaoMinuto();
	}
}
