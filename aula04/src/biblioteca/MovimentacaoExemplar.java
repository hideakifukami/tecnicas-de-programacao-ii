package biblioteca;

import java.util.ArrayList;
import java.util.Date;

public class MovimentacaoExemplar {

	private Date dataEmprestimo;
	private Date dataDevolucao;
	private ArrayList<ExemplarLivro> exemplares;
	private Funcionario funcionario;
	
	private static ArrayList<MovimentacaoExemplar> listaDeMovimentacoes = new ArrayList<MovimentacaoExemplar>();
	
	public MovimentacaoExemplar(Funcionario funcionario) {
		this.dataEmprestimo = new Date();
		//Dia, Hora, Minuto, Segundo, Milisegundo
		this.dataDevolucao = new Date(this.dataEmprestimo.getTime() + (5 * 24 * 60 * 60 * 1000));
		this.funcionario = funcionario;
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
	
	public void devolverExemplar(ExemplarLivro exemplar, boolean servivel) {
		if (!servivel) exemplar.registrarInservivel();
		
		exemplar.registrarDevolucao();
	}

	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public Date getDataDevolucao() {
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
				"MovimentacaoExemplar [dataEmprestimo=%s, dataDevolucao=%s, exemplares=%s, funcionario=%s]",
				dataEmprestimo, dataDevolucao, exemplares, funcionario);
	}
	
	

}
