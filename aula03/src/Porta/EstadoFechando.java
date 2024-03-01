package Porta;

public class EstadoFechando implements Estado {

	public void clicar(Porta porta) {
		porta.setEstado(porta.FECHADO);
	}
	
	public void status() {
		System.out.println("FECHANDO");
	}

}
