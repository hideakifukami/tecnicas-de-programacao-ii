package pizza;

import java.util.HashMap;
import java.util.Map;

public class Pizza {

	private int total_ingredientes;
	private static int total_pizzas;
	static Map<String, Integer> tabela_ingredientes = new HashMap<String, Integer>();
	
	
	public Pizza() {
		this.total_ingredientes = 0;
		this.total_pizzas++;
	}
	
	public void adicionarIngrediente(String ingrediente) {
		if (tabela_ingredientes.containsKey(ingrediente)) {
			int qtd = (tabela_ingredientes.get(ingrediente) + 1);
			tabela_ingredientes.replace(ingrediente, qtd);
		} else {
			tabela_ingredientes.put(ingrediente, 1);
		}
		
		contabilizaIngredientes();
		
	}

	public void contabilizaIngredientes() {
		this.total_ingredientes++;
	}
	
	public double getPreco() {
		if (this.total_ingredientes <= 2) return (45.00);
		if (this.total_ingredientes <= 5) return (60.00);
		return (90.00);		
	}

	public int getTotal_ingredientes() {
		return total_ingredientes;
	}

	public static int getTotal_pizzas() {
		return total_pizzas;
	}
		
	
}
