package GatoQuantico;

public class Main {

	public static void main(String[] args) {
		GatoQuantico g1 = new GatoQuantico();
		
		g1.setEstado(g1.VIVO);
		g1.miar();
		g1.setEstado(g1.MORTO);
		g1.miar();
		g1.setEstado(g1.QUANTICO);
		g1.miar();

	}

}
