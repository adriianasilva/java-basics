package classes;

public class ContaCorrente {
	private int numeroConta;
	private double saldoConta;
	private boolean contaEspecial;
	private double limiteSaque;
	
	public ContaCorrente(){
		this.contaEspecial = true;
		this.numeroConta = 2394;
		this.limiteSaque = 1000.00;
		this.saldoConta = 0;
	}

}
