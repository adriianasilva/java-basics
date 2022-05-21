package classes;

/* Escreva uma classe que represente uma casa. A classe deve ter os
atributos privados de: cor, quantidade de quartos, quantidade de
banheiros, CEP, Rua, Bairro e Estado. Crie os métodos públicos
“Reformar” e “finalizada” que imprimam as mensagens
“reformando” e “finalizada”. */

public class Casa {
	
	private String cor;
	private int quantidadeQuartos;
	private int quantidadeBanheiros;
	private String CEP;
	private String rua;
	private String bairro;
	private String estado;
	
	public static void Reformar() {
		System.out.println("Reformando...");
	}
	
	public static void Finalizada() {
		System.out.println("Finalizada!");
	}
	
	public static void main(String[] args) {
		Reformar();
		Finalizada();
	}

}
