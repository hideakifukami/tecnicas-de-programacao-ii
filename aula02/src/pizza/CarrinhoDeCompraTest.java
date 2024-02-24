package pizza;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarrinhoDeCompraTest {

	@Test
	void testGetTotalPagar() {
		Pizza p1 = new Pizza("Mussarela");	// 45.00
		p1.adicionaIngredientes("mussarela");
		p1.adicionaIngredientes("oregano");
		
		Pizza p2 = new Pizza("4 Queijos");	// 60.00
		p2.adicionaIngredientes("gorgonzola");
		p2.adicionaIngredientes("parmesão");
		p2.adicionaIngredientes("mussarela");
		p2.adicionaIngredientes("brie");
		
		Pizza p3 = new Pizza("Portuguesa");	// 90.00
		p3.adicionaIngredientes("mussarela");
		p3.adicionaIngredientes("ovo");
		p3.adicionaIngredientes("presunto");
		p3.adicionaIngredientes("pimentão");
		p3.adicionaIngredientes("cebola");
		p3.adicionaIngredientes("tomate");
		
		CarrinhoDeCompra c1 = new CarrinhoDeCompra();
		c1.adicionarItem(p1);
		c1.adicionarItem(p2);
		c1.adicionarItem(p3);
		
		assertEquals(195.00, c1.getTotalPagar());
	}
}
