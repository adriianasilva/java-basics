package herancaepolimorfismo;

public class ContaPoupanca extends ContaBancaria {
	private double diaRendimento;
	
	public ContaPoupanca(String nomeCliente, int numConta, double saldo, double diaRendimento){
		super(nomeCliente, numConta, saldo);
		this.diaRendimento = diaRendimento;
	}
	
	public void calcularNovoSaldo(double saldo){
		this.saldo = this.saldo + diaRendimento;
		System.out.println("O seu saldo com os rendimentos do dia é: " + this.saldo);
	}
	
}
