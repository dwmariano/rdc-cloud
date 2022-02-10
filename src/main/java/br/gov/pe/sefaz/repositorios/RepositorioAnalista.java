package br.gov.pe.sefaz.repositorios;

import java.util.ArrayList;

import br.gov.pe.sefaz.model.Analista;


public class RepositorioAnalista {
	
	static ArrayList<Analista> listaAnalistas = new ArrayList<Analista>();
	

// C = Create = Cadastrar
// R = Read   = buscar
// U = Update = editar
// D = Delete = excluir


	public void cadastrar(Analista analista) {
		listaAnalistas.add(analista);
	}

	
	public Analista buscar(int id) {
		for (int i = 0; i < listaAnalistas.size(); i++) {
			if(listaAnalistas.get(i).getId() == id) {
				return listaAnalistas.get(i);
			}
		}
		return null;
	}
	
	
	public void editar(Analista analista) {
		for (int i = 0; i < listaAnalistas.size(); i++) {
			if(listaAnalistas.get(i).getId() == analista.getId()) {
				listaAnalistas.get(i).setNome(analista.getNome());
				listaAnalistas.get(i).setSobrenome(analista.getSobrenome());
				listaAnalistas.get(i).setEmail(analista.getEmail());
			}
		}
	}
	
	
	public void excluir(Analista analista) {
		for (int i = 0; i < listaAnalistas.size(); i++) {
			if(listaAnalistas.get(i).getId() == analista.getId()) {
				listaAnalistas.remove(i);
			}
		}
	}
	
	
	// Listar todos os analitas
	public ArrayList<Analista> listarTodos() {
		return listaAnalistas;
	}
	
	

}
