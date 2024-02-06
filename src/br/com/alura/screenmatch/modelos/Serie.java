package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
	
	private int temporada;
	private boolean ativa;
	private int episodioPorTemporada;
	private int minutosPorEpsodio;
	
	public Serie(String nome, int anoLancamento) {
		super(nome, anoLancamento);
	}
	public int getTemporada() {
		return temporada;
	}
	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}
	public boolean isAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	public int getEpisodioPorTemporada() {
		return episodioPorTemporada;
	}
	public void setEpisodioPorTemporada(int episodioPorTemporada) {
		this.episodioPorTemporada = episodioPorTemporada;
	}
	public int getMinutosPorEpsodio() {
		return minutosPorEpsodio;
	}
	public void setMinutosPorEpsodio(int minutosPorEpsodio) {
		this.minutosPorEpsodio = minutosPorEpsodio;
	}	
	
}
