package Porta;

public class EstadoAbrindo implements Estado {

	public void clicar(Porta porta) {
		porta.setEstado(porta.ABERTO);
	}
	
	public void status() {
		System.out.println("ABRINDO");
	}

}
