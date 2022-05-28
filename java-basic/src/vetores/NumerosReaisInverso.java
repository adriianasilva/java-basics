package vetores;
/* Faça um Programa que preencha um vetor de 10 números reais e
mostre-os na ordem inversa */

public class NumerosReaisInverso{

 float[] numeros = new float[10];{
	numeros[0] = 10;
	numeros[1] = 9;
	numeros[2] = 8;
	numeros[3] = 7;
	numeros[4] = 6;
	numeros[5] = 5;
	numeros[6] = 4;
	numeros[7] = 3;
	numeros[8] = 2;
	numeros[9] = 1;
 }
 
	public void inverso(){
		for (int i = 10 - 1; i >= 0; i--) {
			System.out.println(numeros[i]);
		}
	}
	
}
