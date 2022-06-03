package heranca;

public class Mamifero extends Animal{
	
	protected String alimento;
	
	public Mamifero(String caracteristica, String nome, float comprimento, int numeroDePatas, String cor, String ambiente, double velocidadeMedia, String alimento){
		super(ambiente, comprimento, numeroDePatas, ambiente, ambiente, comprimento);
		this.alimento = alimento;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	public void dadosMamifero() {
		System.out.println("Dados Mamífero");
		System.out.println(this.alimento);
		System.out.println(this.nome);
		System.out.println(this.comprimento);
		System.out.println(this.numeroDePatas);
		System.out.println(this.cor);
		System.out.println(this.ambiente);
		System.out.println(this.velocidadeMedia);
	}
}
