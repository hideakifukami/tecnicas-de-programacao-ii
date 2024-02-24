package DaysOfWeek;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		DiaDaSemana dds = new DiaDaSemana();
		Date date = new Date();
		GregorianCalendar dataCorrente = new GregorianCalendar(2024, 2, 23);
		
		System.out.println(dataCorrente.get(Calendar.DAY_OF_WEEK));

		dds.verificarDia(dataCorrente.get(Calendar.DAY_OF_WEEK));
		
		dds.exibirMensagem();
		
		System.out.println(Calendar.DAY_OF_WEEK);
		
	}

}
