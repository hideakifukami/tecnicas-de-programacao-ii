package biblioteca;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import interfaces.Mantivel;
import interfaces.Pesquisavel;

public class Livro implements Mantivel, Pesquisavel{

	private int isbn;
	private String titulo;
	private Autor[] autores;
	private Editora editora;
	private AreaAdvocatica areaAdvocatica;
	private boolean servivel;
	
	@Override
	public void pesquisar() {
		
		
	}
	@Override
	public void manter() {
		// TODO Auto-generated method stub
		
	}
}
