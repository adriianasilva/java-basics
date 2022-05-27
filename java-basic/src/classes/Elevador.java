package classes;

import java.util.Scanner;

public class Elevador {
	
	private static int andarAtual;
	private static int totalAndares;
	private static int capElevador;
	private static int pessoas;
	
	public static void Inicializa(capElevador, totalAndares){
		andarAtual = 0;
		pessoas = 0;
	}
	
	public static void Entra() {
		if(capElevador<pessoas) {
			pessoas++;
		}else {
			return;
		}
	}
	
	public static void Sai() {
		if (pessoas > 0) {
			pessoas--;
		}
	}

	public static void Sobe() {
		if(andarAtual < totalAndares) {
			andarAtual++;
		}else {
			return;
		}
	}
	
	public static void Desce() {
		if(andarAtual != 0) {
			andarAtual--;
		}else {
			return;
		}
	}
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira a capacidade do Elevador");
		int capElevador = leia.nextInt();
		
		System.out.println("Insira o total de andares do prédio");
		int totalAndares = leia.nextInt();
		
		Inicializa();
	}

	public static int getAndarAtual() {
		return andarAtual;
	}

	public static void setAndarAtual(int andarAtual) {
		Elevador.andarAtual = andarAtual;
	}

	public static int getTotalAndares() {
		return totalAndares;
	}

	public static void setTotalAndares(int totalAndares) {
		Elevador.totalAndares = totalAndares;
	}

	public static int getCapElevador() {
		return capElevador;
	}

	public static void setCapElevador(int capElevador) {
		Elevador.capElevador = capElevador;
	}

	public static int getPessoas() {
		return pessoas;
	}

	public static void setPessoas(int pessoas) {
		Elevador.pessoas = pessoas;
	}

}
