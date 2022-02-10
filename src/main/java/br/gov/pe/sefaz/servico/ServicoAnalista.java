package br.gov.pe.sefaz.servico;

import java.util.ArrayList;

import br.gov.pe.sefaz.model.Analista;
import br.gov.pe.sefaz.repositorios.RepositorioAnalista;



public class ServicoAnalista {

    static RepositorioAnalista repositorioAnalistas = new RepositorioAnalista();

    public ServicoAnalista() {
    	
    	// Cadastrar
    	repositorioAnalistas.cadastrar(new Analista(1, "Analista 1", "nível 1", "analista1@sefaz.pe.gov.br"));
    	repositorioAnalistas.cadastrar(new Analista(2, "Analista 2", "nível 2", "analista2@sefaz.pe.gov.br"));
    	repositorioAnalistas.cadastrar(new Analista(3, "Analista 3", "nível 3", "analista3@sefaz.pe.gov.br"));

    	
    	// Ler/Buscar
    	repositorioAnalistas.buscar(1);
    	
    	// Editar
    	Analista analista = new Analista(4, "Teste", "Teste", "teste.teste@sefaz.pe.gov.br");
    	repositorioAnalistas.editar(analista);
    	
    	// Excluir
    	Analista analistaExcluir = new Analista(4, "remover id 4", "0", "0");
    	repositorioAnalistas.excluir(analistaExcluir);
    	
    }

    public void salvar(Analista analista) {
    	repositorioAnalistas.cadastrar(analista);
    }
    
    public static ArrayList<Analista> buscarTodos() {
    	ArrayList<Analista> analista = repositorioAnalistas.listarTodos();
        return analista;
    }
	
	
	

}
