package classes;

//A classe deve ter os atributos privados de: altura, peso, cor e renda mensal. Crie os métodos públicos “andar”
//,“correr” e “parar” que imprimam as mensagens “andando”,“correndo” e “parando”, respectivamente.


public class Pessoa {
	
	private float altura;
	private double peso;
	private String cor;
	private double rendaMensal;

	public static void Andar(){
		System.out.println("Andando");
	}
	
	public static void Correr() {
		System.out.println("Correndo");
	}
	
	public static void Parar() {
		System.out.println("Parando");
	}
	
	public static void main(String[] args) {
		Andar();
		Correr();
		Parar();
	}

}
