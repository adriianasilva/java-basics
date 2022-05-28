package classes;

//A classe deve ter os atributos privados de: altura, peso, cor e renda mensal. Crie os métodos públicos “andar”
//,“correr” e “parar” que imprimam as mensagens “andando”,“correndo” e “parando”, respectivamente.


public class Pessoa{
	
	private float altura;
	private double peso;
	private String cor;
	private double rendaMensal;

	public void andar(){
		System.out.println("Andando");
	}
	
	public void correr() {
		System.out.println("Correndo");
	}
	
	public void parar() {
		System.out.println("Parando");
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getRendaMensal() {
		return rendaMensal;
	}

	public void setRendaMensal(double rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
	
	

}
