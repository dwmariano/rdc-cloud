package br.gov.pe.sefaz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.gov.pe.sefaz.model.Gestor;
import br.gov.pe.sefaz.repositorios.RepositorioGestor;
import br.gov.pe.sefaz.servico.ServicoGestor;


@Controller	
@RequestMapping("Gestor")
public class GestorController {
    
	RepositorioGestor repositorioGestores = new RepositorioGestor();
	ServicoGestor servicoGestor = new ServicoGestor();
	
	// Preenche o formuário de cadastro na tela
    @GetMapping("/cadastrar")
    public String cadastrar() {
        return "crud2cadastrar";
    }
    
    // Recebe o formulário preenchido para armazenar
    @PostMapping("/cadastrar")
    public String cadastrarGestor(Gestor gestor, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "redirect:/Gestor/listar";
        }
        repositorioGestores.cadastrar(gestor);
        return "redirect:/Gestor/listar";
    }

    @GetMapping("/listar")
    public String mostrarTodosGestores(Model model) {
        model.addAttribute("gestorTodos", servicoGestor.buscarTodos());
        return "crud2listar";
    }
    
    
    // Preenche os dados para edição
    @GetMapping("/editar/{id}")
    public String showUpdateForm(@PathVariable("id") int id, Model model) {
        Gestor gestor = repositorioGestores.buscar(id);
        model.addAttribute("gestor", gestor);
        return "crud2editar";
    }
    
    // Recebe os dados modificados e atualiza no sistema
    @PostMapping("/update/{id}")
    public String atualizarGestor(@PathVariable("id") int id,  Gestor gestor, 
      BindingResult result, Model model) {
        if (result.hasErrors()) {
            gestor.setId(id);
            return "crud2listar";
        }
        repositorioGestores.editar(gestor);
        return "redirect:/Gestor/listar";
    }
       
    // Recebe a ordem de deletar e remove do sistema
    @GetMapping("/delete/{id}")
    public String deleteGestor(@PathVariable("id") int id, Model model) {
        Gestor gestor = repositorioGestores.buscar(id);
        repositorioGestores.excluir(gestor);
        return "redirect:/Gestor/listar";
    }
}
