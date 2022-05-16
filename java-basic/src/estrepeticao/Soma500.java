package estrepeticao;

//Faça um algoritmo que receba 500 números, calcule e mostre a sua soma.

	public class Soma500 {

	public static void main(String[] args) {
		int resultado = 0;
		
			for(int i=1; i<=500; i++) {
				System.out.println(i);
				resultado +=i;
			}
			
		
		System.out.println("A soma é:" + resultado);

	}

}
