package br.gov.pe.sefaz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.gov.pe.sefaz.model.Config;
import br.gov.pe.sefaz.servico.ServicoConfig;


@Controller	
@RequestMapping("Config")
public class ConfigController {
	
	ServicoConfig servicoConfiguracao = new ServicoConfig();;
    
	// Preenche o formuário de cadastro na tela
    @GetMapping("/listar")
    public String cadastrar(Model model) {
    	model.addAttribute("config", servicoConfiguracao);
        return "configuracoes";
    }
    
    // Recebe o formulário preenchido para armazenar
    @PostMapping("/salvar")
    public String cadastrarAnalista(Config config, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "redirect:/Config/listar";
        }
        servicoConfiguracao.salvar(config);
        return "configuracoes";
    }
}
