package br.com.alura.screenmatch.principal;
import java.util.ArrayList;

import br.com.alura.screenmatch.modelos.Epsodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.sreenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.sreenmatch.calculos.FiltroRecomendacao;

public class Main {

	public static void main(String[] args) {

		Filme meuFilme = new Filme("Interstella", 2007);
		meuFilme.setDuracaoMinuto(1600);
		meuFilme.darNotaAvaliacao(8.0);
		meuFilme.darNotaAvaliacao(6.0);
		meuFilme.darNotaAvaliacao(9.0);
		meuFilme.darNotaAvaliacao(3.0);
		meuFilme.darNotaAvaliacao(10.0);
		meuFilme.exibirFichaTecnica();

		Filme nossoFilme = new Filme("Avatar", 2010);
		nossoFilme.setDuracaoMinuto(2000);

		Filme vossoFilme = new Filme("Os vingadores", 2016);
		vossoFilme.setDuracaoMinuto(2600);

		Serie minhaSerie = new Serie("The Big Bang Theory", 2007);
		minhaSerie.setDuracaoMinuto(30);

		minhaSerie.darNotaAvaliacao(9.5);
		minhaSerie.darNotaAvaliacao(10.0);
		minhaSerie.darNotaAvaliacao(9.0);
		minhaSerie.darNotaAvaliacao(10.0);
		minhaSerie.darNotaAvaliacao(10.0);

		minhaSerie.exibirFichaTecnica();

		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

		calculadora.incluir(minhaSerie);
		calculadora.incluir(meuFilme);

		System.out.println("Tempo total para assistir " + minhaSerie.getNome() + " e " + meuFilme.getNome() + " = "
				+ calculadora.getTempoTotal() + " Minutos\n");

		FiltroRecomendacao filtro = new FiltroRecomendacao();

		System.out.print("O Filme " + meuFilme.getNome() + " está ");
		filtro.filtra(meuFilme);

		Epsodio ep = new Epsodio();
		ep.setNome("A volta de Freeza");
		ep.setNumero(1);
		ep.setSerie(minhaSerie);
		ep.setTotalVisualizacao(800);
		System.out.print("O Epsodio " + ep.getNome() + " está ");
		filtro.filtra(ep);

		ArrayList<Filme> listaDeFilmes = new ArrayList<>();
		listaDeFilmes.add(vossoFilme);
		listaDeFilmes.add(nossoFilme);
		listaDeFilmes.add(meuFilme);

		System.out.println("Quantos filmes tem na lista? R: " + listaDeFilmes.size());
		System.out.println("Qual o primeiro filme da lista? R: " + listaDeFilmes.get(0).getNome());

		System.out.println(listaDeFilmes.toString());

	}

}