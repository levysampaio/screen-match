package br.com.alura.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>  {
	
	private String nome;
	private int anoLancamento;
	private boolean plano;
	private double nota;
	private int quantidadeAvaliacao;
	private double mediaAvaliacao;
	private int duracaoMinuto;
	
	
	public Titulo(String nome, int anoLancamento) {
		this.nome = nome;
		this.anoLancamento = anoLancamento;
	}

	public String getNome() {
		return nome;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public boolean isPlano() {
		return plano;
	}

	public void setPlano(boolean plano) {
		this.plano = plano;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	

	public int getQuantidadeAvaliacao() {
		return quantidadeAvaliacao;
	}

	public void setQuantidadeAvaliacao(int quantidadeAvaliacao) {
		this.quantidadeAvaliacao = quantidadeAvaliacao;
	}

	public int getDuracaoMinuto() {
		return duracaoMinuto;
	}

	public void setDuracaoMinuto(int duracaoMinuto) {
		this.duracaoMinuto = duracaoMinuto;
	}

	public void exibirFichaTecnica() {
		
		System.out.println("FICHA TÉCNICA");
		System.out.println("Nome: " + nome);
		System.out.println("Ano de Lançamento: " + anoLancamento);
		System.out.println("Tempo de duração: " + duracaoMinuto + " minutos");
		System.out.println("Nota de Avaliação: " + this.MediaAvaliacao() + " (" + quantidadeAvaliacao + " pessoas avaliaram)\n");
	}
	
	public void darNotaAvaliacao(double nota) {
		this.nota += nota;
		quantidadeAvaliacao++;
	}
	
	public double MediaAvaliacao() {
		mediaAvaliacao =  nota/quantidadeAvaliacao;
		return mediaAvaliacao;
	}
	
	public int compareTo(Titulo t) {
		return this.getNome().compareTo(t.getNome());
	}

}
