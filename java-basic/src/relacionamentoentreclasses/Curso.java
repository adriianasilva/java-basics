package relacionamentoentreclasses;

public class Curso {
	
	private String nome;
	private String horario;
	private Professor professores;
	private Aluno[] alunos;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Professor getProfessores() {
		return professores;
	}
	public void setProfessores(Professor professores) {
		this.professores = professores;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	
	
	public void mediaGeral() {
		
		double somatorioMedia = 0;
		
		for(int i = 0; i < this.alunos.length; i++) {
			somatorioMedia += alunos[i].calcularMedia();
		}

		double mediaTurma = (somatorioMedia)/alunos.length;
		
		System.out.println("A media Geral da Turma é: " + Math.round(mediaTurma));
	}
}
