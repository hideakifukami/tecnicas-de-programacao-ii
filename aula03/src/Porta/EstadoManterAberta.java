package Porta;

public class EstadoManterAberta implements Estado {

	public void clicar(Porta porta) {
		porta.setEstado(porta.FECHANDO);
	}
	
	public void status() {
		System.out.println("MANTER ABERTO");
	}

}
