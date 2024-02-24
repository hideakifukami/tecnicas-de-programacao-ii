package animal;

public class Main {

	public static void main(String[] args) {
		Animal pet = new Gato();
		pet.falar();
		pet = new Cao();
		pet.falar();
	}
}
