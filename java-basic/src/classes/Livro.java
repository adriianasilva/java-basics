package classes;

/* Escreva uma classe que represente um Livro. A classe deve conter os
atributos título, autor, total de páginas, página atual, aberto, leitor e
qualquer outro atributo que você considerar necessário. Essa classe
deve ter ainda um método que retorne todas as informações dos
atributos. */

public class Livro{
	
	private String titulo;
	private String autor;
	private String totalPaginas;
	private String paginaAtual;
	private String dataAberto;
	private String leitor;
	

	public String informacoes(){
		return (titulo+autor+totalPaginas+paginaAtual+dataAberto+leitor);
	}

}
