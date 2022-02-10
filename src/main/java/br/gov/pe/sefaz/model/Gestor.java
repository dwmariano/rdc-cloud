package br.gov.pe.sefaz.model;

public class Gestor {
	
	private int id;
	private String nome;
	private String sobrenome;
	private String email;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		return "Gestor [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", email=" + email + "]";
	}
	
	public String getDados() {
		return "id=" + id + "|nome=" + nome + "|sobrenome=" + sobrenome + "|email=" + email;	
	}
	
	
	public Gestor(int id, String nome, String sobrenome, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
	}
	
}
