package biblioteca;

import java.util.ArrayList;

public class Editora {
	private String nome;
	
	private static ArrayList<Editora> listaDeEditoras = new ArrayList<Editora>();

	public Editora(String nome) {
		this.nome = nome;
		listaDeEditoras.add(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static ArrayList<Editora> getListaDeEditoras() {
		return listaDeEditoras;
	}

	@Override
	public String toString() {
		return String.format("Editora [nome=%s]", nome);
	}
	
	
}

