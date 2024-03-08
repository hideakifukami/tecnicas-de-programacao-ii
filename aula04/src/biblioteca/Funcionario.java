package biblioteca;

import java.util.ArrayList;

import interfaces.Mantivel;
import interfaces.Pesquisavel;

public class Funcionario implements Mantivel, Pesquisavel {

	private String nome;
	private int matricula;
	private static ArrayList<Funcionario> lista_funcionarios = new ArrayList<Funcionario>();

	
	public Funcionario() {}
	
	public Funcionario(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	@Override
	public void pesquisar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void manter() {
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

}
