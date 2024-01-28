import br.com.alura.screenmatch.modelos.Filme;

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
	}

}