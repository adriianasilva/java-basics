package vetores;

import java.util.Scanner;

public class Main {

	private static int[] idades = new int[5];
	private static double[] alturas = new double[5];
	private static int[] a = new int[10];
	private static int soma = 0;
	private static int quadrados = 0;
	
	public static void lerIdades() {
		for(int j=0; j < idades.length; j++) {
			idades[j] = new Scanner(System.in).nextInt();
		}
	}
	
	public static void lerAlturas() {
		for(int j=0; j < alturas.length; j++) {
			alturas[j] = new Scanner(System.in).nextDouble();
		}
	}
	
	public static void idadeInversa() {
		for (int i = idades.length - 1; i>=0; i--) {
			System.out.println(idades[i]);
		}
	}
	
	public static void alturaInversa(){
		for (int i = alturas.length - 1; i>=0; i--) {
			System.out.println(alturas[i]);
		}
	}
	
	public static void lerNumerosInteiros() {
		for(int j = 0; j < a.length; j++) {
			a[j] = new Scanner(System.in).nextInt();
		}
	}
	
	public static void somaNumerosQuadrados() {
		for(int i = 0; i < a.length; i++) {
			quadrados = a[i]*a[i];
			soma = soma + quadrados;
		}
		System.out.println("A soma dos quadrados dos elementos do vetor é: " + soma);
	}
	
	public static void main(String[] args) {
		
		//programa que mostra vetores de forma inversa
	
		NumerosReaisInverso vetor = new NumerosReaisInverso();
		
		vetor.inverso();
		
		/*Faça um Programa que peça a idade e a altura de 5 pessoas,
		armazene cada informação no seu respectivo vetor. Imprima a idade
		e a altura na ordem inversa a ordem lida.*/
		
		
		System.out.println("Insira 5 idades");
		lerIdades();
		
		System.out.println("Insira 5 alturas");
		lerAlturas();
		
		idadeInversa();
		alturaInversa();
		
		/*Faça um Programa que leia um vetor A com 10 números inteiros,
		calcule e mostre a soma dos quadrados dos elementos do vetor*/
		
		System.out.println("Insira 10 números inteiros");
		lerNumerosInteiros();
		
		somaNumerosQuadrados();
		
	}

}
