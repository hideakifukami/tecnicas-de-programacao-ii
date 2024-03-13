package biblioteca;

import java.util.ArrayList;

public class Funcionario {

	private String nome;
	private int matricula;
	
	private static ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
	
	public Funcionario(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
		listaFuncionarios.add(this);
	}

	public static Funcionario pesquisarPorMatricula(int matricula) {		
		for (Funcionario funcionario: listaFuncionarios) {
			if (funcionario.matricula == matricula) {
				return funcionario;
			}
		}
		
		return null;
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
	
	public static ArrayList<Funcionario> getListaFuncionarios() {
		return listaFuncionarios;
	}

	@Override
	public String toString() {
		return String.format("Funcionario [nome=%s, matricula=%s]", nome, matricula);
	}

	
}
