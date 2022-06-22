package herancaepolimorfismo;

public class PessoaFisica extends Contribuinte {
	
	double valorImposto = 0 ;
	
	public PessoaFisica(String nome, double rendaBruta) {
		super(nome, rendaBruta);
	}
	
	public void impostoDeRendaPessoaFisica(double rendaBruta) {
		
		if(rendaBruta >= 0 && rendaBruta <= 1400){
			valorImposto = 0;
			System.out.println("O Valor do Imposto de Renda de " + nome + " é de: " + valorImposto);
		}else if(rendaBruta >= 1400.01 && rendaBruta <= 2100) {
			valorImposto = 100;
			System.out.println("O Valor do Imposto de Renda de " + nome + " é de: " + valorImposto);
		}else if(rendaBruta >= 2100.0 && rendaBruta <=2800) {
			valorImposto = 270;
			System.out.println("O Valor do Imposto de Renda de " + nome + " é de: " + valorImposto);
		}else if(rendaBruta >= 2800.01 && rendaBruta <=3600) {
			valorImposto = 500;
			System.out.println("O Valor do Imposto de Renda de " + nome + " é de: " + valorImposto);
		}else if(rendaBruta >=3600.01) {
			valorImposto = 700;
			System.out.println("O Valor do Imposto de Renda de " + nome + " é de: " + valorImposto);
		}
	}
}
