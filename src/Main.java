import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

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
		
		
		
	}

}