package pizza;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PizzaTest {

	@Test
	public void testGetPreco() {
		Pizza p1 = new Pizza();
		p1.adicionaIngredientes("mussarela");
		p1.adicionaIngredientes("oregano");		
		assertEquals(45,p1.getPreco(),0);
	}
	
	@Test
	public void testGetPreco3Ingredientes() {
		Pizza p1 = new Pizza();
		p1.adicionaIngredientes("mussarela");
		p1.adicionaIngredientes("oregano");
		p1.adicionaIngredientes("mangericao");
		
		assertEquals(60,p1.getPreco(),0);
	}
	
	@Test
	public void testGetPreco6Ingredientes() {
		Pizza p1 = new Pizza();
		p1.adicionaIngredientes("mussarela");
		p1.adicionaIngredientes("oregano");
		p1.adicionaIngredientes("mangericao");
		p1.adicionaIngredientes("ovo");
		p1.adicionaIngredientes("presunto");
		p1.adicionaIngredientes("pimentao");
		assertEquals(90,p1.getPreco(),0);
	}
}
