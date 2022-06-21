package classes;

public class ContaCorrente {
	private int numeroConta;
	private double saldoConta;
	private boolean contaEspecial;
	private int limiteSaque = 2;
	private int tentativaSaque = 0;
	
	public void Saque(double valorSaque, double saldoConta){
		tentativaSaque++;
		if(limiteSaque > tentativaSaque) {	
			if(valorSaque < saldoConta) {
				System.out.println("Saque permitido. Aguarde a liberação das notas...");
			}else{
				System.out.println("Saque não permitido. Saldo insuficiente");
			}
		}else{
			System.out.println("Limite de saques do dia excedido.");
		}
	}
	
	public void Deposito(double valorDeposito, double saldoConta) {
		saldoConta = saldoConta + valorDeposito;
		System.out.println("Depósito efetuado com sucesso. O Saldo atualizado é: "+ saldoConta);
	}
	
	public void ConsultaSaldo(double saldoConta){
		System.out.println("O Seu saldo é de: " + saldoConta);
	}
	
	public void ChequeEspecial(boolean contaEspecial){
		if(contaEspecial == true) {
			System.out.println("Você está usando o cheque Especial");
		}else if(contaEspecial == false) {
			System.out.println("Você não está usando o cheque especial");
		}
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	public boolean isContaEspecial() {
		return contaEspecial;
	}

	public void setContaEspecial(boolean contaEspecial) {
		this.contaEspecial = contaEspecial;
	}

	public double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(int limiteSaque) {
		this.limiteSaque = limiteSaque;
	}


	

}
