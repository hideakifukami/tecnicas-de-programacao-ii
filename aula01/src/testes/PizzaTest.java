package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pizza.Pizza;

class PizzaTest {

	@Test
	final void testGetTotal_pizzas() {
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		Pizza p3 = new Pizza();
		assertEquals(3, p1.getTotal_pizzas());	
	}
	
	@Test
	final void testAdicionarIngrediente() {
		Pizza p1 = new Pizza();
		p1.adicionarIngrediente("Mussarela");
		p1.adicionarIngrediente("Tomate");
		p1.adicionarIngrediente("Manjericão");
		assertEquals(60.00, p1.getPreco());
	}

	@Test
	final void testContabilizaIngredientes() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	final void testGetPreco() {
		fail("Not yet implemented"); // TODO
	}

}
