package Reto3;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Reto3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		LocalDate fecha1 = Funciones.dimeFecha("Introduce una fecha", sc);
		LocalDate fecha2;

		do {

			fecha2 = Funciones.dimeFecha("Introduce una fecha (debe ser después de la primera)", sc);

		} while (!fecha1.isBefore(fecha2));

		if (fecha1.getYear() == fecha2.getYear()
				&& (fecha1.getMonth() != fecha2.getMonth() || fecha1.getDayOfMonth() != fecha2.getDayOfMonth())) {
			funcion1(fecha1, fecha2, sc);
		} else if (fecha1.getYear() != fecha2.getYear()) {

			funcion2(fecha1, fecha2, sc);
		}

	}

	public static void funcion1(LocalDate fecha1, LocalDate fecha2, Scanner sc) {

		int meses = (int) ChronoUnit.MONTHS.between(fecha1, fecha2);

		if (meses < 3) {
			meses = 4;

		}

		String[] nombres = new String[meses];

		System.out.println("Introduce " + meses + " nombres");
		for (int i = 0; i < meses; i++) {
			nombres[i] = sc.nextLine();

		}

		// Comparamos nombre más pequeño

		String peque = nombres[0];
		String alfabetico = nombres[0];
		for (int j = 0; j < nombres.length; j++) {
			if (nombres[j].length() < peque.length()) {
				peque = nombres[j];
			}

			/// alfabeticamente mas pequeño

			if (nombres[j].compareTo(alfabetico) < 0) {
				alfabetico = nombres[j];
			}

		}

		// mostramos solo las vocales de la última
		String vocales = "";
		boolean guion = false;
		String ultimapal = nombres[nombres.length - 1];
		for (int i = 0; i < ultimapal.length(); i++) {
			char letra = ultimapal.charAt(i);

			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A'
					|| letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
				if (guion) {
					vocales += "-";
				}
				vocales += letra;
				guion = true;
			}
		}

		System.out.println("El nombre de tamaño más peque: " + peque);
		System.out.println("El nombre alfabeticamente primero es: " + alfabetico);

		System.out.println(ultimapal + "-> " + vocales);

	}

	public static void funcion2(LocalDate fecha1, LocalDate fecha2, Scanner sc) {

		
		double dias = (int) ChronoUnit.DAYS.between(fecha1,fecha2);
		double meses = (int) ChronoUnit.MONTHS.between(fecha1, fecha2);

	
		
		if(meses != 0) {
			double media = dias/meses;
			System.out.println(media);
		} else {
			System.out.println();
		}
	}
}

	

