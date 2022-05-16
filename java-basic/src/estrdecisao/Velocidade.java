//Crie um programa em java que receba a velocidade de um carro e informe se o mesmo estava acima da velocidade permitida. Deve ser mostrada a mensagem
//“velocidade permitida” caso o carro esteja na velocidade e a mensagem “acima
//da velocidade” caso o carro esteja acima. A velocidade permitida é 80Km/h.
package estrdecisao;
import java.util.Scanner;

public class Velocidade {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Insira a velocidade do carro: ");
		
		double velocidade = teclado.nextDouble();
		
		if(velocidade >= 0 && velocidade <= 80) {
			System.out.println("Velocidade permitida.");
		}else if(velocidade >80){
			System.out.println("Acima da velocidade.");
		}else {
			System.out.println("Valor incorreto. Tente novamente");
		}
	
		
		
	}

}
