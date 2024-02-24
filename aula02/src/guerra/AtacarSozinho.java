package guerra;

public class AtacarSozinho implements Estrategia {

	public void atacar() {
		plantarEvidenciasFalsas();
		soltarBomba();
		derrubarGoverno();
	}

	private void plantarEvidenciasFalsas() {
		System.out.println("Evidências Plantadas!");
	}

	private void soltarBomba() {
		System.out.println("Soltar Bomba!");
		
	}

	private void derrubarGoverno() {
		System.out.println("Governo Derrubado!");
	}

	public void concluir() {
		estabelecerGovernoAmigo();
	}

	private void estabelecerGovernoAmigo() {
		System.out.println("Governo Amigo Estabelecido!");
		
	}

}
