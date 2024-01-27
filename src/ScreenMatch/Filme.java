package ScreenMatch;

public class Filme {
	String nome;
	int anoLancamento;
	boolean plano;
	double nota;
	int totalAvaliacao;
	int duracaoMinuto;
	
	
	void exibirFichaTecnica() {
		
		System.out.println("Nome do Filme: " + nome);
		System.out.println("Ano de Lançamento: " + anoLancamento);
	}
	
	void darNotaAvaliacao(double nota) {
		nota += nota;
		totalAvaliacao++;
	}
	
	double MediaAvaliacao() {
		return nota/totalAvaliacao;
	}
}
