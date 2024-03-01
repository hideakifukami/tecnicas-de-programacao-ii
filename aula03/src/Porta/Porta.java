package Porta;

public class Porta {

	public final Estado ABERTO = new EstadoAberto();
	public final Estado ABRINDO = new EstadoAbrindo();
	public final Estado FECHADO = new EstadoFechado();
	public final Estado FECHANDO = new EstadoFechando();
	public final Estado MANTER_ABERTO = new EstadoManterAberta();
	
	public Estado estado;
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public void status() {
		estado.status();
	}
	
}
