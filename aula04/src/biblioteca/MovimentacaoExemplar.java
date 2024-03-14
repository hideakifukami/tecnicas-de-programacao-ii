package biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;

public class MovimentacaoExemplar {
	private int numeroSerie;
	private LocalDate dataEmprestimo;
	private LocalDate dataDevolucao;
	private ArrayList<ExemplarLivro> exemplares;
	private Funcionario funcionario;
	
	private static ArrayList<MovimentacaoExemplar> listaDeMovimentacoes = new ArrayList<MovimentacaoExemplar>();
	
	public MovimentacaoExemplar(int matriculaFuncionario) {
		this.numeroSerie = listaDeMovimentacoes.size() + 1;
		this.dataEmprestimo = LocalDate.now();
		//Dia, Hora, Minuto, Segundo, Milisegundo
		this.dataDevolucao = dataEmprestimo.plusDays(5);
		this.funcionario = Funcionario.pesquisarPorMatricula(matriculaFuncionario);
		listaDeMovimentacoes.add(this);
	}

	public void emprestarExemplar(ExemplarLivro exemplar) {
		for (ExemplarLivro exemplarItem: exemplares) {
			if (exemplarItem.getLivro().equals(exemplar.getLivro())) {
				return;
			}
		}
		
		if (exemplares.size() > 4) return;
		
		if(exemplar.emprestarExemplar()) {
			exemplares.add(exemplar);
		}
	}
	
	public static void devolverExemplar(ExemplarLivro exemplar, boolean servivel) {
		if (!servivel) exemplar.registrarInservivel();
		
		exemplar.registrarDevolucao();
	}

	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}

	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}

	public ArrayList<ExemplarLivro> getExemplares() {
		return exemplares;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public static ArrayList<MovimentacaoExemplar> getListaDeMovimentacoes() {
		return listaDeMovimentacoes;
	}

	@Override
	public String toString() {
		return String.format(
				"MovimentacaoExemplar [numeroSerie =%s, dataEmprestimo=%s, dataDevolucao=%s, exemplares=%s, funcionario=%s]",
				numeroSerie, dataEmprestimo, dataDevolucao, exemplares, funcionario);
	}
	
	

}
