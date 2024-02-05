import java.util.Date;
public class Principal {
	public static void main(String[] args) {
		System.out.println("Hola mundo!!");
		System.out.println(horaActual());
	}
	public static String horaActual() {
		Date fecha = new Date();
		return "Fecha actual: " + fecha;	
		
	}
}
