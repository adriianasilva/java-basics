package classes;

import java.util.Scanner;

public class Calculadora {
	
	private static int num1 = 0;
	private static int num2 = 0;
	private static int op = 0;
	
	public static void Somar() {
		int res = num1 + num2;
		System.out.println("O resultado é: "+res);
	}
	
	public static void Multiplicar() {
		int res = num1*num2;
		System.out.println("O resultado é: "+res);
	}
	
	public static void Subtrair() {
		int res = num1-num2;
		System.out.println("O resultado é: "+res);	
	}
	
	public static void Divisão() {
		int res = num1/num2;
		System.out.println("O resultado é: "+res);
	}


	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("***CALCULADORA***");
		System.out.println("Para começar, digite o número da operação desejada:");
		System.out.println("1 - Soma");
		System.out.println("2 - Multiplicação");
		System.out.println("3 - Subtração");
		System.out.println("4 - Divisão");
		op = entrada.nextInt();
		
		switch(op) { 
		
		case 1: 
			System.out.println("Insira o primeiro numero:");
			num1 = entrada.nextInt();
			System.out.println("Insira o segundo numero:");
			num2 = entrada.nextInt();
			Somar();
			return;
		case 2:
			System.out.println("Insira o primeiro numero:");
			num1 = entrada.nextInt();
			System.out.println("Insira o segundo numero:");
			num2 = entrada.nextInt();
			Multiplicar();
			return;
		case 3:
			System.out.println("Insira o primeiro numero:");
			num1 = entrada.nextInt();
			System.out.println("Insira o segundo numero:");
			num2 = entrada.nextInt();
			Subtrair();
			return;
		case 4:
			System.out.println("Insira o primeiro numero:");
			num1 = entrada.nextInt();
			System.out.println("Insira o segundo numero:");
			num2 = entrada.nextInt();
			Divisão();
			return;
		}

	}

		

}


