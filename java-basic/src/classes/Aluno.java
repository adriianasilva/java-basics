package classes;
public class Aluno {
	
	protected String nome;
	protected int matricula;
	protected double mediaAluno;
	
	public double media(double provaUm, double provaDois, double notaTrabalho) {
		mediaAluno = (provaUm*0.25 + provaDois*0.25 + notaTrabalho*0.5);
		return mediaAluno;
	}
	
	public void provaFinal(double provaUm, double provaDois, double notaTrabalho) {
		if (mediaAluno < 6){
			double notaFinal = 6 - mediaAluno;
			System.out.println("O aluno precisa de " + notaFinal + " para a prova final");
		}else{
			System.out.println("O aluno precisa de 0 para a prova final.");	
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
}
