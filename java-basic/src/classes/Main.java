package classes;

public class Main {

	public static void main(String[] args) {
		//Criando um objeto Pessoa chamado Adriana
		Pessoa adriana = new Pessoa();
		adriana.andar();
		adriana.correr();
		adriana.parar();
		
		//Criando um objeto Casa chamado FG
		Casa fg = new Casa();
		fg.reformar();
		fg.finalizada();
		
		//Criando um objeto Livro chamado "Roube como um Artista"
		Livro roubeComoUmArtista = new Livro();
		roubeComoUmArtista.informacoes();
		
		//criação de um aluno
		Aluno shirley = new Aluno();
		
		double provaUm = 5.0;
		double provaDois = 2.0;
		double notaTrabalho = 7.0;
		
		double media = shirley.media(provaUm,provaDois,notaTrabalho);
		
		System.out.println("A média do aluno é: " + media);
		
		//mostra se foi para a prova final ou nao
		shirley.provaFinal(provaUm,provaDois,notaTrabalho);
		
		//calculadora de dois numeros
		Calculadora calculadora = new Calculadora();
		
		float numeroUm = 5;
		float numeroDois = 6;
		
		calculadora.somarDoisNumeros(numeroUm, numeroDois);
		calculadora.subtrairDoisNumeros(numeroUm, numeroDois);
		calculadora.dividirDoisNumeros(numeroUm, numeroDois);
		calculadora.multiplicarDoisNumeros(numeroUm, numeroDois);
		
		Elevador lacerda = new Elevador();
		int capacidadeElevador = 5;
		int totalAndares = 10;
		lacerda.inicializa(capacidadeElevador, totalAndares);
		
		//acender lampada
		
		Lampada lampada = new Lampada();
		lampada.Acender();
		lampada.Apagar();
		
		//role do banco
	
		ContaCorrente juninho = new ContaCorrente();
		double saldoConta = 1000.00;
		boolean contaEspecial = false;
		double valorSaque = 200.00;
		double valorDeposito = 500.00;
		
		juninho.ConsultaSaldo(saldoConta);
		juninho.ChequeEspecial(contaEspecial);
		juninho.Saque(valorSaque, saldoConta);
		juninho.Deposito(valorDeposito, saldoConta);
		
	}

}
