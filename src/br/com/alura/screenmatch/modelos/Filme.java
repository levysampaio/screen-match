package br.com.alura.screenmatch.modelos;

import br.com.alura.sreenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
	private String diretor;

	public Filme(String nome) {
		this.setNome(nome);
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	@Override
	public int getClassificacao() {
		return (int) (MediaAvaliacao()/2);
	}
	
	@Override
	public String toString() {
		return "Nome do Filme: " + this.getNome();
		
	}
	
	
}
