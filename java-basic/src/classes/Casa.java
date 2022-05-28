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
	
	public void reformar() {
		System.out.println("Reformando...");
	}
	
	public void finalizada() {
		System.out.println("Finalizada!");
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQuantidadeQuartos() {
		return quantidadeQuartos;
	}

	public void setQuantidadeQuartos(int quantidadeQuartos) {
		this.quantidadeQuartos = quantidadeQuartos;
	}

	public int getQuantidadeBanheiros() {
		return quantidadeBanheiros;
	}

	public void setQuantidadeBanheiros(int quantidadeBanheiros) {
		this.quantidadeBanheiros = quantidadeBanheiros;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
