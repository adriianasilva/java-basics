package classes;
import java.util.Scanner;
public class Aluno {
	
	private String nome;
	private int matricula;
	private static double prova1;
	private static double prova2;
	private static double notaTrabalho;
	private static double mediaAluno;
	
	public static void Media() {
		mediaAluno = (prova1*0.25 + prova2*0.25 + notaTrabalho*0.5);
		System.out.println("A média do aluno é: " + mediaAluno);
	}
	
	public static void Final() {
		if (mediaAluno < 6){
			double notaFinal = 6 - mediaAluno;
			System.out.println("O aluno precisa de " + notaFinal + " para a prova final");
		}else{
			System.out.println("O aluno precisa de 0 para a prova final.");	
		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira a nota da prova 1:");
		prova1 = entrada.nextDouble();
		System.out.println("Insira a nota da prova 2:");
		prova2 = entrada.nextDouble();
		System.out.println("Insira a nota do trabalho:");
		notaTrabalho = entrada.nextDouble();	
		Media();
		Final();	
	}
}
