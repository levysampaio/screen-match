package ScreenMatch;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Esse é o ScreenMatch");
		
		String filme = "Interstellar";
		
		int ano = 2014;
		
		double nota1 = 10;
		
		double nota2 = 9;
		
		double nota3 = 10;
		
		double notaMedia = (nota1 + nota2 + nota3) / 3;
		
		int classificacao = (int) (notaMedia/2);
		
		String mensagem = """
				
				Filme: %s
				Ano: %d
				Classificação: %d
				
				""".formatted(filme,ano,classificacao);
		
		System.out.println(mensagem);

	}

}
