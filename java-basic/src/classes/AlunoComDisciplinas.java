package classes;

public class AlunoComDisciplinas extends Aluno{
	private String cursoMatriculado;
	private String disciplinaUm;
	private String disciplinaDois;
	private String disciplinaTres;
	private double notaUm;
	private double notaDois;
	private double notaTres;
	
	public AlunoComDisciplinas(String nome, int matricula, double mediaAluno, String cursoMatriculado, String disciplinaUm, String disciplinaDois, String disciplinaTres, double notaUm, double notaDois, double notaTres) {
		this.cursoMatriculado = cursoMatriculado;
		AprovacaoDisciplinas(disciplinaUm, disciplinaDois, disciplinaTres, notaUm, notaDois, notaTres);

	}
	
	public void AprovacaoDisciplinas(String disciplinaUm, String disciplinaDois, String disciplinaTres, double notaUm, double notaDois, double notaTres) {
		if(notaUm >= 7) {
			System.out.println(disciplinaUm + notaUm + "Aprovado!");
		}else {
			System.out.println(disciplinaUm + notaUm + "Reprovado!");
		}
		if(notaDois >= 7) {
			System.out.println(disciplinaDois + notaDois  + "Aprovado!");
		}else {
			System.out.println(disciplinaDois + notaDois +  "Reprovado!");
		}
		if(notaTres >= 7) {
			System.out.println(disciplinaTres + notaTres  + "Aprovado!");
		}else {
			System.out.println(disciplinaTres + notaTres + "Reprovado!");
		}
	}
	
}
