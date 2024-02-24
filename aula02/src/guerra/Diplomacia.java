package guerra;

public class Diplomacia implements Estrategia {

	public void atacar() {
		recuarTropas();
		proporCooperacaoEconomica();
	}

	private void recuarTropas() {
		System.out.println("Recuar Tropas!");
		
	}

	private void proporCooperacaoEconomica() {
		System.out.println("Cooperação Econômica!");
		
	}

	public void concluir() {
		desarmarInimigo();
	}

	private void desarmarInimigo() {
		System.out.println("Desarmar Inimigo!");
		
	}

}
