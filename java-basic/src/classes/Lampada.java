//classe para representar uma lampada que esta a venda em um supermercado

package classes;

public class Lampada {
	
	private String marca;
	private String tipoLampada;
	private String formatoLampada;
	private String corLampada;
	private String modelo;
	private float potenciaLampada;
	private float preco;
	private int codigoProduto;
	private int tensaoEletrica;
	
	public void Acender() {
		boolean lampada = true;
		System.out.println("Lâmpada Acesa!" + lampada);
	}
	
	public void Apagar() {
		boolean lampada = false;
		System.out.println("Lâmpada apagada" + lampada);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipoLampada() {
		return tipoLampada;
	}

	public void setTipoLampada(String tipoLampada) {
		this.tipoLampada = tipoLampada;
	}

	public String getFormatoLampada() {
		return formatoLampada;
	}

	public void setFormatoLampada(String formatoLampada) {
		this.formatoLampada = formatoLampada;
	}

	public String getCorLampada() {
		return corLampada;
	}

	public void setCorLampada(String corLampada) {
		this.corLampada = corLampada;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPotenciaLampada() {
		return potenciaLampada;
	}

	public void setPotenciaLampada(float potenciaLampada) {
		this.potenciaLampada = potenciaLampada;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public int getTensaoEletrica() {
		return tensaoEletrica;
	}

	public void setTensaoEletrica(int tensaoEletrica) {
		this.tensaoEletrica = tensaoEletrica;
	}
	
	

}
