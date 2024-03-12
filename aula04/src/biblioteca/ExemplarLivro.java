package biblioteca;

import java.util.ArrayList;
import java.util.Date;


public class ExemplarLivro {
	private int numeroSerie;
	private Date dataAquisicao;
	private double precoPago;
	private boolean emprestado;
	private boolean servivel;
	private Livro livro;
	
	private static ArrayList<ExemplarLivro> listaExemplares = new ArrayList<ExemplarLivro>();

	public ExemplarLivro(Date dataAquisicao, double precoPago, Livro livro) {
		numeroSerie = listaExemplares.size() + 1;
		this.dataAquisicao = dataAquisicao;
		this.precoPago = precoPago;
		this.emprestado = false;
		this.servivel = true;
		this.livro = livro;
		listaExemplares.add(this);
	}

	public boolean emprestarExemplar() {
		if (!this.servivel) return false;
		
		this.emprestado = true;
		return true;
	}

	public void registrarDevolucao() {
		this.emprestado = false;
	}
	
	public void registrarInservivel() {
		this.servivel = false;
	} 

	public int getNumeroSerie() {
		return numeroSerie;
	}
	
	public Date getDataAquisicao() {
		return dataAquisicao;
	}

	public double getPrecoPago() {
		return precoPago;
	}

	public boolean isEmprestado() {
		return emprestado;
	}

	public boolean isServivel() {
		return servivel;
	}

	public Livro getLivro() {
		return livro;
	}

	public static ArrayList<ExemplarLivro> getListaExemplares() {
		return listaExemplares;
	}

	@Override
	public String toString() {
		return String.format(
				"ExemplarLivro [numeroSerie=%s, dataAquisicao=%s, precoPago=%s, emprestado=%s, servivel=%s, livro=%s]",
				numeroSerie, dataAquisicao, precoPago, emprestado, servivel, livro);
	}

}
