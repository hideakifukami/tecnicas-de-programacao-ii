package Porta;

public class Porta {

	public final Estado ABERTO = new EstadoAberto();
	public final Estado ABRINDO = new EstadoAbrindo();
	public final Estado FECHADO = new EstadoFechado();
	public final Estado FECHANDO = new EstadoFechando();
	public final Estado MANTER_ABERTO = new EstadoManterAberta();
	
	public Estado estado;
	
	public void clicar() {
        if (estado == FECHADO) {
            estado = ABRINDO;
        } else if (estado == ABRINDO) {
            estado = ABERTO;
        } else if (estado == ABERTO) {
            estado = MANTER_ABERTO;
        } else if (estado == MANTER_ABERTO) {
            estado = FECHANDO;
        } else if (estado == FECHANDO) {
            estado = FECHADO;
        } 
    }
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public void exibirEstado() {
		estado.exibirEstado();
	}
	
}
