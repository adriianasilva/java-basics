package operacoes;

import java.util.Scanner;

//Faça um Programa que peça um número e então mostre a mensagem "O número informado foi <valor do número>"

public class Variaveis {
	
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Insira um número:");
		
		int numero = entrada.nextInt();
		
		System.out.println("O número informado foi: " + numero);
		
	}

}
