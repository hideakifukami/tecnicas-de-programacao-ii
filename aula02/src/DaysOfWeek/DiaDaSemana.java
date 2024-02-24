package DaysOfWeek;

public class DiaDaSemana {
	
	Strategy strategy;
	
	public void verificarDia(int dia) {
		switch (dia) {
		case 0:
			strategy = new Domingo();
			break;
			
		case 1:
			strategy = new Segunda();
			break;

		case 2:
			strategy = new Terca();
			break;

		case 3:
			strategy = new Quarta();
			break;

		case 4:
			strategy = new Quinta();
			break;

		case 5:
			strategy = new Sexta();
			break;

		case 6:
			strategy = new Sabado();
			break;

		default:
			System.out.println("Dia Inválido!");
			break;
		}
	}
	
	public void exibirMensagem() {
		strategy.mensagemDoDia();
	}
	
}
