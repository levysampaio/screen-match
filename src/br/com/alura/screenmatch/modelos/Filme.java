package br.com.alura.screenmatch.modelos;

public class Filme {
	private String nome;
	private int anoLancamento;
	private boolean plano;
	private double nota;
	private int quantidadeAvaliacao;
	private double mediaAvaliacao;
	private int duracaoMinuto;
	
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
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

	public int getDuracaoMinuto() {
		return duracaoMinuto;
	}

	public void setDuracaoMinuto(int duracaoMinuto) {
		this.duracaoMinuto = duracaoMinuto;
	}

	public void exibirFichaTecnica() {
		
		System.out.println("FICHA TÉCNICA\n");
		System.out.println("Nome do Filme: " + nome);
		System.out.println("Ano de Lançamento: " + anoLancamento);
		System.out.println("Tempo de duração: " + duracaoMinuto + " minutos");
		System.out.println("Nota de Avaliação: " + this.MediaAvaliacao() + " (" + quantidadeAvaliacao + " pessoas avaliaram)");
	}
	
	public void darNotaAvaliacao(double nota) {
		this.nota += nota;
		quantidadeAvaliacao++;
	}
	
	public double MediaAvaliacao() {
		mediaAvaliacao =  nota/quantidadeAvaliacao;
		return mediaAvaliacao;
	}
}
