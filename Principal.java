import java.time.LocalDateTime;
import java.util.Date;
public class Principal {
	public static void main(String[] args) {
		System.out.println("Hola mundo!!");
		System.out.println(horaActual());
	}
	public static String horaActual() {
		Date fecha = new Date();
		LocalDateTime localDate = LocalDateTime.now();
		int hours = localDate.getHour();
		int minutes = localDate.getMinute();
		int seconds = localDate.getSecond();	

		return "Fecha actual: " + fecha;	
	}
}
