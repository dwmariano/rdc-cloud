package br.gov.pe.sefaz.servico;

import br.gov.pe.sefaz.model.Config;



public class ServicoConfig {

    String configuracao1 = "";
    String configuracao2 = "";
    String configuracao3 = "";

    public ServicoConfig() {
    	
    	// Cadastrar
    	this.configuracao1 = "...";
    	this.configuracao2 = "...";
    	this.configuracao3 = "...";
    	
    	// Excluir
    	this.configuracao3 = "";

    	// Editar
    	this.configuracao3 = "...";

    }

    public void salvar(Config config) {
    	this.configuracao1 = config.getConfiguracao1();
    	this.configuracao2 = config.getConfiguracao2();
    	this.configuracao3 = config.getConfiguracao3();
    }

	public String getConfiguracao1() {
		return configuracao1;
	}

	public void setConfiguracao1(String configuracao1) {
		this.configuracao1 = configuracao1;
	}

	public String getConfiguracao2() {
		return configuracao2;
	}

	public void setConfiguracao2(String configuracao2) {
		this.configuracao2 = configuracao2;
	}

	public String getConfiguracao3() {
		return configuracao3;
	}

	public void setConfiguracao3(String configuracao3) {
		this.configuracao3 = configuracao3;
	}

	@Override
	public String toString() {
		return "ServicoConfig [configuracao1=" + configuracao1 + ", configuracao2=" + configuracao2 + ", configuracao3="
				+ configuracao3 + "]";
	}

	public ServicoConfig(String configuracao1, String configuracao2, String configuracao3) {
		super();
		this.configuracao1 = configuracao1;
		this.configuracao2 = configuracao2;
		this.configuracao3 = configuracao3;
	}


}
