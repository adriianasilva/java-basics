package operacoes;

import java.util.Scanner;

//Faça um Programa que receba dois números e imprima a soma

public class soma {

	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("SOMA :)");
		System.out.println("Insira o primeiro numero: ");
		
		int A = teclado.nextInt();
		
		System.out.println("Insira o segundo numero: ");
		int B = teclado.nextInt();
		
		int soma = A+B;
		
		System.out.println("A soma dos dois números é: " + soma);
		
	}

}
