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
		double[] notasAlunoUm = new double[4];
		double[] notasAlunoDois = new double[4];
		double[] notasAlunoTres = new double[4];
		double[] notasAlunoQuatro = new double[4];
		double[] notasAlunoCinco = new double[4];
		
		curso.setNome("Banco de Dados");
		curso.setHorario("Noturno");
		
		Professor professor = new Professor();
		professor.setNome("Mr. Bean");
		professor.setDepartamento("Departamento de Ciencias Contabeis");
		professor.setEmail("aloalo@br.com");
		
		Aluno alunoUm = new Aluno();
		alunoUm.setNome("Dustin");
		alunoUm.setMatricula("2156492");
		notasAlunoUm[0] = 2.5;
		notasAlunoUm[1] = 2.5;
		notasAlunoUm[2] = 2.5;
		notasAlunoUm[3] = 2.5;
		alunoUm.setNotas(notasAlunoUm);
		
		Aluno alunoDois = new Aluno();
		alunoDois.setNome("Eleven");
		alunoDois.setMatricula("216116196");
		notasAlunoDois[0] = 6.0;
		notasAlunoDois[1] = 2.5;
		notasAlunoDois[2] = 10;
		notasAlunoDois[3] = 5.0;
		alunoDois.setNotas(notasAlunoDois);
	
		Aluno alunoTres = new Aluno();
		alunoTres.setNome("Steve");
		alunoTres.setMatricula("219119169");
		notasAlunoTres[0] = 3.5;
		notasAlunoTres[1] = 7.5;
		notasAlunoTres[2] = 9.5;
		notasAlunoTres[3] = 5.2;
		alunoTres.setNotas(notasAlunoTres);
		
		Aluno alunoQuatro = new Aluno();
		alunoQuatro.setNome("Will");
		alunoQuatro.setMatricula("217858949");
		notasAlunoQuatro[0] = 10;
		notasAlunoQuatro[1] = 10;
		notasAlunoQuatro[2] = 10;
		notasAlunoQuatro[3] = 10;
		alunoQuatro.setNotas(notasAlunoQuatro);
	
		Aluno alunoCinco = new Aluno();
		alunoCinco.setNome("Nancy");
		alunoCinco.setMatricula("21548696");
		notasAlunoCinco[0] = 10;
		notasAlunoCinco[1] = 10;
		notasAlunoCinco[2] = 10;
		notasAlunoCinco[3] = 10;
		alunoCinco.setNotas(notasAlunoCinco); 
			
		Aluno[] alunos = new Aluno[5];
		alunos[0] = alunoUm;
		alunos[1] = alunoDois;
		alunos[2] = alunoTres;
		alunos[3] = alunoQuatro;
		alunos[4] = alunoCinco;
		
		curso.setAlunos(alunos);
		
		alunoUm.resultadoNotas();
		alunoDois.resultadoNotas();
		alunoTres.resultadoNotas();
		alunoQuatro.resultadoNotas();
		alunoCinco.resultadoNotas();
		curso.mediaGeral();
	}

}
