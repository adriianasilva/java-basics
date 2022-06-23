package herancaepolimorfismo;

public class Main {

	public static void main(String[] args) {
		// teste ContaBancaria
		
		ContaBancaria alfredo = new ContaBancaria("Alfredo", 4565, 1000.00);
		
		alfredo.sacar(1000.00, 500.00);
		
		alfredo.depositar(800.00);
		
		alfredo.dadosCliente();
		
		ContaPoupanca lotso = new ContaPoupanca("Lotso", 6545, 1000.00, 0.01);
		lotso.calcularNovoSaldo(1000.00);
		
		//teste ImpostoDeRenda
		
		PessoaJuridica milena = new PessoaJuridica("Milena", 5000);
		
		milena.impostoDeRenda(5000);
		
		PessoaJuridica jose = new PessoaJuridica("Jose", 1000);
		
		jose.impostoDeRenda(1000);
		
		PessoaJuridica joaquina = new PessoaJuridica("Joaquina", 10000);
		
		joaquina.impostoDeRenda(10000);
		
		PessoaFisica barbara = new PessoaFisica("Barbara", 1400);
		
		barbara.impostoDeRendaPessoaFisica(1400);
		
		PessoaFisica silvia = new PessoaFisica("Silvia", 2500);
		
		silvia.impostoDeRendaPessoaFisica(2500);
		
		PessoaFisica mendes = new PessoaFisica("Mendes", 3601);
		
		mendes.impostoDeRendaPessoaFisica(3601);
	}

}
