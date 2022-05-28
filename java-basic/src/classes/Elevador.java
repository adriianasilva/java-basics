package classes;

public class Elevador {
	
	private static int andarAtual;
	private static int totalAndares;
	private static int capacidadeElevador;
	private static int pessoas;
	
	public void inicializa(int capacidadeElevador, int totalAndares){
		andarAtual = 0;
		pessoas = 0;
		System.out.println("Elevador pronto.");
	}
	
	public void entra() {
		if(capacidadeElevador<pessoas) {
			pessoas++;
		}else {
			return;
		}
	}
	
	public void sai() {
		if (pessoas > 0) {
			pessoas--;
		}
	}

	public void sobe() {
		if(andarAtual < totalAndares) {
			andarAtual++;
		}else {
			return;
		}
	}
	
	public void desce() {
		if(andarAtual != 0) {
			andarAtual--;
		}else {
			return;
		}
	}
	

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		Elevador.andarAtual = andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public void setTotalAndares(int totalAndares) {
		Elevador.totalAndares = totalAndares;
	}

	public int getcapacidadeElevador() {
		return capacidadeElevador;
	}

	public void setcapacidadeElevador(int capacidadeElevador) {
		Elevador.capacidadeElevador = capacidadeElevador;
	}

	public int getPessoas() {
		return pessoas;
	}

	public void setPessoas(int pessoas) {
		Elevador.pessoas = pessoas;
	}

}
