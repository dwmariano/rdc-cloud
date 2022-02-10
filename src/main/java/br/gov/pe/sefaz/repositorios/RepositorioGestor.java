package br.gov.pe.sefaz.repositorios;

import java.util.ArrayList;

import br.gov.pe.sefaz.model.Gestor;

public class RepositorioGestor {
	
	static ArrayList<Gestor> listaGestores = new ArrayList<Gestor>();
	

// C = Create = Cadastrar
// R = Read   = buscar
// U = Update = editar
// D = Delete = excluir


	public void cadastrar(Gestor Gestor) {
		listaGestores.add(Gestor);
	}

	
	public Gestor buscar(int id) {
		for (int i = 0; i < listaGestores.size(); i++) {
			if(listaGestores.get(i).getId() == id) {
				return listaGestores.get(i);
			}
		}
		return null;
	}
	
	
	public void editar(Gestor gestor) {
		for (int i = 0; i < listaGestores.size(); i++) {
			if(listaGestores.get(i).getId() == gestor.getId()) {
				listaGestores.get(i).setNome(gestor.getNome());
				listaGestores.get(i).setSobrenome(gestor.getSobrenome());
				listaGestores.get(i).setEmail(gestor.getEmail());
			}
		}
	}
	
	
	public void excluir(Gestor Gestor) {
		for (int i = 0; i < listaGestores.size(); i++) {
			if(listaGestores.get(i).getId() == Gestor.getId()) {
				listaGestores.remove(i);
			}
		}
	}
	
	
	// Listar todos os gestores
	public ArrayList<Gestor> listarTodos() {
		return listaGestores;
	}
	
	

}
