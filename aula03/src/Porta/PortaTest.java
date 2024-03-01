package Porta;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class PortaTest {

	@Test
	void testSetEstado() {
		Porta p1 = new Porta();
		p1.setEstado(p1.ABERTO);
		assertTrue(p1.estado instanceof EstadoAberto);
	}

	@Test
	void testClicar() {
		Porta p1 = new Porta();
		p1.setEstado(p1.FECHADO);
		p1.clicar();
		assertTrue(p1.estado instanceof EstadoAbrindo);
	}

	@Test
	void testExibirEstado() {
		Porta p1 = new Porta();
		p1.setEstado(p1.FECHADO);
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        p1.exibirEstado();
     
        assertTrue(outContent.toString().contains("FECHADO"));
	}

}
