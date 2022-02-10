package br.gov.pe.sefaz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.gov.pe.sefaz.model.Analista;
import br.gov.pe.sefaz.repositorios.RepositorioAnalista;
import br.gov.pe.sefaz.repositorios.RepositorioGestor;
import br.gov.pe.sefaz.servico.ServicoAnalista;
import br.gov.pe.sefaz.servico.ServicoGestor;




@Controller	
@RequestMapping("Analista")
public class AnalistaController {
    
	RepositorioAnalista repositorioAnalistas = new RepositorioAnalista();
	ServicoAnalista servicoAnalista = new ServicoAnalista();
	
	// Preenche o formuário de cadastro na tela
    @GetMapping("/cadastrar")
    public String cadastrar() {
        return "crud1cadastrar";
    }
    
    // Recebe o formulário preenchido para armazenar
    @PostMapping("/cadastrar")
    public String cadastrarAnalista(Analista analista, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "redirect:/Analista/listar";
        }
        repositorioAnalistas.cadastrar(analista);
        return "redirect:/Analista/listar";
    }

    @GetMapping("/listar")
    public String mostrarTodosAnalistas(Model model) {
        model.addAttribute("analistaTodos", servicoAnalista.buscarTodos());
        return "crud1listar";
    }
    
    
    // Preenche os dados para edição
    @GetMapping("/editar/{id}")
    public String showUpdateForm(@PathVariable("id") int id, Model model) {
    	Analista analista = repositorioAnalistas.buscar(id);
        model.addAttribute("analista", analista);
        return "crud1editar";
    }
    
    // Recebe os dados modificados e atualiza no sistema
    @PostMapping("/update/{id}")
    public String atualizarAnalista(@PathVariable("id") int id,  Analista analista, 
      BindingResult result, Model model) {
        if (result.hasErrors()) {
        	analista.setId(id);
            return "crud1listar";
        }
        repositorioAnalistas.editar(analista);
        return "redirect:/Analista/listar";
    }
       
    // Recebe a ordem de deletar e remove do sistema
    @GetMapping("/delete/{id}")
    public String deleteAnalista(@PathVariable("id") int id, Model model) {
        Analista analista = repositorioAnalistas.buscar(id);
        repositorioAnalistas.excluir(analista);
        return "redirect:/Analista/listar";
    }
}
