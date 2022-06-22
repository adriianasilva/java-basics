package herancaepolimorfismo;

public class ContaBancaria {
	protected String nomeCliente;
	protected int numConta;
	protected double saldo;
	
	public ContaBancaria(String nomeCliente, int numConta, double saldo) {
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public void sacar(double saldo, double valorSaque) {
		if(this.saldo > 0) {
			this.saldo = this.saldo - valorSaque;
			System.out.println("Saque permitido. Aguardando emissão das notas...");
		}else {
			System.out.println("Saque não permitido. Saldo insuficiente");
		}
	}
	
	public void depositar(double valorDeposito) {
		this.saldo = this.saldo + valorDeposito;
		System.out.println("O saldo atualizado é de: " + saldo);
	}
	
	public void dadosCliente() {
		System.out.println("Dados do Cliente: ");
		System.out.println("Nome: " + this.nomeCliente);
		System.out.println("Numero da Conta: " + this.numConta);
	}

	
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ContaBancaria [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + "]";
	}
	
	
	
}
