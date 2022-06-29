package relacionamentoentreclasses;

import java.util.Arrays;

public class Aluno {
	private String nome;
	private String matricula;
	private double[] notas = new double[4];
	
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

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia(){
		double mediaAluno = 0;
		
		mediaAluno = (Arrays.stream(this.notas).sum())/this.notas.length;
		
		return mediaAluno;
	}
	
	public void resultadoNotas(){
		double mediaAluno = calcularMedia();
		if(calcularMedia() >= 7){
			System.out.println(this.nome + ", aprovado, sua média é " + mediaAluno);
		}else {
			System.out.println(this.nome + ", reprovado, sua média é " + mediaAluno);
		}
	}
	
}
