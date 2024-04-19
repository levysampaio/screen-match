package br.com.alura.screenmatch.principal;
import java.util.ArrayList;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class MainComLista {

	public static void main(String[] args) {

		Filme meuFilme = new Filme("Interstella", 2007);
		Filme nossoFilme = new Filme("Avatar", 2010);
		Filme vossoFilme = new Filme("Os vingadores", 2016);
		Serie minhaSerie = new Serie("The Big Bang Theory", 2007);

		ArrayList<Titulo> lista = new ArrayList<>();
		lista.add(vossoFilme);
		lista.add(nossoFilme);
		lista.add(meuFilme);
		lista.add(minhaSerie);

		for(Titulo item: lista) {
			System.out.println(item);
		}

	}

}