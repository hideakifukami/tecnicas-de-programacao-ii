package br.com.fatec.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Persistencia {
	private static ArrayList<Usuario> listaDeUsuarios = new ArrayList<Usuario>();
	
	public static void cadastrar(Usuario usuario) {
		listaDeUsuarios.add(usuario);
	}
	
	public static Usuario buscar(int id) {
		for (Usuario usuario: listaDeUsuarios) {
			if (usuario.getId() == id) {
				return usuario;
			}
		}
		
		return null;
	}
	
	public static ArrayList<Usuario> listarUsuarios() {
		return listaDeUsuarios;
	}
	
	public static void atualizar(Usuario usuarioAtualizado) {
		Usuario usuario = buscar(usuarioAtualizado.getId());
		usuario.setLogin(usuarioAtualizado.getLogin());;
		usuario.setNome(usuarioAtualizado.getNome());
		usuario.setSenha(usuarioAtualizado.getSenha());
	}
	
	public static void excluir(int id) {
		Usuario usuario = buscar(id);
		listaDeUsuarios.remove(usuario);
	}
	
	public static void importar(ArrayList<String> agenda) {
		try {
			FileReader arq = new FileReader("agenda.txt");
			BufferedReader lerArq = new BufferedReader(arq);
			String linha = lerArq.readLine();
			while (linha != null) {
				agenda.add(linha);
				linha = lerArq.readLine();
			}
			arq.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.", e.getMessage());
		}
	}
}
