package guerra;

public class Main {

	public static void main(String[] args) {
		Inimigo inimigo1 = new Inimigo(13000, false, false);
		Inimigo inimigo2 = new Inimigo(5000, true, false);
		Inimigo inimigo3 = new Inimigo(2000, false, true);
		
		Guerra guerra = new Guerra();
		
		guerra.definirEstrategia(inimigo1);
		guerra.declararGuerra();
		guerra.encerrarGuerra();
		guerra.definirEstrategia(inimigo2);
		guerra.declararGuerra();
		guerra.encerrarGuerra();
		guerra.definirEstrategia(inimigo3);
		guerra.declararGuerra();
		guerra.encerrarGuerra();
	}
}
