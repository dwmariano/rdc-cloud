package br.gov.pe.sefaz.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.gov.pe.sefaz.model.Configuracao;
import br.gov.pe.sefaz.servico.ServicosConfiguracao;


@Controller	
@RequestMapping("Configuracao")
public class ConfiguracaoController {
	
	ServicosConfiguracao servicoConfiguracao = new ServicosConfiguracao();;
    
	private static List<String> opcoes;
	static {
		opcoes = new ArrayList<>();
		opcoes.add("CONFIGURACAO_1");
		opcoes.add("CONFIGURACAO_2");
		opcoes.add("CONFIGURACAO_3");
	}

	
	@GetMapping(path = "/configuracoes")
	public String preencherConfiguracoes(Model model) {
		model.addAttribute("opcoes", opcoes);
		model.addAttribute("opcaoselecionada", servicoConfiguracao.getConfiguracaoSelecionadaString());
		return "configuracoes";
	}
	
    // Salvar configurações
    @PostMapping("/salvarconfig")
    public String salvarConfiguracoes(@ModelAttribute("configuracao") Configuracao configuracao, Model model) {
		servicoConfiguracao.setConfiguracaoSelecionada(configuracao);
        return "redirect:/";
    }
    
	
}
