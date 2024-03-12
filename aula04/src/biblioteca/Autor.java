package biblioteca;

import java.util.ArrayList;

public class Autor {
	private String nome;

	private static ArrayList<Autor> listaDeAutores = new ArrayList<Autor>();

	public Autor(String nome) {
		this.nome = nome;
		listaDeAutores.add(this);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static ArrayList<Autor> getListaDeAutores() {
		return listaDeAutores;
	}

	@Override
	public String toString() {
		return String.format("Autor [nome=%s]", nome);
	}
	
}
