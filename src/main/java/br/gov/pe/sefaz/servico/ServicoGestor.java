package br.gov.pe.sefaz.servico;

import java.util.ArrayList;

import br.gov.pe.sefaz.model.Gestor;
import br.gov.pe.sefaz.repositorios.RepositorioGestor;



public class ServicoGestor {

    static RepositorioGestor repositoriogestores = new RepositorioGestor();

    public ServicoGestor() {
    	
    	// Cadastrar
    	repositoriogestores.cadastrar(new Gestor(1, "Gestor1", "g1", "gestor1@sefaz.pe.gov.br"));
    	repositoriogestores.cadastrar(new Gestor(2, "Gestor2", "g2", "gestor2@sefaz.pe.gov.br"));
    	repositoriogestores.cadastrar(new Gestor(3, "Gestor3", "g3", "gestor3@sefaz.pe.gov.br"));

    	
    	// Ler/Buscar
    	repositoriogestores.buscar(1);
    	
    	// Editar
    	Gestor gestor = new Gestor(4, "Teste", "Teste", "teste.teste@sefaz.pe.gov.br");
    	repositoriogestores.editar(gestor);
    	
    	// Excluir
    	Gestor gestorExcluir = new Gestor(4, "remover id 4", "0", "0");
    	repositoriogestores.excluir(gestorExcluir);
    	
    }

    public void salvar(Gestor gestor) {
    	repositoriogestores.cadastrar(gestor);
    }
    
    public static ArrayList<Gestor> buscarTodos() {
    	ArrayList<Gestor> gestores = repositoriogestores.listarTodos();
        return gestores;
    }
	
	
	

}
