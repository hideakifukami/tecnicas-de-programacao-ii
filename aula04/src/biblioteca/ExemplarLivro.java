package biblioteca;

import java.util.Date;

import interfaces.Mantivel;
import interfaces.Pesquisavel;
import interfaces.Selecionavel;

public class ExemplarLivro implements Mantivel, Pesquisavel, Selecionavel {

	private Date data_aquisicao;
	private double preco;
	private boolean ativo;
	private Livro livro;
	
	@Override
	public void selecionar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pesquisar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void manter() {
		// TODO Auto-generated method stub
		
	}

	public void ativarDesativas() {
		
	}
}
