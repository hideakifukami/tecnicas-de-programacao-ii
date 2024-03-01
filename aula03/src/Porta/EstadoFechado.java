package Porta;

public class EstadoFechado implements Estado {

	public void clicar(Porta porta) {
		porta.setEstado(porta.ABRINDO);
	}
	
	public void status() {
		System.out.println("FECHADO");
	}

}
