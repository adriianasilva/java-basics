package relacionamentoentreclasses;

public class Aluno {
	private String nome;
	private String matricula;
	private double notaUm;
	private double notaDois;
	private double notaTres;
	private double notaQuatro;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getNotaUm() {
		return notaUm;
	}
	public void setNotaUm(double notaUm) {
		this.notaUm = notaUm;
	}
	public double getNotaDois() {
		return notaDois;
	}
	public void setNotaDois(double notaDois) {
		this.notaDois = notaDois;
	}
	public double getNotaTres() {
		return notaTres;
	}
	public void setNotaTres(double notaTres) {
		this.notaTres = notaTres;
	}
	public double getNotaQuatro() {
		return notaQuatro;
	}
	public void setNotaQuatro(double notaQuatro) {
		this.notaQuatro = notaQuatro;
	}

	public String obterInfo() {
		String info = "Nome Aluno = " + nome;
		info+= "Matrícula = " + matricula;
		info += "Notas: ";
		
		double soma = 0;
		info += notaUm;
		info += notaDois;
		info += notaTres;
		info += notaQuatro;
		
		double media = soma/4;
		info += "\n" + "Média = " + media + " - ";
		if (media >=7) {
			info += "Aprovado!";
		}else {
			info += "Reprovado!";
		}
		
		return info;
	}
	
	
}
