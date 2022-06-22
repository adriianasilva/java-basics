package herancaepolimorfismo;

public class PessoaJuridica extends Contribuinte {

	double alquiotaEmpresa = 0.10;
	
	public PessoaJuridica(String nome, double rendaBruta){
		super(nome, rendaBruta);
	}
	
	public void impostoDeRenda(double rendaBruta) {
		double valorImposto = rendaBruta*alquiotaEmpresa;
		System.out.println("O Valor do Imposto de Renda de " + this.nome + " é de: " + valorImposto);
	}
}
