package Reto3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Reto3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		LocalDate fecha1 = Funciones.dimeFecha("Escribe una fecha", sc);

		LocalDate fecha2 = Funciones.dimeFecha("Escribe otra fecha", sc);

		if (fecha2.isBefore(fecha1)) {
			fecha2 = Funciones.dimeFecha("Escribe otra fecha que sea mayor que la primera", sc);
		}
		System.out.println(fecha1);
		System.out.println(fecha2);

	}
	


}
