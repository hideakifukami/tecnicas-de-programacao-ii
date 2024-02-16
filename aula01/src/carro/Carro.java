package carro;

public class Carro {

	private String marca;
	private String modelo;
	private double potencia;
	private double velocidade;
	private int ano;
	
	public Carro(double potencia, double velocidade) {
		this.potencia = potencia;
		this.velocidade = velocidade;
	}

	public Carro(String marca, String modelo, double potencia, double velocidade, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
		this.velocidade = velocidade;
		this.ano = ano;
	}

	public double obterVelocidade() {
		return this.velocidade;
	}
	
	public void acelerar() {
		velocidade += 10; 
	}
	
	private void reduzir() {
		if (velocidade >= 10) {
			velocidade -= potencia;	
		}
	}
	
	private void parar() {
		velocidade = 0;
	}
	
	public void frear() {
		while (velocidade > 0) {
			reduzir();
			if (velocidade < potencia) {
				parar();
			}
		}
	}
	
	public boolean eIgual(Carro carro) {
		if(this.marca == carro.marca && this.modelo == carro.modelo && this.ano == carro.ano) {
			return true;
		} else {
			return false;
		}
		
	}
	
}
