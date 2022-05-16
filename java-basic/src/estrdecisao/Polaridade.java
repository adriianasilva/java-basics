package estrdecisao;
//Crie um programa em java que receba um número é positivo, negativo ou zero e informe ao usuário.

import java.util.Scanner;

public class Polaridade {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Insira o número desejado: ");
		
		int num = teclado.nextInt();
		
		if(num > 0) {
			System.out.println("O número é positivo.");
		}else if(num < 0) {
			System.out.println("O número é negativo.");
		}else
			System.out.println("O numero é zero.");
		}
		

}
