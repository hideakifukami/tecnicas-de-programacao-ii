package DaysOfWeek;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		DiaDaSemana dds = new DiaDaSemana();
		GregorianCalendar dataCorrente = new GregorianCalendar();
				
		dds.verificarDia(dataCorrente.get(Calendar.DAY_OF_WEEK));
		dds.exibirMensagem();
		
	}

}
