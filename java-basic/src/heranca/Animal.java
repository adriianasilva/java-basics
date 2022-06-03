package heranca;

public class Animal {
	
	protected String nome;
	protected float comprimento;
	protected int numeroDePatas;
	protected String cor;
	protected String ambiente;
	protected double velocidadeMedia;
	
	protected Animal(String nome, float comprimento, int numeroDePatas, String cor, String ambiente, double velocidadeMedia){
		this.nome = nome;
		this.comprimento = comprimento;
		this.numeroDePatas = numeroDePatas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidadeMedia = velocidadeMedia;
	}
	
	public void dados() {
		System.out.println("Dados do Animal");
		System.out.println(this.nome);
		System.out.println(this.comprimento);
		System.out.println(this.numeroDePatas);
		System.out.println(this.cor);
		System.out.println(this.ambiente);
		System.out.println(this.velocidadeMedia);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public int getNumeroDePatas() {
		return numeroDePatas;
	}

	public void setNumeroDePatas(int numeroDePatas) {
		this.numeroDePatas = numeroDePatas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public double getVelocidadeMedia() {
		return velocidadeMedia;
	}

	public void setVelocidadeMedia(double d) {
		this.velocidadeMedia = d;
	}
	
	
}
