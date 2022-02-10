package br.gov.pe.sefaz.servico;

import java.util.ArrayList;

import br.gov.pe.sefaz.model.Configuracao;

public class ServicosConfiguracao {

	ArrayList<Configuracao> configs = new ArrayList<Configuracao>();
	Configuracao opcaoarmazenada = new Configuracao();
	
	
	public ServicosConfiguracao() {
		
		opcaoarmazenada.setOpcao("CONFIGURACAO_2");

	}

	
	public ArrayList<Configuracao> getConfigs() {
		return configs;
	}

	public void setConfigs(ArrayList<Configuracao> configs) {
		this.configs = configs;
	}


	public Configuracao getConfiguracaoSelecionada() {
		return opcaoarmazenada;
	}

	public String getConfiguracaoSelecionadaString() {
		return opcaoarmazenada.getOpcao();
	}

	public void setConfiguracaoSelecionada(Configuracao configuracaoSelecionada) {
		this.opcaoarmazenada = configuracaoSelecionada;
	}

	
	
}

