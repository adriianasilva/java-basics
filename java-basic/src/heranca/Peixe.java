package heranca;

public class Peixe extends Animal {
	
	protected String caracteristica;
	
	public Peixe(String caracteristica, String nome, float comprimento, int numeroDePatas, String cor, String ambiente, double velocidadeMedia){
		super(ambiente, comprimento, numeroDePatas, ambiente, ambiente, comprimento);
		this.caracteristica = caracteristica;
	}
	
	public String getCaracteristica() {
		return this.caracteristica;
	}
	
	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	public void dadosPeixe() {
		System.out.println("Dados do Peixe");
		System.out.println(this.caracteristica);
		System.out.println(this.nome);
		System.out.println(this.comprimento);
		System.out.println(this.numeroDePatas);
		System.out.println(this.cor);
		System.out.println(this.ambiente);
		System.out.println(this.velocidadeMedia);
	}
}
