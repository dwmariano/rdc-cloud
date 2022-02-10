package br.gov.pe.sefaz.model;

public class Config {
	
	private String configuracao1;
	private String configuracao2;
	private String configuracao3;
	
	
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
		return "Config [configuracao1=" + configuracao1 + ", configuracao2=" + configuracao2
				+ ", configuracao3=" + configuracao3 + "]";
	}
	
	public Config(String configuracao1, String configuracao2, String configuracao3) {
		super();
		this.configuracao1 = configuracao1;
		this.configuracao2 = configuracao2;
		this.configuracao3 = configuracao3;
	}
	
	public Config() {
		super();

	}


}
