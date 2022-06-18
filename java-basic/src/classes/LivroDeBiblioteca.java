package classes;

public class LivroDeBiblioteca extends Livro{
	private int codigoDoLivro;
	private boolean estaEmprestado;
	private String leitorEmprestado;
	private int codigoConsultaEmprestimo;
	private int diasEmprestimo;
	private int quantidadeEmprestimos;
	
	public void Emprestar() {
		estaEmprestado = true;
		System.out.println("Emprestado!");
	}
}
