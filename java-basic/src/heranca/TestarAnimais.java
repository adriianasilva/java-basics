package heranca;

public class TestarAnimais {
	
	public static void main(String[] args) {
		Mamifero camelo = new Mamifero(null, null, 0, 0, null, null, 0, null);
		camelo.setNome("Camelo");
		camelo.setComprimento(150);
		camelo.setNumeroDePatas(4);
		camelo.setCor("Amarelo");
		camelo.setAmbiente("Terra");
		camelo.setVelocidadeMedia(2);
		
		Peixe tubarao = new Peixe(null, null, 0, 0, null, null, 0);
		tubarao.setNome("Tubarão");
		tubarao.setComprimento(300);
		tubarao.setNumeroDePatas(0);
		tubarao.setCor("Cinzento");
		tubarao.setAmbiente("Mar");
		tubarao.setVelocidadeMedia(1.5);
		tubarao.setCaracteristica("Barbatanas");		
		
		Mamifero ursocanada = new Mamifero(null, null, 0, 0, null, null, 0, null);
		ursocanada.setNome("Urso-do-canadá");
		ursocanada.setComprimento(180);
		ursocanada.setNumeroDePatas(4);
		ursocanada.setCor("Vermelho");
		ursocanada.setAmbiente("Terra");
		ursocanada.setVelocidadeMedia(0.5);
		ursocanada.setAlimento("Mel");	
		
		camelo.dadosMamifero();
		ursocanada.dadosMamifero();
		tubarao.dadosPeixe();
		
	}

}
