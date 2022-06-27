package relacionamentoentreclasses;

public class Curso {
	
	private String nome;
	private String horario;
	private Professor[] professor;
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

	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	
	public Professor[] getProfessor() {
		return professor;
	}
	public void setProfessor(Professor[] professor) {
		this.professor = professor;
	}
	public String obterInfo() {
		String info = "Nome do Curso = " + nome + "\n";
		
		if (professor != null) {
			info += professor.obterInfo();
		}
		
		if (alunos != null) {
			System.out.println("---Alunos---");
			info+= Aluno.obterInfo();
		}
	}
}
