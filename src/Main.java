import java.util.ArrayList;

import br.com.alura.screenmatch.modelos.Epsodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.sreenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.sreenmatch.calculos.FiltroRecomendacao;

public class Main {

	public static void main(String[] args) {
		
		Filme meuFilme = new Filme();
		
		meuFilme.setNome("Top Gun");
		meuFilme.setAnoLancamento(1990);
		meuFilme.setDuracaoMinuto(1600);
		
		meuFilme.darNotaAvaliacao(8.0);
		meuFilme.darNotaAvaliacao(6.0);
		meuFilme.darNotaAvaliacao(9.0);
		meuFilme.darNotaAvaliacao(3.0);
		meuFilme.darNotaAvaliacao(10.0);
		
		
		meuFilme.exibirFichaTecnica();
		
		
		Filme nossoFilme = new Filme();
		nossoFilme.setNome("Avatar");
		nossoFilme.setAnoLancamento(2010);
		nossoFilme.setDuracaoMinuto(2000);
		
		
		Filme vossoFilme = new Filme();
		vossoFilme.setNome("Os vingadores");
		vossoFilme.setAnoLancamento(2016);
		vossoFilme.setDuracaoMinuto(2600);
		
		Serie minhaSerie = new Serie();
		
		minhaSerie.setNome("The Big Bang Theory");
		minhaSerie.setAnoLancamento(2007);
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
		
		System.out.println("Tempo total para assistir " + minhaSerie.getNome() + " e " + meuFilme.getNome() + " = " + calculadora.getTempoTotal() + " Minutos\n");
		
		FiltroRecomendacao filtro = new FiltroRecomendacao();
		filtro.filtra(meuFilme);
		
		Epsodio ep = new Epsodio();
		ep.setNumero(1);
		ep.setSerie(minhaSerie);
		ep.setTotalVisualizacao(800);
		filtro.filtra(ep);
		
		ArrayList<Filme> listaDeFilmes = new ArrayList<>();
		
		
		
		
	}

}