package estrdecisao;
import java.util.Scanner;

//Crie um programa em java que receba dois números e informe qual é o maior número. Caso os números sejam iguais, também deve ser informado.

public class Maiorigual {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main (String[] args) {
		System.out.println("Insira um número: ");
		int A = teclado.nextInt();
		
		System.out.println("Insira outro número: ");
		int B = teclado.nextInt();
		
		if(A>B){
			System.out.println("O maior número é: " + A);
		}else if(B>A) {
			System.out.println("O maior número é: " + B);
		}else {
			System.out.println("Os números são iguais.");
		}
		
		
	}

}
