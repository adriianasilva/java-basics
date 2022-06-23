package relacionamentoentreclasses;

public class Main {

	public static void main(String[] args) {
		//relacionamento tem muitos - muitos contatos p uma agenda
		Agenda agenda = new Agenda();
		
		agenda.setNome("Agendinha");
		
		Contato contato = new Contato();
		contato.setNome("Adriana");
		contato.setEmail("blablaba@blabla.com");
		contato.setTelefone("71 96595-9696");
		
		Contato contato2 = new Contato();
		contato2.setNome("Larissa");
		contato2.setEmail("larissa@kda.com");
		contato2.setTelefone("52-6656-6365");
		
		Contato contato3 = new Contato();
		contato3.setNome("Maurice");
		contato3.setEmail("lofi@fla.com");
		contato3.setTelefone("22 6315-6691");
		
		Contato[] contatos = new Contato[3];
		contatos[0] = contato;
		contatos[1] = contato2;
		contatos[2] = contato3;
		
		agenda.setContatos(contatos);
		
		if(agenda != null && agenda.getContatos() != null) {
			System.out.println(agenda.getNome());
			for(Contato c : agenda.getContatos()) {
				System.out.println(c.getNome() + " " + c.getEmail() + " " + c.getTelefone());
			}
		}
	}

}
