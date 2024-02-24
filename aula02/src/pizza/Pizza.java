package pizza;

import java.util.Map;
import java.util.HashMap;

public class Pizza {
	private String sabor;
	private double preco;
	Map<Integer, String> ingredientes = new HashMap<Integer, String>();
	
	private int indice = 0;
	private int numero_ingredientes = 0;
	static int numero_pizzas = 0;
	
	/*
	 * cria uma Pizza do sabor passado por
	 * parametro no metodo construtor
	 * e contabiliza o numero de objetos do tipo
	 * Pizza instanciados  
	*/ 
	public Pizza(String sabor){
		this.sabor = sabor;
		numero_pizzas++;
	}
	
	public Pizza() {}
	
	public int getNumeroPizzas(){ return numero_pizzas; }
		
	public void escrevaNumeroPizzas(){	
		System.out.println("NumeroPizza = " + getNumeroPizzas());
	}
	
	public void adicionaIngredientes(String ingrediente){
		ingredientes.put(indice++, ingrediente);
		contabilizaIngrediente();
	}
	
	public void contabilizaIngrediente(){
		numero_ingredientes++;
	}
	
	public double getPreco(){
		if(ingredientes.size()<=3)
			preco = 45;
		else if (ingredientes.size()<=5)
			preco = 60;
		else 
			preco = 90;
		return preco;
	}
	
	public int getNumeroIngredientes(){
		return numero_ingredientes;
	}
	
	public void listarIngredientes(){
		for(int i=0; i<ingredientes.size(); i++)
			System.out.println(i+1 + " - " + ingredientes.get(i));	
	}
    
    public String getSabor(){ return sabor;}
}
