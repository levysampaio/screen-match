package br.com.alura.sreenmatch.calculos;

public class FiltroRecomendacao {

	public void filtra(Classificavel classificavel) {
		if(classificavel.getClassificacao() >= 4) {
			System.out.println("Altamente recomendado");
		}else if (classificavel.getClassificacao() >= 2) {
			System.out.println("Bem recomendado");
		}else {
			System.out.println("Recomendado");
		}
	}
}
