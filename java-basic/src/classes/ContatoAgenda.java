package classes;

public class ContatoAgenda {
	private String nome;
	private String numeroTelefone;
	private String telefoneExtra;
	private String email;
	
	public ContatoAgenda(String nome, String numeroTelefone, String telefoneExtra, String email){
		this.email = email;
		this.nome = nome;
		this.numeroTelefone = numeroTelefone;
		this.telefoneExtra = telefoneExtra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumeroTelefone() {
		return numeroTelefone;
	}
	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	public String getTelefoneExtra() {
		return telefoneExtra;
	}
	public void setTelefoneExtra(String telefoneExtra) {
		this.telefoneExtra = telefoneExtra;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
