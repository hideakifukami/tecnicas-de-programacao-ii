package Porta;

public class EstadoAberto implements Estado {

	public void clicar(Porta porta) {
		porta.setEstado(porta.MANTER_ABERTO);
	}
	
	public void status() {
		System.out.println("ABERTO");
	}

}
