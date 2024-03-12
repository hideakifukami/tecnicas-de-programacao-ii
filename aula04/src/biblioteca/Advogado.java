package biblioteca;

import java.util.ArrayList;

public class Advogado extends Funcionario {
	private String numeroOAB;
	
	private static ArrayList<Advogado> listaAdvogados = new ArrayList<Advogado>();

	public Advogado(String nome, int matricula, String numeroOAB) {
		super(nome, matricula);
		this.numeroOAB = numeroOAB;
		listaAdvogados.add(this);
	}

	public String getNumeroOAB() {
		return numeroOAB;
	}

	public void setNumeroOAB(String numeroOAB) {
		this.numeroOAB = numeroOAB;
	}
	
	public static ArrayList<Advogado> getListaAdvogados() {
		return listaAdvogados;
	}

	@Override
	public String toString() {
		return String.format("Advogado [numeroOAB=%s]", numeroOAB);
	}
	
}
