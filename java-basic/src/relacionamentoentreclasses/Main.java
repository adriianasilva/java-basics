package relacionamentoentreclasses;

public class Main {

	public static void main(String[] args) {
		//relacionamento tem muitos - muitos contatos p uma agenda
		Agenda agenda = new Agenda();
		
		agenda.setNome("Agendinha");
		
		Contato contato = new Contato();
		contato.setNome("Adriana");
		contato.setEmail("blablaba@blabla.com");
		contato.setTelefone("71 96595-9696");
		
		Contato contato2 = new Contato();
		contato2.setNome("Larissa");
		contato2.setEmail("larissa@kda.com");
		contato2.setTelefone("52-6656-6365");
		
		Contato contato3 = new Contato();
		contato3.setNome("Maurice");
		contato3.setEmail("lofi@fla.com");
		contato3.setTelefone("22 6315-6691");
		
		Contato[] contatos = new Contato[3];
		contatos[0] = contato;
		contatos[1] = contato2;
		contatos[2] = contato3;
		
		agenda.setContatos(contatos);
		
		if(agenda != null && agenda.getContatos() != null) {
			System.out.println(agenda.getNome());
			for(Contato c : agenda.getContatos()) {
				System.out.println(c.getNome() + " " + c.getEmail() + " " + c.getTelefone());
			}
		}
		
		//criacao curso
		
		Curso curso = new Curso();
		
		curso.setNome("Banco de Dados");
		curso.setHorario("Noturno");
		
		Professor professor = new Professor();
		professor.setNome("Mr. Bean");
		professor.setDepartamento("Departamento de Ciencias Contabeis");
		professor.setEmail("aloalo@br.com");
		
		Aluno alunoUm = new Aluno();
		alunoUm.setNome("Dustin");
		alunoUm.setMatricula("2156492");
		alunoUm.setNotaUm(2.5);
		alunoUm.setNotaDois(2.5);
		alunoUm.setNotaTres(2.5);
		alunoUm.setNotaQuatro(6.0);
		
		Aluno alunoDois = new Aluno();
		alunoDois.setNome("Eleven");
		alunoDois.setMatricula("216116196");
		alunoDois.setNotaUm(6.0);
		alunoDois.setNotaDois(2.5);
		alunoDois.setNotaTres(10);
		alunoDois.setNotaQuatro(5.0);
	
		Aluno alunoTres = new Aluno();
		alunoTres.setNome("Steve");
		alunoTres.setMatricula("219119169");
		alunoTres.setNotaUm(3.5);
		alunoTres.setNotaDois(7.5);
		alunoTres.setNotaTres(9.5);
		alunoTres.setNotaQuatro(5.2);
		
		Aluno alunoQuatro = new Aluno();
		alunoQuatro.setNome("Will");
		alunoQuatro.setMatricula("217858949");
		alunoQuatro.setNotaUm(10);
		alunoQuatro.setNotaDois(10);
		alunoQuatro.setNotaTres(10);
		alunoQuatro.setNotaQuatro(10);
		
		Aluno alunoCinco = new Aluno();
		alunoCinco.setNome("Nancy");
		alunoCinco.setMatricula("21548696");
		alunoCinco.setNotaUm(9);
		alunoCinco.setNotaDois(8);
		alunoCinco.setNotaTres(7);
		alunoCinco.setNotaQuatro(6);
		
		Aluno[] alunos = new Aluno[5];
		alunos[0] = alunoUm;
		alunos[1] = alunoDois;
		alunos[2] = alunoTres;
		alunos[3] = alunoQuatro;
		alunos[4] = alunoCinco;
		
		curso.setAlunos(alunos);
		
		
		/*public CalcularMedia(double notaUm, double notaDois, double notaTres, double notaQuatro){
			double mediaAluno;
				if(mediaAluno >= 7){
					System.out.println("Aluno Aprovado, sua média é " + mediaAluno);
				}else {
					System.out.println("Aluno Reprovado, sua média é " + mediaAluno);
				}
			double mediaGeral = mediaGeral + mediaAluno;
		}
		
		private static MediaGeral(double mediaAluno) {
			double mediaGeral = 0;
			mediaGeral = mediaGeral + mediaAluno;
			double mediaTurma = (mediaGeral)/4;
		}
		
		
		if(curso != null && curso.getAlunos() != null) {
			for(int i = 0 ; i < alunos.length < i++;) {
				CalcularMedia(alunos[i]);
				MediaGeral(alunos[i]);
			}
			System.out.println("A media Geral da Turma é: " + mediaTurma);
		}*/
		
		
	}

}
