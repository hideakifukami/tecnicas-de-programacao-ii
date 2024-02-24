package guerra;

public class AliancaVizinho implements Estrategia {

	public void atacar() {
		vizinhoPeloNorte();
		atacarPeloSul();
	}

	private void vizinhoPeloNorte() {
		System.out.println("Vizinho pelo Norte!");
		
	}

	private void atacarPeloSul() {
		System.out.println("Atacar ao Sul!");
		
	}

	public void concluir() {
		dividirBeneficios();
		dividirReconstrucao();
	}

	private void dividirBeneficios() {
		System.out.println("Dividir Benefícios!");
	}

	private void dividirReconstrucao() {
		System.out.println("Divir Reconstrução!");
	}

}
