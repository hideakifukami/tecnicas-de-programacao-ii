package biblioteca;

import java.util.ArrayList;
import java.util.Arrays;

public class Livro {

	private int isbn;
	private String titulo;
	private Autor[] autores;
	private Editora editora;
	private AreaDaAdvocacia areaDaAdvocacia;
	
	private static ArrayList<Livro> listaDeLivros = new ArrayList<Livro>();
	
	public Livro(int isbn, String titulo, Autor[] autores, Editora editora, AreaDaAdvocacia areaDaAdvocacia) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autores = autores;
		this.editora = editora;
		this.areaDaAdvocacia = areaDaAdvocacia;
		listaDeLivros.add(this);
	}

	public static ArrayList<Livro> pesquisarPorTitulo(String titulo) {
		ArrayList<Livro> listaAuxiliar = new ArrayList<Livro>();
		for (Livro livro: listaDeLivros) {
			if (livro.titulo.equalsIgnoreCase(titulo)) {
				listaAuxiliar.add(livro);
			}
		}
		return listaAuxiliar;
	}
	
	public static ArrayList<Livro> pesquisarPorAutor(String autor) {
		ArrayList<Livro> listaAuxiliar = new ArrayList<Livro>();
		for (Livro livro: listaDeLivros) {
			for (Autor autorItem: autores) {
				if (autorItem.getNome().equalsIgnoreCase(autor)) {
					listaAuxiliar.add(livro);
				}
			}
		}
		return listaAuxiliar;
	}
	
	public static ArrayList<Livro> pesquisarPorEditora(String editora) {
		ArrayList<Livro> listaAuxiliar = new ArrayList<Livro>();
		for (Livro livro: listaDeLivros) {
			if (livro.editora.getNome().equalsIgnoreCase(editora)) {
				listaAuxiliar.add(livro);
			}
		}
		return listaAuxiliar;
	}

	public int getIsbn() {
		return isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public Autor[] getAutores() {
		return autores;
	}

	public Editora getEditora() {
		return editora;
	}

	public AreaDaAdvocacia getAreaDaAdvocacia() {
		return areaDaAdvocacia;
	}

	public static ArrayList<Livro> getListaDeLivros() {
		return listaDeLivros;
	}

	@Override
	public String toString() {
		return String.format("Livro [isbn=%s, titulo=%s, autores=%s, editora=%s, areaDaAdvocacia=%s]", isbn, titulo,
				Arrays.toString(autores), editora, areaDaAdvocacia);
	}
	
	
	
}
