package carro;

public class Main {

	public static void main(String[] args) {

		Carro carro1 = new Carro("Chevronelson", "Onix", 10, 100, 2012);
		Carro carro2 = new Carro("Renelson", "Clio", 20, 120, 2012);
		Carro carro3 = new Carro("Chevronelson", "Onix", 20, 80, 2012);
		
		System.out.println(carro2.obterVelocidade());
		carro2.acelerar();
		System.out.println(carro2.obterVelocidade());
		carro2.frear();
		System.out.println(carro2.obterVelocidade());
		System.out.println(carro1.eIgual(carro3));
		System.out.println(carro1.eIgual(carro2));

	}

}
