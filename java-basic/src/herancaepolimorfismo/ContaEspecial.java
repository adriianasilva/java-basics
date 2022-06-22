package herancaepolimorfismo;

public class ContaEspecial extends ContaBancaria {

	private double limite;
	private double valorSaque;
	
	public ContaEspecial(String nomeCliente, int numConta, double saldo, double limite, double valorSaque) {
		super(nomeCliente, numConta, saldo);
		this.limite = limite;
		this.valorSaque = valorSaque;
	}
	
	@Override
	public void sacar (double saldo, double valorSaque) {
		if (this.saldo < this.limite) {
			if(this.saldo > 0) {
				this.saldo = this.saldo - this.valorSaque;
				System.out.println("Saque permitido. Aguardando emissão das notas...");
			}else {
				System.out.println("Saque não permitido. Saldo insuficiente");
			}
		}else {
			System.out.println("Limite da conta excedido.");
		}
	}

}
