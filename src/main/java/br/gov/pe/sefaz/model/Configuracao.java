package br.gov.pe.sefaz.model;


public class Configuracao {

	private String id;
	private String name;
	private String opcao;
	
	
	
	public Configuracao() {
		super();
	}



	public Configuracao(String id, String name, String opcao) {
		super();
		this.id = id;
		this.name = name;
		this.opcao = opcao;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getOpcao() {
		return opcao;
	}



	public void setOpcao(String opcao) {
		this.opcao = opcao;
	}



	@Override
	public String toString() {
		return "Configuracao [id=" + id + ", name=" + name + ", opcao=" + opcao + "]";
	}
	
	

}