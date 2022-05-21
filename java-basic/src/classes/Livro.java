package classes;

/* Escreva uma classe que represente um Livro. A classe deve conter os
atributos título, autor, total de páginas, página atual, aberto, leitor e
qualquer outro atributo que você considerar necessário. Essa classe
deve ter ainda um método que retorne todas as informações dos
atributos. */

public class Livro{
	
	private static String titulo;
	private static String autor;
	private static String totalPaginas;
	private static String paginaAtual;
	private static String dataAberto;
	private static String leitor;
	

	public static String Informacoes(){
		return (titulo+autor+totalPaginas+paginaAtual+dataAberto+leitor);
	}
	
	public static void main(String[] args) {
		Informacoes();
	}

}
