package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import carro.Carro;

class CarroTest {

	@Test //Testa tudo de uma vez enquanto @AfterEach testa depois de cada teste
	final void testAcelerar() {
		Carro carro1 = new Carro("Chevronelson", "Onix", 10, 100, 2012);
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		assertEquals(140, carro1.obterVelocidade());
	}
	
	@Test
	final void testeFrear() {
		Carro carro1 = new Carro("Chevronelson", "Onix", 10, 100, 2012);
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.frear();
		assertEquals(0, carro1.obterVelocidade());

	}
	
	@Test
	final void testeIgual() {
		Carro carro1 = new Carro("Chevronelson", "Onix", 10, 100, 2012);
		Carro carro3 = new Carro("Chevronelson", "Onix", 20, 200, 2012);
		boolean aux = carro1.eIgual(carro3);
		assertTrue(aux);
	}

}
