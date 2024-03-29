package guerra;

public class Guerra {
	Estrategia acao;
	
	public void definirEstrategia(Inimigo inimigo) {
		if (inimigo.exercito > 10000) {
			acao = new AliancaVizinho();
		} else if (inimigo.isNuclear) {
			acao = new Diplomacia();
		} else if (inimigo.hasNoChance) {
			acao = new AtacarSozinho();
		}
	} 
	
	public void declararGuerra() {
		acao.atacar();
	}
	
	public void encerrarGuerra() {
		acao.concluir();
	}
}
