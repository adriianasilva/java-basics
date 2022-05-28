package classes;

public class Calculadora {
	
	public void somarDoisNumeros(float numeroUm, float numeroDois) {
		float resultado = numeroUm + numeroDois;
		System.out.println("O resultado é: "+resultado);
	}
	
	public void multiplicarDoisNumeros(float numeroUm, float numeroDois) {
		float resultado = numeroUm*numeroDois;
		System.out.println("O resultado é: "+resultado);
	}
	
	public void subtrairDoisNumeros(float numeroUm, float numeroDois) {
		float resultado = numeroUm-numeroDois;
		System.out.println("O resultado é: "+resultado);	
	}
	
	public void dividirDoisNumeros(float numeroUm, float numeroDois) {
		if(numeroDois != 0) {
		float resultado = numeroUm/numeroDois;
		System.out.println("O resultado é: "+resultado);
		}else {
			System.out.println("Divisão impossivel!");
		}
	}

}


