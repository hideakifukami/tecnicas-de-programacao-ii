package pizza;

import java.util.ArrayList;

public class CarrinhoDeCompra {
	private double total_pagar = 0;
	
	ArrayList<Pizza> carrinho_de_compras = new ArrayList<Pizza>();
	
	// incluir pizza no carrinho se a mesma tiver ingredientes.
	public void adicionarItem(Pizza obj){
		if (obj.getNumeroIngredientes()>0){
			carrinho_de_compras.add(obj);
			total_pagar += obj.getPreco();
		}else System.out.println("item nao incluido!");
	}
	
	public int totalPizzasAdicionadas(){
		return carrinho_de_compras.size();
	}
	
	public double getTotalPagar(){ 
		return total_pagar;
	}
    
    public void listarItens(){
        for(int i=0; i<carrinho_de_compras.size(); i++)
            System.out.println(i+1 + " - " + carrinho_de_compras.get(i).getSabor());
    }
}