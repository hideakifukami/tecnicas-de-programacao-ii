package biblioteca;

import java.util.ArrayList;

public class AreaDaAdvocacia{
	private String descricao;
	
	private static ArrayList<AreaDaAdvocacia> listaDeAreasDaAdvocacia = new ArrayList<AreaDaAdvocacia>();

	public AreaDaAdvocacia(String descricao) {
		this.descricao = descricao;
		listaDeAreasDaAdvocacia.add(this);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static ArrayList<AreaDaAdvocacia> getListaDeAreasDaAdvocacia() {
		return listaDeAreasDaAdvocacia;
	}

	@Override
	public String toString() {
		return String.format("AreaDaAdvocacia [descricao=%s]", descricao);
	}
	
	
}


